package com.example.menucalculamedia30do06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcularMediaActivity extends AppCompatActivity {

    private EditText nota1Valor;
    private EditText nota2Valor;
    private TextView media;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_media);

        nota1Valor = findViewById(R.id.nota1Valor);
        nota2Valor = findViewById(R.id.nota2Valor);
        media = findViewById(R.id.media);
        calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nota1 = Double.parseDouble(nota1Valor.getText().toString());
                double nota2 = Double.parseDouble(nota2Valor.getText().toString());
                media.setText(media.getText().toString() + Double.toString((nota1+nota2)/2));
            }
        });
    }
}
