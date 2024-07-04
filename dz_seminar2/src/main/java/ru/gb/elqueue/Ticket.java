package ru.gb.elqueue;

import java.time.LocalDateTime;

public class Ticket {
    private String number;
    private LocalDateTime createdAt;
    private String visitarget;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getVisitarget() {
        return visitarget;
    }

    public void setVisitarget(String visitarget) {
        this.visitarget = visitarget;
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------");
        return String.format(
                "%s \nTime: %s \nTarget: %s \n \n", number, createdAt, visitarget);
    }
}
