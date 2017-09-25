package com.example.arminvojnikovic.examplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Armin Vojnikovic on 2017-03-28.
 */

public class Receiver extends BroadcastReceiver {
    private static final String TAG = Receiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"Hello from 1st Receiver");
        Toast.makeText(context,"Hello from 1st receiver",Toast.LENGTH_LONG).show();

    }
}
