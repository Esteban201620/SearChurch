package com.udistrital.marlonestebanosoriorico.searchurch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private Button Searchurch;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        Controlador.inicializarBD();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Searchurch=(Button)findViewById(R.id.searchurch);
        Searchurch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent =new Intent(MainActivity.this,Ubicacion.class);
                startActivity(intent);
            }
        });
    }
}
