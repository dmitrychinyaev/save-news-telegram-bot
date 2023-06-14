package ru.dmitrychinyaev.savenewsbot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Min;

@Getter
@AllArgsConstructor
public class Message {
    private Integer date;
    @Min(10)
    //TODO Посмотреть значения и что возвращается если меньше символов
    private String authorName;
    private String text;

    @Override
    public String toString() {
        return "Прислано: " + authorName + "\n" +
                "Дата: " + date + "\n" +
                text + "\n";
    }
}
