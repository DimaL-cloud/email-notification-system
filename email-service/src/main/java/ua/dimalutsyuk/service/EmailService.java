package ua.dimalutsyuk.service;

import ua.dimalutsyuk.model.Notification;

public interface EmailService {

    void sendEmail(Notification notification);
}
