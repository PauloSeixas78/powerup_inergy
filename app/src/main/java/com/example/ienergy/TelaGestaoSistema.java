package com.example.ienergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaGestaoSistema extends AppCompatActivity {

    Button configuracoes;
    Button dispositivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_gestao_sistema);

        configuracoes = findViewById(R.id.buttonSistemaGestaoConfiguracoes);
        dispositivos = findViewById(R.id.buttonGestaoSistemaDispositivos);

        configuracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaGestaoSistema.this,TelaConfiguracao.class));
            }
        });

        dispositivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaGestaoSistema.this, TelaListaDispositivos.class));
            }
        });
    }
}