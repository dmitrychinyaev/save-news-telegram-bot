package ru.dmitrychinyaev.savenewsbot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dmitrychinyaev.savenewsbot.entity.BotCommons;
import ru.dmitrychinyaev.savenewsbot.entity.Message;
import ru.dmitrychinyaev.savenewsbot.repository.MessageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BotService {
    private final MessageRepository messageRepository;
    private final WordFilter wordFilter;

    public String saveMessage(Message message) {
        if (wordFilter.testMat(message.getText())) {
            messageRepository.save(message);
            return BotCommons.SUCCESS_SAVE;
        }else {
            return BotCommons.SWEARING_MESSAGE;
        }
    }

    public String showAllMessages(){
        List<Message> messageList = messageRepository.findAll();
        StringBuilder stringBuilder = new StringBuilder();
        for (Message s:messageList ) {
            stringBuilder.append(s.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public void deleteMessage(){messageRepository.deleteAll();}
}
