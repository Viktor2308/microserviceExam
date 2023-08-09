package com.example.demo.service;

import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {
    private final Random random = new Random();
    private int max = 100;
    public Question getRandom() {
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Question.builder().question(a + " + " + b + " = ?").answer(String.valueOf(a+b)).build();
    }

}
