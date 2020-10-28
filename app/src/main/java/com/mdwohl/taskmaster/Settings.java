package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button saveUsername = findViewById(R.id.saveUsernameButton);

        saveUsername.setOnClickListener((view) -> {
            TextView username = findViewById(R.id.enterUsernameField);
            Context context = getApplicationContext();

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor preferenceEditor = preferences.edit();
            preferenceEditor.putString("username", username.getText().toString() + "'s tasks:");
            preferenceEditor.apply();

            Intent goHome = new Intent(Settings.this, MainActivity.class);
            Settings.this.startActivity(goHome);
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, "Username Saved", duration);
            toast.show();

        });
    }
}