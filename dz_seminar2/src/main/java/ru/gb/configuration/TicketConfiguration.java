package ru.gb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gb.elqueue.Ticket;

@Configuration
public class TicketConfiguration {

    @Bean
    public Ticket ticket() {
        return new Ticket();
    }
}
