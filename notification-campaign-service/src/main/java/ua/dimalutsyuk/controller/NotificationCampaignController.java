package ua.dimalutsyuk.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dimalutsyuk.model.NotificationCampaign;
import ua.dimalutsyuk.service.NotificationService;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationCampaignController {

    private final NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody @Valid NotificationCampaign notificationCampaign) {
        notificationService.sendNotificationCampaign(notificationCampaign);

        return ResponseEntity.ok().build();
    }
}
