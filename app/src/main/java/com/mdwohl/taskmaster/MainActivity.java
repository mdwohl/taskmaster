package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        TextView username = findViewById(R.id.displayUsernameMain);
        username.setText(preferences.getString("username", "Go to Settings to create username"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button taskButton = findViewById(R.id.addTaskButton);
        taskButton.setOnClickListener((view) -> {
            System.out.println("clicked");
            //Intent: the way Android moves
            Intent intent = new Intent(MainActivity.this, AddTask.class);
            MainActivity.this.startActivity(intent);
        });
//
        Button allTaskButton = findViewById(R.id.allTaskButton);
        allTaskButton.setOnClickListener((view) ->{
//            TextView name = findViewById(R.id.allTaskButton);
            Intent intent = new Intent(MainActivity.this, TaskList.class);
            System.out.println(allTaskButton.getText());
            MainActivity.this.startActivity(intent);

        });

        Button waterPlantButton = findViewById(R.id.waterPlantButton);
        waterPlantButton.setOnClickListener((view) ->{
            Intent intent = new Intent(MainActivity.this, TaskDetail.class);
            intent.putExtra("task", "Water Plant");
            MainActivity.this.startActivity(intent);
        });

        Button feedCatButton = findViewById(R.id.feedCatButton);
        feedCatButton.setOnClickListener((view) ->{
            Intent intent = new Intent(MainActivity.this, TaskDetail.class);
            intent.putExtra("task","Feed Cat");
            MainActivity.this.startActivity(intent);
        });

        Button walkDogButton = findViewById(R.id.walkDogButton);
        walkDogButton.setOnClickListener((view) ->{
            Intent intent = new Intent(MainActivity.this, TaskDetail.class);
            intent.putExtra("task","Walk Dog");
            MainActivity.this.startActivity(intent);
        });

        Button settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener((view) ->{
            Intent intent = new Intent(MainActivity.this, Settings.class);
            MainActivity.this.startActivity(intent);
        });

//        Intent intent = getIntent();
//        String username = intent.getStringExtra("username");
//        intent.putExtra("task", username);
//        TextView currentTaskText = findViewById(R.id.usernameTasks);
//        currentTaskText.setText(username + "'s tasks");
    }
}