package ua.dimalutsyuk.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class NotificationCampaign {

    @NotNull(message = "Emails are mandatory")
    private List<String> emails;

    @NotNull(message = "Subject is mandatory")
    private String subject;

    @NotNull(message = "Text is mandatory")
    private String text;
}
