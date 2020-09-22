package dev.lucasliet.firstandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaOutraTela(View view) {
        EditText mensagemEditText = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEditText.getText().toString();
        //Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        startActivity(
            new Intent(this, ExibeMensagemActivity.class)
                .putExtra("mensagem",mensagem)
        );
    }
}