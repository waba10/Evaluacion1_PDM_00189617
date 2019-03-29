package com.example.evaluacion1_pdm_00189617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00189617.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private TextView mText1, mText2, mText3, mText4, mText5, mText6, mText7, mText8, mText9;
    private EditText mUser, mEmail;
    private Button mButtonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText1=findViewById(R.id.tv_1);
        mText2=findViewById(R.id.tv_2);
        mText3=findViewById(R.id.tv_3);
        mText4=findViewById(R.id.tv_4);
        mText5=findViewById(R.id.tv_5);
        mText6=findViewById(R.id.tv_6);
        mText7=findViewById(R.id.tv_7);
        mText8=findViewById(R.id.tv_8);
        mText9=findViewById(R.id.tv_9);
        mUser=findViewById(R.id.et_usuario);
        mEmail=findViewById(R.id.et_email);
        mButtonSend=findViewById(R.id.btn_send);

        mButtonSend.setOnClickListener(v->{

            String numero1=mText1.getText().toString();
            String numero2=mText2.getText().toString();
            String numero3=mText3.getText().toString();
            String numero4=mText4.getText().toString();
            String numero5=mText5.getText().toString();
            String numero6=mText6.getText().toString();
            String numero7=mText7.getText().toString();
            String numero8=mText8.getText().toString();
            String numero9=mText9.getText().toString();
            String usuario=mUser.getText().toString();
            String correo=mEmail.getText().toString();

            int aux1=Integer.parseInt(numero1);

            int aux2=Integer.parseInt(numero2);

            int aux3=Integer.parseInt(numero3);

            int aux4=Integer.parseInt(numero4);

            int aux5=Integer.parseInt(numero5);

            int aux6=Integer.parseInt(numero6);

            int aux7=Integer.parseInt(numero7);

            int aux8=Integer.parseInt(numero8);

            int aux9=Integer.parseInt(numero9);


            int total=aux1+aux2+aux3+aux4+aux5+aux6+aux7+aux8+aux9;

            String cadena= total+"";



            Intent mIntent=new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstant.Key_num1, numero1);
            mIntent.putExtra(AppConstant.Key_num2, numero2);
            mIntent.putExtra(AppConstant.Key_num3, numero3);
            mIntent.putExtra(AppConstant.Key_num4, numero4);
            mIntent.putExtra(AppConstant.Key_num5, numero5);
            mIntent.putExtra(AppConstant.Key_num6, numero6);
            mIntent.putExtra(AppConstant.Key_num7, numero7);
            mIntent.putExtra(AppConstant.Key_num8, numero8);
            mIntent.putExtra(AppConstant.Key_num9, numero9);
            mIntent.putExtra(AppConstant.Key_usuario, usuario);
            mIntent.putExtra(AppConstant.Key_correo, correo);
            mIntent.putExtra(AppConstant.Key_total,cadena);
            startActivity(mIntent);




        });

        mText1.setOnClickListener(v->{
            String numero=mText1.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText1.setText(aux+"");



        });
        mText2.setOnClickListener(v->{
            String numero=mText2.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText2.setText(aux+"");



        });
        mText3.setOnClickListener(v->{
            String numero=mText3.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText3.setText(aux+"");



        });
        mText4.setOnClickListener(v->{
            String numero=mText4.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText4.setText(aux+"");



        });
        mText5.setOnClickListener(v->{
            String numero=mText5.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText5.setText(aux+"");



        });
        mText6.setOnClickListener(v->{
            String numero=mText6.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText6.setText(aux+"");



        });
        mText7.setOnClickListener(v->{
            String numero=mText7.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText7.setText(aux+"");



        });
        mText8.setOnClickListener(v->{
            String numero=mText8.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText8.setText(aux+"");



        });
        mText9.setOnClickListener(v->{
            String numero=mText9.getText().toString();
            int aux=Integer.parseInt(numero);
            aux++;

            mText9.setText(aux+"");



        });

    }
}
