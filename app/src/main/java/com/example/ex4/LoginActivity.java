package com.example.ex4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.InetAddress;
import java.net.Socket;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ShowMessage(View view){
        EditText ip = (EditText)findViewById(R.id.ip_text);
        EditText port= (EditText)findViewById(R.id.port_text);
        try {//here you must put your computer's IP address.
            String st = "4324";
            InetAddress serverAddr = InetAddress.getByName(ip.getText().toString());
            //create a socket to make the connection with the server
            Socket socket= new Socket(serverAddr, Integer.parseInt(port.getText().toString()));
        } catch (Exception e){
            Log.e("TCP", "C: Error", e);
        }
        Intent intent=new Intent(this,JoystickActivity.class);
        String msg=ip.getText().toString();intent.putExtra("message",msg);
        startActivity(intent);
    }
}
