package ru.dmitrychinyaev.savenewsbot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class Message {
    private Integer date;
    private String authorName;
    @Size(min = 10, max = 200, message = "Сообщение должно быть состоять из более 10 символов, но менее 200")
    private String text;

    @Override
    public String toString() {
        return "Прислано: " + authorName + "\n" +
                "Дата: " + date + "\n" +
                text + "\n";
    }
}
