package com.example.evaluacion1_pdm_00189617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00189617.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextn1, mTextn2, mTextn3, mTextn4, mTextn5, mTextn6, mTextn7, mTextn8, mTextn9, mTextUs2, mTextCo2, mTextTotal;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextn1=findViewById(R.id.tv_second_1);
        mTextn2=findViewById(R.id.tv_second_2);
        mTextn3=findViewById(R.id.tv_second_3);
        mTextn4=findViewById(R.id.tv_second_4);
        mTextn5=findViewById(R.id.tv_second_5);
        mTextn6=findViewById(R.id.tv_second_6);
        mTextn7=findViewById(R.id.tv_second_7);
        mTextn8=findViewById(R.id.tv_second_8);
        mTextn9=findViewById(R.id.tv_second_9);
        mTextUs2=findViewById(R.id.second_usuario);
        mTextCo2=findViewById(R.id.second_correo);
        mTextTotal=findViewById(R.id.total);
        mBtn=findViewById(R.id.bt_search);

        Intent mIntent= getIntent();

        if(mIntent!=null){
            mTextn1.setText(mIntent.getStringExtra(AppConstant.Key_num1));

            mTextn2.setText(mIntent.getStringExtra(AppConstant.Key_num2));
            mTextn3.setText(mIntent.getStringExtra(AppConstant.Key_num3));
            mTextn4.setText(mIntent.getStringExtra(AppConstant.Key_num4));
            mTextn5.setText(mIntent.getStringExtra(AppConstant.Key_num5));
            mTextn6.setText(mIntent.getStringExtra(AppConstant.Key_num6));
            mTextn7.setText(mIntent.getStringExtra(AppConstant.Key_num7));
            mTextn8.setText(mIntent.getStringExtra(AppConstant.Key_num8));
            mTextn9.setText(mIntent.getStringExtra(AppConstant.Key_num9));
            mTextUs2.setText(mIntent.getStringExtra(AppConstant.Key_usuario));
            mTextCo2.setText(mIntent.getStringExtra(AppConstant.Key_correo));
            mTextTotal.setText(mIntent.getStringExtra(AppConstant.Key_total));
        }

        mBtn.setOnClickListener(v->{

            String num1=mTextn1.getText().toString();

            String num2=mTextn2.getText().toString();
            String num3=mTextn3.getText().toString();
            String num4=mTextn4.getText().toString();
            String num5=mTextn5.getText().toString();
            String num6=mTextn6.getText().toString();
            String num7=mTextn7.getText().toString();
            String num8=mTextn8.getText().toString();
            String num9=mTextn9.getText().toString();
            String user=mTextUs2.getText().toString();
            String email=mTextCo2.getText().toString();
            String fin=mTextTotal.getText().toString();


            String cadenafin=num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9+"\n"+user+"\n"+email+"\n"+fin+"\n";

            Intent mIntent2=new Intent();
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.putExtra(Intent.EXTRA_TEXT,cadenafin);

            startActivity(mIntent2);

        });

    }
}
