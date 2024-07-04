package ru.gb;


import ru.gb.elqueue.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        TicketNumberGenerator numGen = context.getBean(TicketNumberGenerator.class);
        InfBoard infBoard = context.getBean(InfBoard.class);

        for (int i = 0; i < 5; i++) {
            System.out.println("Экземпляр объекта 'TicketNumberGenerator' = " + numGen);
            System.out.println("Экземпляр объекта 'infBoard' = " + infBoard);
            System.out.println(infBoard.newTicket());;
        }
    }
}
