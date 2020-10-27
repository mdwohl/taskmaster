package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button taskButton = findViewById(R.id.addTaskButton);
        taskButton.setOnClickListener((view) -> {
            System.out.println("clicked");
            //Intent: the way Android moves
            Intent intent = new Intent(MainActivity.this, AddTask.class);
//            intent.putExtra("name1", "elwood");
//            intent.putExtra("name2", "blanco");
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
    }
}