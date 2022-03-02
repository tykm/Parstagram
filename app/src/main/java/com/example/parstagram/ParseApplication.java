package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VjqmOK7bTyMLj5BXSUXVEaqTYpY5uhHQRHBbNy2Q") // should correspond to Application Id env variable
                .clientKey("bGg8c3ep8KsvMz1HH48XWtQh7gJmWHFWctqyVH3B")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
