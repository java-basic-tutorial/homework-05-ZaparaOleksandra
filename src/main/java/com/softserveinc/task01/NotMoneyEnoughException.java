package com.softserveinc.task01;

public class NotMoneyEnoughException extends Exception{
    public NotMoneyEnoughException() {
    }

    public NotMoneyEnoughException(String message) {
        super(message);
    }
}
