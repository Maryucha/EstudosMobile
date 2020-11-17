package com.example.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cursos extends AppCompatActivity {
    Intent navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clicarVoltar(View view) {
        finish();
    }

    public void cursoPortugol(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/programacao-basica/"));
        startActivity(navegador);
    }

    public void cursoAndroid(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/android-studio/"));
        startActivity(navegador);
    }

    public void cursoKotlin(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/kotlin/"));
        startActivity(navegador);
    }

    public void cursoC(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/linguagem-c/"));
        startActivity(navegador);
    }

    public void cursoCsharp(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/c/"));
        startActivity(navegador);
    }

    public void cursoPhp(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/php-mysql/"));
        startActivity(navegador);
    }

    public void cursoVideo(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/producao-de-videos/"));
        startActivity(navegador);
    }
}
