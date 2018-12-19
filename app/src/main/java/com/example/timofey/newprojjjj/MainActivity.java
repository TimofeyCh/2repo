package com.example.timofey.newprojjjj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("helllllo");
            }
        };
        button.setOnClickListener(click);
    }
}
