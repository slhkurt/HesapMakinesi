package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tsonuc;
    Button bCikar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        tsonuc = findViewById(R.id.tsonuc);
        bCikar = findViewById(R.id.button6);
        bCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = Integer.parseInt(e1.getText().toString());
                int s2 = Integer.parseInt(e2.getText().toString());
                int kalan = s1-s2;
                tsonuc.setText(String.valueOf(kalan));
            }
        });
    }

    public void topla(View v){
        int s1 = Integer.parseInt(e1.getText().toString());
        int s2 = Integer.parseInt(e2.getText().toString());
        int sonuc = s1 + s2;
        tsonuc.setText(String.valueOf(sonuc));
    }

    /*public void Çıkar(View v){
        int s1 = Integer.parseInt(e1.getText().toString());
        int s2 = Integer.parseInt(e2.getText().toString());
        int sonuc = s1 - s2;
        tsonuc.setText(String.valueOf(sonuc));
    }*/

    public void Çarp(View v){
        int s1 = Integer.parseInt(e1.getText().toString());
        int s2 = Integer.parseInt(e2.getText().toString());
        int sonuc = s1 * s2;
        tsonuc.setText(String.valueOf(sonuc));
    }

    public void Böl(View v){
        int s1 = Integer.parseInt(e1.getText().toString());
        int s2 = Integer.parseInt(e2.getText().toString());
        int sonuc = s1 / s2;
        tsonuc.setText(String.valueOf(sonuc));
    }
}
