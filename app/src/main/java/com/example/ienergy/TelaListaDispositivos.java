package com.example.ienergy;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaListaDispositivos extends AppCompatActivity {

    DatabaseHelper helper;
    ArrayList<Dispositivos> dispositivos;
    ListView listadispositivos;
    Button novodispositivo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lista_dispositivos);
        listadispositivos = findViewById(R.id.listviewListaDispositivos);
        helper = new DatabaseHelper(this);
        dispositivos = new ArrayList<Dispositivos>();

        String [] dispositivosexemplo = new String[]{"Dispositivo: Ventilador \nComodo: quarto \nEstado: ligado","Dispositivo: lampada \nComodo: sala \nEstado:desligada"};

        ArrayAdapter <String> listadispositivosadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dispositivosexemplo);

        listadispositivos.setAdapter(listadispositivosadapter);




    }

    private String [] lerDispositivos(){
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT _id,nome,estado,comodo from dispositivos",null);
        cursor.moveToFirst();
        String [] dispositivoslidos = new String[cursor.getCount()];
        for(int item = 0; item <cursor.getCount();item++){
            dispositivos.add(new Dispositivos(cursor.getLong(0),cursor.getString(1),cursor.getInt(2),cursor.getString(3)));
            dispositivoslidos[item] = cursor.getString(1);
            cursor.moveToNext();
        }
        cursor.close();

        return dispositivoslidos;
    }
}