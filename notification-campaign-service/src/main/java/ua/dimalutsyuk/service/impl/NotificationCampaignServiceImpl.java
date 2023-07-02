package ua.dimalutsyuk.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.dimalutsyuk.exception.NotificationCampaignFailedException;
import ua.dimalutsyuk.model.Notification;
import ua.dimalutsyuk.model.NotificationCampaign;
import ua.dimalutsyuk.publisher.NotificationPublisher;
import ua.dimalutsyuk.service.NotificationService;

@Service
@RequiredArgsConstructor
public class NotificationCampaignServiceImpl implements NotificationService {

    private final NotificationPublisher notificationPublisher;

    @Override
    public void sendNotificationCampaign(NotificationCampaign notificationCampaign) {
        try {
            notificationCampaign
                    .getEmails()
                    .forEach(email -> {
                        notificationPublisher.sendNotification(new Notification(
                                email, notificationCampaign.getSubject(), notificationCampaign.getText()
                        ));
                    });
        } catch (Exception e) {
            throw new NotificationCampaignFailedException();
        }
    }
}
