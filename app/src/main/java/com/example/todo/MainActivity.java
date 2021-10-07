package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.todo.Adapter.ToDoAdapter;
import com.example.todo.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView tasksRecyclerView;
    ToDoAdapter tasksAdapter;
    List<ToDoModel> tasklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasklist = new ArrayList<>();
        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter = new ToDoAdapter(this);
        tasksRecyclerView.setAdapter(tasksAdapter);

        ToDoModel task = new ToDoModel();
        task.setTask("this is a test task");
        task.setStatus(0);
        task.setId(1);

        tasklist.add(task);
        tasklist.add(task);
        tasklist.add(task);
        tasklist.add(task);
        tasklist.add(task);
        tasksAdapter.setTasks(tasklist);
    }
}