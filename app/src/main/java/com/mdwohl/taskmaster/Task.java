package com.mdwohl.taskmaster;

public class Task {
    public Task(String title, String body, String state) {
        this.title = title;
        this.body = body;
        this.state = state;
    }

    String title;
    String body;
    String state;
}
