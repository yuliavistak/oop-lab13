package org.example.Task1;

import java.time.LocalDate;


public class MyFacebookUser implements User {
    public FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getLastActiveTime().toLocalDate();
    };  
}