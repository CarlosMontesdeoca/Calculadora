package com.example.calculadora;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, resp;
    Button sumabtn, restabtn, multibtn, divbtn, cosbtn, senbtn, tanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1Txt);
        num2 = (EditText) findViewById(R.id.num2Txt);
        resp = (EditText) findViewById(R.id.respTxt);
        sumabtn = (Button) findViewById(R.id.restaBtn);
        sumabtn.setOnClickListener((View.OnClickListener) this);
        restabtn = (Button) findViewById(R.id.restaBtn);
        restabtn.setOnClickListener((View.OnClickListener) this);
        multibtn = (Button) findViewById(R.id.multBtn);
        multibtn.setOnClickListener((View.OnClickListener) this);
        divbtn = (Button) findViewById(R.id.diviBtn);
        divbtn.setOnClickListener((View.OnClickListener) this);
    }

    public void onClickSuma(View v){
        double val1 = Double.parseDouble(num1.getText().toString());
        double val2 = Double.parseDouble(num2.getText().toString());

        double add = val1 + val2;

        resp.setText( "" + add );
    }

    public void onClickResta(View v){
        double val1 = Double.parseDouble(num1.getText().toString());
        double val2 = Double.parseDouble(num2.getText().toString());

        double add = val1 - val2;

        resp.setText( "" + add );
    }

    public void onClickMultiplicacion(View v){
        double val1 = Double.parseDouble(num1.getText().toString());
        double val2 = Double.parseDouble(num2.getText().toString());

        double add = val1 * val2;

        resp.setText( "" + add );
    }

    public void onClickDivicion(View v){
        double val1 = Double.parseDouble(num1.getText().toString());
        double val2 = Double.parseDouble(num2.getText().toString());

        if ( val2 == 0 ){
            resp.setText( "Error");
        }else {
            double add = val1 / val2;
            resp.setText("" + add);
        }
    }

    public void onClickTan(View v){
        double val1 = Double.parseDouble(num1.getText().toString());

        double add = Math.tan(val1);

        resp.setText( "" + add );
    }

    public void onClickCos(View v){
        double val1 = Double.parseDouble(num1.getText().toString());

        double add = Math.cos(val1);

        resp.setText( "" + add );
    }

    public void onClickSen(View v){
        double val1 = Double.parseDouble(num1.getText().toString());

        double add = Math.sin(val1);

        resp.setText( "" + add );
    }
}