package br.com.denis.meuapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraCombustivelActivity extends AppCompatActivity {

    EditText etGasolina, etAlcool;
    RadioGroup radioGroup;
    TextView tvResultadoCombustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_combustivel);

        etGasolina = findViewById(R.id.etGasolina);
        etAlcool = findViewById(R.id.etAlcool);
        radioGroup = findViewById(R.id.radioGroup);
        tvResultadoCombustivel = findViewById(R.id.tvResultadoCombustivel);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            double precoGasolina = Double.parseDouble(etGasolina.getText().toString());
            double precoAlcool = Double.parseDouble(etAlcool.getText().toString());
            double relacao = precoAlcool / precoGasolina;

            if (checkedId == R.id.radioGasolina) {
                if (relacao > 0.7) {
                    tvResultadoCombustivel.setText("Vale a pena usar Gasolina.");
                } else {
                    tvResultadoCombustivel.setText("Gasolina está com uma relação abaixo de 70% do Álcool.");
                }
            } else if (checkedId == R.id.radioAlcool) {
                if (relacao <= 0.7) {
                    tvResultadoCombustivel.setText("Vale a pena usar Álcool.");
                } else {
                    tvResultadoCombustivel.setText("Álcool está acima de 70% da Gasolina.");
                }
            }
        });
    }
}
