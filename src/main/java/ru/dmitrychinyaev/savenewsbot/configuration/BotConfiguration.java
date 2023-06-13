package ru.dmitrychinyaev.savenewsbot.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfiguration {
    @Value("${bot.name}")
    private String botname;
    @Value("${bot.token}")
    private String token;
}
