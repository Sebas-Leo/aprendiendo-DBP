package com.example.demo.service;

import com.example.demo.model.Task;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }
    @PostConstruct
    public void init() {
        tasks.add(new Task(1L, "Aprender Spring", false));
        tasks.add(new Task(2L, "Hacer el reto", true));
    }
}