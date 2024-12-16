package ru.springApp.algoritm;


import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class GreetingService {


    public Greeting getGreeting(String content) {
        int[] numbers = parseAndSortNumbers(content);
        return new  Greeting(String.valueOf(numbers[1]));
    }

    private int[] parseAndSortNumbers(String content) {
        String[] input = content.split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        return numbers;
    }
}
