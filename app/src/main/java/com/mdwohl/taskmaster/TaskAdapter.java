package com.mdwohl.taskmaster;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

//this view holder needs to be created!
//implementing methods adds everything below

//to pass info into adapter, it will need a constructor.

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    ArrayList<Task> tasksForRecycler;
    ClickableActions clickableActions;

    public TaskAdapter(ArrayList<Task> tasksForRecycler, ClickableActions clickableActions){
        this.tasksForRecycler = tasksForRecycler;
        this.clickableActions = clickableActions;

    }
    public static interface ClickableActions{
        public void clickOnRecyclerView(Task task);
    }

    @NonNull
    @Override
    //complete function for building a view holder.
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                //inflate == render for Android
                .inflate(R.layout.fragment_task, parent, false);
        TaskViewHolder taskViewHolder = new TaskViewHolder(view);
        view.setOnClickListener(v ->{
            clickableActions.clickOnRecyclerView(taskViewHolder.task);
        });
        return taskViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.task = tasksForRecycler.get(position);
        ((TextView) holder.fragment.findViewById(R.id.taskTitle)).setText(holder.task.title);
        ((TextView) holder.fragment.findViewById(R.id.taskBody)).setText(holder.task.body);
        ((TextView) holder.fragment.findViewById(R.id.taskState)).setText(holder.task.state);


//        holder.view is the fragment. I can edit any of the text in the fragment.
//        dynamic content -- text happens here. We use the position in an array to refer to this.

    }

    @Override
    public int getItemCount() {
        return tasksForRecycler.size();
        //item count will need to be the size of the array that contains data
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder{
        Task task;
        View fragment;

        public TaskViewHolder(@NonNull View itemView) {
            //in an overridden constructor, super always needs to be first called
            super(itemView);
            fragment = itemView;


        }
    }
}
