package ru.dmitrychinyaev.savenewsbot.bot;

import lombok.RequiredArgsConstructor;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.dmitrychinyaev.savenewsbot.configuration.BotConfiguration;
import ru.dmitrychinyaev.savenewsbot.entity.Message;
import ru.dmitrychinyaev.savenewsbot.service.BotService;
import ru.dmitrychinyaev.savenewsbot.entity.BotCommons;

@RequiredArgsConstructor
public class Bot extends TelegramLongPollingBot {

    private final BotConfiguration botConfiguration;
    private final BotService botService;

    @Override
    public String getBotUsername() {
        return botConfiguration.getBotname();
    }

    @Override
    public String getBotToken() {
        return botConfiguration.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            Integer dateOfMessage = update.getMessage().getDate();
            String username = update.getMessage().getChat().getUserName();
            String textToSave = update.getMessage().getText();

            Message messageToSave = new Message(dateOfMessage, username, textToSave);
            botService.saveMessage(messageToSave);

            switch (messageText) {
                case BotCommons.COMMAND_START -> {

                }
                case BotCommons.COMMAND_HELP -> {
                    System.out.println();
                }
                case BotCommons.COMMAND_SHOW_MESSAGES -> {
                    //TODO request password
                }
                case "password" -> {
                    //TODO show all messages
                }
                case "delete all messages" -> {
                    //TODO write delete all messages + password
                }
                case "delete all messages + password" -> {
                    //TODO
                }
            }
        }
    }

    private void sendMessage(long chatId, String textToSend) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));
        sendMessage.setText(textToSend);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
