package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button saveUsername = findViewById(R.id.saveUsernameButton);
        saveUsername.setOnClickListener((view) -> {
            TextView username = findViewById(R.id.usernameField);
            Context context = getApplicationContext();


            String usernameString = username.getText().toString();
            String text = usernameString;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        });
    }
}