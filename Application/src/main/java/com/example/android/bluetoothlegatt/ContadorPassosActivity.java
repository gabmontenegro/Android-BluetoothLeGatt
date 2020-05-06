package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import Utils.GifImageView;

public class ContadorPassosActivity extends Activity
{

    private EditText passos;

    private ImageView fotoGif;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_passos);

        passos = (EditText) findViewById(R.id.nPassos);
        fotoGif = (ImageView) findViewById(R.id.imageViewGif);

        Glide.with(this)
                .load(R.drawable.stickman) // aqui é teu gif
                .asGif()
                .into(fotoGif);


        registerReceiver(broadcastReceiver, new IntentFilter("EXTRA_PASSOS"));
        disableEditText(passos);
        passos.setGravity(Gravity.CENTER);

    }

    BroadcastReceiver broadcastReceiver =  new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            Bundle b = intent.getExtras();

            String message = b.getString("message");

            displayData(message);

        }
    };

    protected void onPause()
    {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
    }

    private void displayData(String message)
    {
        passos.setText(message.substring(2));
        //disableEditText(passos);
    }

    private void disableEditText(EditText editText) {
        editText.setFocusable(false);
        editText.setEnabled(false);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setBackgroundColor(Color.TRANSPARENT);
    }
}
