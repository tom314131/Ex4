package com.example.ex4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ShowMessage(View view){
        EditText editText = (EditText)findViewById(R.id.port_text);
        Intent intent=new Intent(this,JoystickActivity.class);
        String msg=editText.getText().toString();intent.putExtra("message",msg);
        startActivity(intent);
    }
}
