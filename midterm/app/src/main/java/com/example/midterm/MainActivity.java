package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    PasswordValidator passwordValidator = new PasswordValidator();

    public void checkMatch(View v)
    {
        Log.w("MainActivity", "v = " + v);
        EditText password1 = findViewById(R.id.password1);
        EditText password2 = findViewById(R.id.password2);
        String password1String = password1.getText().toString();
        String password2String = password2.getText().toString();
        TextView matchTextView = (TextView) findViewById(R.id.isValidView);

        if(passwordValidator.doPasswordsMatch(password1String, password2String))
        {
            matchTextView.setText("PASSWORDS MATCH");
            matchTextView.setBackgroundColor(GREEN);
        }
        else
        {
            matchTextView.setText("PASSWORDS DO NOT MATCH");
            matchTextView.setBackgroundColor(RED);
        }
    }
}
