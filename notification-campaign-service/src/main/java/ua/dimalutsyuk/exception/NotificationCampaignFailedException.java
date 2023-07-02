package ua.dimalutsyuk.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public class NotificationCampaignFailedException extends RuntimeException {
    private final HttpStatusCode errorCode = HttpStatus.BAD_REQUEST;

    public NotificationCampaignFailedException() {
        super("Failed to send notification campaign");
    }
}
