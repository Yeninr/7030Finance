package com.example.a7030finances;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GastosActivity extends AppCompatActivity {
    //private Button listarGastosButton; // Novo botão para listar gastos
    private EditText gastosEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        gastosEditText = findViewById(R.id.gastosEditText);
        // Botão para listar gastos
         /* listarGastosButton = findViewById(R.id.listGastosButton);

         listarGastosButton.setOnClickListener(new View.OnClickListener() {

         @Override
          public void onClick(View view) {
                startActivity(new Intent(GastosActivity.this, ListGastosActivity.class));
                Bundle miBundle = new Bundle();

            }


        });*/
    }
    public void Enviar(View view) {
        Intent i = new Intent(GastosActivity.this, ListGastosActivity.class);
        i.putExtra("gasto",gastosEditText.getText().toString());
        startActivity(i);
    }
}