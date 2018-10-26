package com.example.temperratureconverter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeC = findViewById(R.id.changeCtoF);


        changeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Celsius = findViewById(R.id.editText);
                TextView text = findViewById(R.id.textView);

                int c = Integer.parseInt(Celsius.getText().toString());

                int f = 0;
                f = c*9/5+32;

                String fa = String.valueOf(f);
                text.setText(fa);
            }
        });


        Button changeF = findViewById(R.id.changeFtoC);

        changeF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Fahrenheit = findViewById(R.id.editText);
                TextView text = findViewById(R.id.textView);

                int f = Integer.parseInt(Fahrenheit.getText().toString());

                int c = 0;
                c = (f-32)*5/9;

                String cel = String.valueOf(c);
                text.setText(cel);
            }
        });

    }
}
