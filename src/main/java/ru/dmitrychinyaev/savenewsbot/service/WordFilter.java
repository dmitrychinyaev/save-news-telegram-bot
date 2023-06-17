package ru.dmitrychinyaev.savenewsbot.service;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
public class WordFilter {
    private final String[] testArray = {"хуй", "пизда"};

    public boolean testMat(String text) {
        for (String s : testArray) {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(text.toLowerCase());
            if (matcher.find()) {
                return false;
            }
        }
        return true;
    }
}
