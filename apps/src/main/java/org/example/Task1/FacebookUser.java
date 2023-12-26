package org.example.Task1;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FacebookUser {
    private String email;
    private String country;
    private LocalDateTime lastActiveTime;

}