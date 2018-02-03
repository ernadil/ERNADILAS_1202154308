package com.example.dila.ernadilasukmadinata_1202154308_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class EatbosMenu extends AppCompatActivity {
TextView namaResto, namaMenu, banyakMenu, totalHarga;
private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatbos_menu);

        namaResto = findViewById(R.id.namaresto);
        namaMenu = findViewById(R.id.menu2);
        banyakMenu = findViewById(R.id.jumlah2);
        totalHarga = findViewById(R.id.harga);

        Intent panggil = getIntent();

        String lokasi = panggil.getStringExtra("namaresto");
        String mMenu = panggil.getStringExtra("menu2");
        String mJumlah = panggil.getStringExtra("jumlah2");
        String mtotal = panggil.getStringExtra("harga");

        int hasilHarga = Integer.valueOf(mtotal) * Integer.valueOf(mJumlah);

        namaResto.setText(lokasi);
        namaMenu.setText(mMenu);
        banyakMenu.setText(mJumlah);
        totalHarga.setText(String.valueOf(hasilHarga));

        if (hasilHarga <= uang){
            Toast.makeText(this, "nih lebih murah", Toast.LENGTH_LONG).show();
        }else{
         Toast.makeText(this, "Lebih mahal gituloh", Toast.LENGTH_LONG).show();
        }
    }
}
