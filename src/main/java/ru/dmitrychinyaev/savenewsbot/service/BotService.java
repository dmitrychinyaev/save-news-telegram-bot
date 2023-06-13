package ru.dmitrychinyaev.savenewsbot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dmitrychinyaev.savenewsbot.entity.Message;
import ru.dmitrychinyaev.savenewsbot.repository.MessageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BotService {
    private final MessageRepository messageRepository;

    public void saveMessage(Message message){
        messageRepository.save(message);
    }

    public List<Message> showAllMessages(){return messageRepository.findAll();}
    public void deleteMessage(){messageRepository.deleteAll();}
}
