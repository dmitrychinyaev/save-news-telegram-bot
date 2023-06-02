package ru.dmitrychinyaev.savenewsbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dmitrychinyaev.savenewsbot.entity.Message;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
