package ru.netology.javacore;

import java.util.*;

public class Todos {
    protected List<String> taskList = new ArrayList<>();

    public void addTask(String task) {
        taskList.add(task);
    }

    public void removeTask(String task) {
        taskList.remove(task);
    }

    public String getAllTasks() {
        Collections.sort(taskList);
        StringBuilder list = new StringBuilder();
        for (String task : taskList) {
            list.append(task).append(" ");
        }
        return list.toString().trim();
    }

}
