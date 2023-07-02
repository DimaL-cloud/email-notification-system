package ua.dimalutsyuk.subscriber;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ua.dimalutsyuk.model.Notification;
import ua.dimalutsyuk.service.EmailService;

@Component
@RequiredArgsConstructor
public class NotificationSubscriber {

    private final EmailService emailService;

    @KafkaListener(
            topics = "notification",
            groupId = "notification-group",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void receiveNotification(Notification notification) {
        emailService.sendEmail(notification);
    }
}
