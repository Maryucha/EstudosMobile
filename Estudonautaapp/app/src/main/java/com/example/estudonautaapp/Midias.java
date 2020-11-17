package com.example.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Midias extends AppCompatActivity {
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midias);

        video = findViewById(R.id.video);

        String cam = "android.resource://com.example.estudonautaapp/"+R.raw.estudonauta;
        Uri arq = Uri.parse(cam);
        video.setVideoURI(arq);
        video.start();

    }

    public void clicarVoltar(View view) {
        finish();
    }
}
