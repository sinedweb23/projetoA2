package br.com.denis.meuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraIMCActivity extends AppCompatActivity {

    EditText etPeso, etAltura;
    Button btnCalcular, btnLimpar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);

        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);
        tvResultado = findViewById(R.id.tvResultado);

        // Cálculo de IMC
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.parseDouble(etPeso.getText().toString());
                double altura = Double.parseDouble(etAltura.getText().toString());

                double imc = peso / (altura * altura);
                String classificacao;

                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc >= 18.5 && imc < 24.9) {
                    classificacao = "Peso normal";
                } else if (imc >= 25 && imc < 29.9) {
                    classificacao = "Sobrepeso";
                } else {
                    classificacao = "Obesidade";
                }

                tvResultado.setText("IMC: " + imc + " - " + classificacao);
            }
        });

        // Limpar campos
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPeso.setText("");
                etAltura.setText("");
                tvResultado.setText("Resultado IMC");
            }
        });
    }
}
