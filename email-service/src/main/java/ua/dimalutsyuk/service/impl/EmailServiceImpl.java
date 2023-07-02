package ua.dimalutsyuk.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ua.dimalutsyuk.model.Notification;
import ua.dimalutsyuk.service.EmailService;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender emailSender;

    @Override
    @Async
    public void sendEmail(Notification notification) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(notification.getEmail());
        message.setSubject(notification.getSubject());
        message.setText(notification.getText());

        emailSender.send(message);
    }
}
