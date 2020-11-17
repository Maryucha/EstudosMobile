package com.example.escola10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {
EditText edtN1, edtN2;
TextView txtM, txtResp;
LinearLayout layResp;
ImageView imgSit;
InputMethodManager imm;

//fbc
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN1 = findViewById(R.id.editN1);
        edtN2 = findViewById(R.id.editN2);
        txtM = findViewById(R.id.txtMedia);
        txtResp = findViewById(R.id.txtResp);
        layResp = findViewById(R.id.layRespostas);
        imgSit = findViewById(R.id.imgSit);
        //layrespostas invisivel
        layResp.setVisibility(View.INVISIBLE);
        imm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
    }
    public void calcular(View view) {
        //MSG ERRO para caixa vazia
        boolean ok = true;
        if(edtN1.getText().toString().trim().isEmpty()){
            ok=false;
            edtN1.setError(getString(R.string.msgErro));
        }
        if(edtN2.getText().toString().trim().isEmpty()){
            ok=false;
            edtN2.setError(getString(R.string.msgErro));
        }
        if(ok) {
            imm.hideSoftInputFromWindow(edtN1.getWindowToken(),0);
            //deixar LayRespostas visivel
            layResp.setVisibility(View.VISIBLE);
            //CONTA
            float n1 = Float.parseFloat(edtN1.getText().toString());
            float n2 = Float.parseFloat(edtN2.getText().toString());
            float media;
            media = (n1 + n2) / 2;
            //MOSTRAR MEDIA
            txtM.setText(String.format("%.1f", media));
            //RESULTADO SITUAÇÃO
            if (media < 5) {
                txtResp.setText(getString(R.string.strReprovado));
                txtResp.setTextColor(getResources().getColor(R.color.corReprovado));
                Toast.makeText(getApplicationContext(),getString(R.string.strMsgRep),Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojireprovado);
            } else if (media < 7) {
                txtResp.setText(getString(R.string.strRecuperacao));
                txtResp.setTextColor(getResources().getColor(R.color.corExame));
                Toast.makeText(getApplicationContext(),getString(R.string.strMsgRecu),Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojirecuperacao);
            } else {
                txtResp.setText(getString(R.string.strAprovado));
                txtResp.setTextColor(getResources().getColor(R.color.corAprovado));
                Toast.makeText(getApplicationContext(),getString(R.string.strMsgApro),Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojiaprovado);
            }
        }
    }
}
