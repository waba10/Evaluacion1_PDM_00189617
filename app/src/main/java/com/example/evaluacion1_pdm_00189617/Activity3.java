package com.example.evaluacion1_pdm_00189617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private TextView mTextFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        mTextFinal=findViewById(R.id.tv_final);

        Intent mIntent2=getIntent();
        if(mIntent2!=null){
            mTextFinal.setText(((Intent) mIntent2).getStringExtra(Intent.EXTRA_TEXT));

        }
    }
}
