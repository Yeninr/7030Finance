package com.example.a7030finances;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class ListGastosActivity extends AppCompatActivity {
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_gastos);
        String gasto = getIntent().getStringExtra("gasto");
        if(gasto==""){
            gasto = "0";
        }
        // Simule uma lista de gastos (você pode obter esses dados de onde preferir)
        List<String> gastos = new ArrayList<>();
        gastos.add("Gasto 1: $" + gasto+".00");
        // Configure um ArrayAdapter para exibir a lista de gastos em um ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gastos);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
    public void Volver(View view) {
        Intent i = new Intent(ListGastosActivity.this, PrincipalActividad.class);
        startActivity(i);
    }
}