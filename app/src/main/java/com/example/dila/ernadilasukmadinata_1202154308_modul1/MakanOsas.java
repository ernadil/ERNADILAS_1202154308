package com.example.dila.ernadilasukmadinata_1202154308_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakanOsas extends AppCompatActivity {

    EditText namamenu, jumlahmenu;
    Button btneatbus, btnabnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan_osas);

        namamenu = findViewById(R.id.nama);
        jumlahmenu = findViewById(R.id.jumlah);
        btneatbus = findViewById(R.id.eatbus);
        btnabnormal = findViewById(R.id.abnormal);

        btneatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent (MakanOsas.this, EatbosMenu.class);
                move.putExtra("namaresto", "EATBUS");
                move.putExtra("menu2", namamenu.getText().toString());
                move.putExtra("jumlah2", jumlahmenu.getText().toString());
                move.putExtra("harga", "50000");
                startActivity(move);
            }
        }
        );

        btnabnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent (MakanOsas.this, EatbosMenu.class);
                move.putExtra("namaresto", "ABNORMAL");
                move.putExtra("menu2", namamenu.getText().toString());
                move.putExtra("jumlah2", jumlahmenu.getText().toString());
                move.putExtra("harga", "30000");
                startActivity(move);
            }
        });
    }
}
