package com.example.arminvojnikovic.examplebroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Part 1*/
//    public void sendBroadcastMessage(View view){
//        Intent intent = new Intent(this,Receiver.class);
//        sendBroadcast(intent);
//    }

    /*Part 2 */
    public void sendBroadcastMessage(View view){
        Intent intent = new Intent("my_action_bcr");
        sendBroadcast(intent);
    }
}
