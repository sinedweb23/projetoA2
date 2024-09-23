package br.com.denis.meuapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ApresentacaoActivity extends AppCompatActivity {

    TextView tvDadosAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        tvDadosAluno = findViewById(R.id.tvDadosAluno);
        tvDadosAluno.setText("Nome: Denis Augusto\nCurso: Análise e Desenvolvimento de Sistemas\nRGM: 32995628\nSemestre: 4º\nDisciplina: Desenvolvimento Mobile");
    }
}
