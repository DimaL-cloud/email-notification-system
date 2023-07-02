package ua.dimalutsyuk.model;

import lombok.Data;

@Data
public class Notification {

    private String email;

    private String subject;

    private String text;
}
