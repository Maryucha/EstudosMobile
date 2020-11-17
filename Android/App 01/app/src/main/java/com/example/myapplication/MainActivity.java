package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView msg;
    TextView um;
    TextView dois;
    TextView tres;
    TextView quatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(TextView) findViewById(R.id.mensagem);
        um=(TextView) findViewById(R.id.lbl1);
        dois=(TextView)findViewById(R.id.lbl2);
        tres=(TextView)findViewById(R.id.lbl3);
        quatro=(TextView)findViewById(R.id.lbl4);
    }

    public void clicou(View view) {
        um.setText("Maryucha!");
        dois.setText("Gabriela");
        tres.setText("Adrielly");
        quatro.setText("Melanie");
    }
}
