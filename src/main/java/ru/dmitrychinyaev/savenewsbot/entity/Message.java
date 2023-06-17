package ru.dmitrychinyaev.savenewsbot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "botMessages")
@Getter
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String date;
    private String authorName;
    @Size(min = 10, max = 200, message = "Сообщение должно быть состоять из более 10 символов, но менее 200")
    private String text;

    @Override
    public String toString() {
        return "Прислано: " + authorName + "\n" +
                "Дата: " + date + "\n" +
                text + "\n";
    }

    public Message(String date, String authorName, String text) {
        this.date = date;
        this.authorName = authorName;
        this.text = text;
    }
}
