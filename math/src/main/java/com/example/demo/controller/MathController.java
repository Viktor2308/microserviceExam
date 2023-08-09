package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MathController {
    @Autowired
    private MathService mathService;

    @GetMapping("/questions")
    public List<Question> getRandomQuestion(@RequestParam int amount) {
        List<Question> questionList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            questionList.add(mathService.getRandom());
        }
        return questionList;
    }

}
