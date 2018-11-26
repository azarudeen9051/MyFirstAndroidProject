package com.genix.demoapp.second;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.genix.demoapp.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String username = getIntent().getStringExtra("UserName");
        String password = getIntent().getStringExtra("Password");
        TextView textUsername = findViewById(R.id.username);
        TextView textPassword = findViewById(R.id.password);
        Button secondBtn = findViewById(R.id.secondBtn);
        textUsername.setText(username);
        textPassword.setText(password);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("VALUE", "Main Activity Received in Second Activity. Here is the second Activity value");
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });
    }
}
