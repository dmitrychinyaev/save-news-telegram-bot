package ru.dmitrychinyaev.savenewsbot.entity;

public class BotCommons {
    //commands
    public static final String COMMAND_START = "/start";
    public static final String COMMAND_HELP = "/help";
    public static final String COMMAND_SHOW_MESSAGES = "/show";

    public static final String COMMAND_DELETE_MESSAGES = "/delete";

    //text
    public static final String START_TEXT = "Здравствуйте, %s! Если вы увидели какое-нибудь происшествие," +
            "напишите сюда и мы проанализируем вашу информацию. Пожалуйста, ваше сообщение должно содержать" +
            "короткий адрес происшествия, например, 'На улице Кирова...' ";
    public static final String HELP_TEXT = "Чтобы сообщить об увиденном событии, достаточно просто " +
            "написать сообщение в удобной для вас форме Пожалуйста, ваше сообщение должно содержать " +
            "короткий адрес происшествия, например, 'На улице Кирова...' ";
    //password
    public static final String REQUEST_PASSWORD_TEXT = "Пожалуйста, введите пароль для просмотра сообщений";
    public static final String REQUEST_DELETE_MESSAGES_PASSWORD = "Пожалуйста, введите пароль " +
            "для удаления всех сообщений";
    public static final String BASIC_PASSWORD_MESSAGES = "111";
    public static final String BASIC_PASSWORD_DELETE = "1212";
    //answer
    public static final String SUCCESS_DELETE = "Удаление завершено";
    public static final String SUCCESS_SAVE = "Спасибо за новость! Ваше сообщение сохранено!";
    public static final String SWEARING_MESSAGE = "В Вашем сообщении присутствует ненормативная лексика! Сообщение не сохранено";

}
