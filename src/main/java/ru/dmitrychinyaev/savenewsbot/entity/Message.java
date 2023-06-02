package ru.dmitrychinyaev.savenewsbot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Message {
    private Integer date;
    private String authorName;
    private String text;
}
