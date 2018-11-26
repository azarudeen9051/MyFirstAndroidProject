package com.genix.demoapp.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.genix.demoapp.R;
import com.genix.demoapp.second.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private static int REQ_CODE = 12345;

    private TextView value;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText userName = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        Button login = findViewById(R.id.loginBtn);
        value = findViewById(R.id.value);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // For 1:1 pass data
                /*Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("UserName", userName.getText().toString());
                i.putExtra("Password", password.getText().toString());
                startActivity(i);*/

                // For Bi-Directional Pass data
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("UserName", userName.getText().toString());
                i.putExtra("Password", password.getText().toString());
                startActivityForResult(i, REQ_CODE);
            }
        });

        //Log.d("Demo MainActivity", "OnCreate Called...");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (requestCode == REQ_CODE && resultCode == Activity.RESULT_OK) {
                String secValue = data.getStringExtra("VALUE");
                value.setText(secValue);
            }
        }
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        Log.d("Demo MainActivity", "OnStart Called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Demo MainActivity", "OnResume Called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Demo MainActivity", "OnPause Called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Demo MainActivity", "OnStop Called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Demo MainActivity", "OnDestroy Called...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Demo MainActivity", "OnRestart Called...");
    }*/
}
