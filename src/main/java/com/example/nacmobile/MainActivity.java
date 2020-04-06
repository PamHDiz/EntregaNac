package com.example.nacmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;
import java.time.temporal.TemporalUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browserAmericanas(View view){
        Intent americanasIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.americanas.com.br"));
        startActivity(americanasIntent);
    }

    public void browserNetShoes(View view){
        Intent netShoesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.netshoes.com.br"));
        startActivity(netShoesIntent);
    }

    public void browserMercadoLivre(View view){
        Intent MercadoLivreIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mercadolivre.com.br"));
        startActivity(MercadoLivreIntent);
    }

    public void onAluno(View view){

        EditText txtAluno =findViewById(R.id.txtAluno);

        Intent intent = new Intent(this, TelaResposta.class);

        startActivity(intent);
    }
}
