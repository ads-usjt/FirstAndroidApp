package dev.lucasliet.firstandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExibeMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        TextView mensagemTextView = findViewById(R.id.mensagemTextView);
        Intent origemIntent = getIntent();
        mensagemTextView.setText(
                origemIntent.getStringExtra("mensagem")
        );
    }
}