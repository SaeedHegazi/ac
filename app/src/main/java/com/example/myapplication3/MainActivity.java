package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isOn = true;
    private int mode = 1; // 1=cool 2=heat
    private TextView tvm;
    private int temp = 24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvm = findViewById(R.id.tvm);

    }


    public void checkStatos(View view) {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }

    public void checkMode(View view) {
        if (isOn == true) {
            if (mode == 1) {
                mode = 2;
                tvm.setText("Heat");

            } else {
                mode = 1;
                tvm.setText("Cool");
            }
        }
    }

    public void checkPlus(View view) {
        if (isOn == true) {
            if (temp < 30) {
                temp++;
                tvm.setText(Integer.toString(temp));
            }
        }
    }

    public void checkMinus(View view) {
        if (isOn == true) {
            if (temp > 16) {
                temp--;
                tvm.setText(Integer.toString(temp));
            }
        }
    }

}
