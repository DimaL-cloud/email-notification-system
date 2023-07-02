package ua.dimalutsyuk.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification {

    private String email;

    private String subject;

    private String text;
}
