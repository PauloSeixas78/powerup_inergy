package com.example.ienergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText senha;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.editTextMainUsuario);
        senha = findViewById(R.id.editTextMainSenha);
        entrar = findViewById(R.id.buttonMainEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("admin".equals(usuario.getText().toString())&&"1234".equals(senha.getText().toString()))
                {
                    startActivity(new Intent(MainActivity.this, TelaGestaoSistema.class));
                }else{
                    Toast.makeText(MainActivity.this,"Usuario ou senha incorretos",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}