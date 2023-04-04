package com.mobile.calculodosalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnNovoSalario;
    public EditText textSalario;
    public TextView textResultado;
    public RadioButton rbtValor1, rbtValor2, rbtValor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNovoSalario = findViewById(R.id.btnNovoSalario);
        textSalario = findViewById(R.id.textSalario);
        rbtValor1 = findViewById(R.id.rbtValor1);
        rbtValor2 = findViewById(R.id.rbtValor2);
        rbtValor3 = findViewById(R.id.rbtValor3);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularNovoSalario(View view){
        double novoSalario;
        if (textSalario.getText().toString().matches("") ||  textSalario.getText().toString().trim().isEmpty() || Integer.parseInt(textSalario.getText().toString()) <= 0 ){
            Toast.makeText(this, "Erro: Insira um salário válido!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (rbtValor1.isChecked()){
            novoSalario = Double.parseDouble(textSalario.getText().toString()) * 1.4;
            textResultado.setText("R$ " + String.format("%.2f", novoSalario));
        }
        if (rbtValor2.isChecked()){
            novoSalario = Double.parseDouble(textSalario.getText().toString()) * 1.45;
            textResultado.setText("R$ " + String.format("%.2f", novoSalario));
        }
        if (rbtValor3.isChecked()){
            novoSalario = Double.parseDouble(textSalario.getText().toString()) * 1.5;
            textResultado.setText("R$ " + String.format("%.2f", novoSalario));
        }else{
            Toast.makeText(this, "Erro: Selecione uma das opções!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}