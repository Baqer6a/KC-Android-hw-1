package com.example.amb_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TV1 = findViewById(R.id.TV1);
        TextView TV2 = findViewById(R.id.TV2);
        EditText ETO1 = findViewById(R.id.ETO1);
        EditText ETO2 = findViewById(R.id.ETO2);
        EditText ETO3 = findViewById(R.id.ETO3);
        EditText ETO4 = findViewById(R.id.ETO4);
        Button B1 = findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int e1=Integer.parseInt(ETO1.getText().toString());
                int e2=Integer.parseInt(ETO2.getText().toString());
                int e3=Integer.parseInt(ETO3.getText().toString());
                int e4=Integer.parseInt(ETO4.getText().toString());
                int result = e1+e2+e3+e4 ;
                TV2.setText(String.valueOf(result)); }
        });
    }
}