package com.example.dan.buttontest;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Dan on 9/23/2015.
 */
public class Button2 extends MainActivity implements RadioGroup.OnCheckedChangeListener{

    static int a = 0;
    TextView textOut;
    EditText textIn;
    RadioGroup gravityG,styleG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button2);

        textOut = (TextView) findViewById(R.id.tvChange);
        textIn = (EditText) findViewById(R.id.editText1);
        gravityG = (RadioGroup) findViewById(R.id.rgGravity);
        styleG = (RadioGroup) findViewById(R.id.rgStyle);
        Button gen = (Button) findViewById(R.id.buttonGenerate);

        gravityG.setOnCheckedChangeListener(this);
        styleG.setOnCheckedChangeListener(this);

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textOut.setText(textIn.getText());
            }
        });

    }

    @Override
    // in this case we are not using groups
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rbLeft:
                textOut.setGravity(Gravity.LEFT);
                break;
            case R.id.rbCenter:
                textOut.setGravity(Gravity.CENTER);
                break;
            case R.id.rbRight:
                textOut.setGravity(Gravity.RIGHT);
                break;
            case R.id.rbNormal:
                textOut.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL), Typeface.NORMAL);
                break;
            case R.id.rbBold:
                textOut.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD);
                break;
            case R.id.rbItalic:
                textOut.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
                break;
        }
    }
}
