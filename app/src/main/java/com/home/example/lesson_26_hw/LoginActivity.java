package com.home.example.lesson_26_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etl, etp;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Добро пожаловать!", Toast.LENGTH_SHORT).show();
            }
        });

        etl = (EditText) findViewById(R.id.etl);
        etp = (EditText) findViewById(R.id.etp);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setEnabled(false);

        EditText[] edList = {etl, etp};
        CustomTextWatcher textWatcher = new CustomTextWatcher (edList, btn1);
        for (EditText editText : edList) editText.addTextChangedListener(textWatcher);
        }
}