package com.mdwohl.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        Button addTaskButton = findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener((view) -> {
            TextView taskName = findViewById(R.id.inputTask);
            TextView taskDescription = findViewById(R.id.inputDescription);
            Context context = getApplicationContext();


            String taskNameString = taskName.getText().toString();
            String taskDescriptionString = taskDescription.getText().toString();
            String text = taskNameString + " " + taskDescriptionString;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        });
    }
}