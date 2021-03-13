package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("987Njz9pFskmXOUlXmdxsr16EDfuZY2DcN7czv25")
                .clientKey("52L6U2AyEh8iZxUCTH1EmdfHzgePnaMBQffwOLfE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
