package com.example.simplegcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by evin on 4/25/16.
 */
public class MyGcmListenerService extends GcmListenerService {

    private static final String TAG = "MyGcmListenerTAG_";

    @Override
    public void onMessageReceived(String from, Bundle data) {

        String message = data.getString("message");

        Log.d(TAG, "From: " + from);
        Log.d(TAG, "Message: " + message);
    }
}

