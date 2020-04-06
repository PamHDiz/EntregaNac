package com.example.nacmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaResposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resposta);

        Intent intent = getIntent();

        TextView txtAluno = findViewById(R.id.txtAluno);

    }
}
