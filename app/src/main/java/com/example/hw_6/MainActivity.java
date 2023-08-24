package com.example.hw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText login = findViewById(R.id.edit_login);
        EditText password = findViewById(R.id.edit_password);
        Button button= findViewById(R.id.button_sign);
        TextView textView2 = findViewById(R.id.text_view2);


       login.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
           }

           @Override
           public void onTextChanged(CharSequence s, int i, int i1, int i2) {
               if(s.length()>0){
                   button.setBackgroundColor(getResources().getColor(R.color.orange));
               }else{
                   button.setBackgroundColor(getResources().getColor(R.color.gray));

               }

           }

           @Override
           public void afterTextChanged(Editable editable) {
           }
       });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT).show();
                    login.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);

                }else{
                    Toast.makeText(MainActivity.this,"Неправильный логин или пароль",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}