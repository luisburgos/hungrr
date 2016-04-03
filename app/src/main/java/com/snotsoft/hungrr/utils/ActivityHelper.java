package com.snotsoft.hungrr.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.snotsoft.hungrr.domain.User;
import com.snotsoft.hungrr.login.LoginActivity;
import com.snotsoft.hungrr.signup.SignUpActivity;

/**
 * Created by luisburgos on 30/03/16.
 */
public class ActivityHelper {

    public static void begin(Activity activity, Class classTo) {
        Intent intent = new Intent().setClass(activity, classTo);
        activity.startActivity(intent);
    }

    public static void sendTo(Activity activity, Class classTo) {
        Intent intent = new Intent().setClass(activity, classTo);
        activity.finish();
        activity.startActivity(intent);
    }

}
