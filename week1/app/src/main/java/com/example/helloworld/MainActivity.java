package com.example.helloworld;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnToast,btnCount ;
    public TextView txtCount;
    public int number = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab= getSupportActionBar();
        ab.hide();

        btnToast = (Button) findViewById(R.id.btnToast);
        btnCount =(Button) findViewById(R.id.btnCount);
        txtCount = (TextView) findViewById(R.id.txtCount);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_SHORT).show();
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                if(number>100){
                    number = 0 ;
                    Toast.makeText(MainActivity.this, "Resetting Number to 0", Toast.LENGTH_SHORT).show();
                }
                txtCount.setText(Integer.toString(number));

            }
        });

    }




}
