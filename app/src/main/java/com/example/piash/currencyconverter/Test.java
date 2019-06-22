package com.example.piash.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by PIASH on 07-Mar-18.
 */

public class Test extends AppCompatActivity implements View.OnClickListener {

    EditText e1;
    RadioButton r1, r2, CtoF;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.e1);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        CtoF = (RadioButton) findViewById(R.id.r2);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try {
            if (e1.getText().equals(null)) {
                Toast.makeText(this, "Enter Value", Toast.LENGTH_SHORT).show();
            } else {
                Double value = new Double(e1.getText().toString());

                if (CtoF.isChecked()) {
                    value = Convert.CtoF(value);
                } else {
                    value = Convert.CtoF(value);
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }

    public static class Convert {
        public static double CtoF(Double F) {
            return (0);
        }
    }
}
