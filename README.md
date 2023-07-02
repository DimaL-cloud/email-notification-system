# email-notification-system
A service for sending an email campaign to group of emails

## Stack 💻
Java, Spring Boot, Lombok, Kafka

## System design diagram 💡

![Безымянный-2023-07-02-0112](https://github.com/DimaL-cloud/email-notification-system/assets/78265212/51cd50d0-f38d-4b5b-9980-ed859316c9e2)

## API
* POST /api/v1/notifications
```
{
    "emails": [
        "example1@gmail.com",
        "example2@gmail.com",
        "example3@gmail.com",
    ],
    "subject": "Invitation to the event",
    "text": "You are invited to the event on 3:00 p.m."
}
```
