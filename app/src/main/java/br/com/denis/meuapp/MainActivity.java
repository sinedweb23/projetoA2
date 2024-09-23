package br.com.denis.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCalculadoraIMC, btnCalculadoraCombustivel, btnApresentacao, btnFecharApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando os botões
        btnCalculadoraIMC = findViewById(R.id.btnCalculadoraIMC);
        btnCalculadoraCombustivel = findViewById(R.id.btnCalculadoraCombustivel);
        btnApresentacao = findViewById(R.id.btnApresentacao);
        btnFecharApp = findViewById(R.id.btnFecharApp);

        // Botão para chamar a Calculadora de IMC
        btnCalculadoraIMC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculadoraIMCActivity.class);
            startActivity(intent);
        });

        // Botão para chamar a Calculadora de Combustível
        btnCalculadoraCombustivel.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculadoraCombustivelActivity.class);
            startActivity(intent);
        });

        // Botão para chamar a Apresentação
        btnApresentacao.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ApresentacaoActivity.class);
            startActivity(intent);
        });

        // Botão para fechar o app
        btnFecharApp.setOnClickListener(v -> finishAffinity());  // Fecha todas as activities do app
    }
}
