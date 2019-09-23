package com.example.android.lesson_1;

import android.app.Application;

import com.firebase.client.Firebase;

public class Lesson_1 extends Application {
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
