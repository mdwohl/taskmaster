package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TaskList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        Intent intent = getIntent();
        System.out.println(intent.getStringExtra("name1"));
        System.out.println(intent.getStringExtra("name2"));
    }
}