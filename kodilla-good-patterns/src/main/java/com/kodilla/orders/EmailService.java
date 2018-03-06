package com.kodilla.orders;

public class EmailService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Wysłano powiadomienie dla użytkownika " + user.getName());

    }
}
