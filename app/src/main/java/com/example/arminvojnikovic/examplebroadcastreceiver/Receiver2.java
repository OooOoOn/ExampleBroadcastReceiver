package com.example.arminvojnikovic.examplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Armin Vojnikovic on 2017-03-28.
 */

public class Receiver2 extends BroadcastReceiver {
    private static final String TAG = Receiver2.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"Hello from 2st Receiver");
        Toast.makeText(context,"Hello from 2nd Receiver",Toast.LENGTH_LONG).show();

    }
}
