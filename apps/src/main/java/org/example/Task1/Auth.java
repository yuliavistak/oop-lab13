package org.example.Task1;

public class Auth {
    public User login() {
        int n = 0;
        if (n > 0) {
            return new MyFacebookUser(new FacebookUser());
        } else {
            return new MyTwitterUser(new TwitterUser());
        }
    }

    public void processData(User user) {
        String country = user.getCountry();
    }
}
