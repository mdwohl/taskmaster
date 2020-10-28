package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TaskDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        Intent intent = getIntent();
        String currentTask = intent.getStringExtra("task");
        TextView currentTaskText = findViewById(R.id.taskDetailText);
        currentTaskText.setText(currentTask);

    }
}