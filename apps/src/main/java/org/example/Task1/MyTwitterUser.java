package org.example.Task1;

import java.time.LocalDate;

public class MyTwitterUser implements User{
    public TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return twitterUser.getLastActiveTime().toLocalDate();
    };  
}