package com.example.piash.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by PIASH on 07-Mar-18.
 */

public class Test2 extends AppCompatActivity implements View.OnClickListener {

    EditText e1;
    RadioButton r1, r2, CtoF;
    TextView tvv;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        tvv = findViewById(R.id.tvv);

        //b1.setOnClickListener(this);

        LinearLayout ln = findViewById(R.id.in);

        ln.setOrientation(LinearLayout.HORIZONTAL);

        tvv.setText(Html.fromHtml("<h2>Bangladesh Cricket Team</h2><br><p>Al Amin Hussain</p>" +
                "<br><p>Imrul Kayes</p><br><p>Mahmudullah</p><br><p>Mashrafe Mortaza</p>"));
    }

    @Override
    public void onClick(View v) {


    }

    public void click(View view) {

    }

    public static class Convert {
        public static double CtoF(Double F) {
            return (0);
        }
    }
}
