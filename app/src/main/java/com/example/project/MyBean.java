package com.example.project;

import android.app.Activity;

public class MyBean {
    private String str;
    private Activity activity;

    public MyBean(String str, Activity activity) {
        this.str = str;
        this.activity = activity;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
