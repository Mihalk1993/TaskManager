package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TodosTests {

    private Todos todos;
    private final String task1 = "Task#A";
    private final String task2 = "Task#B";

    @BeforeEach
    public void initialize() {
        todos = new Todos();
    }

    @Test
    public void addTaskTest() {
//  arrange
        List<String> expectedList = new ArrayList<>();
        expectedList.add(task1);
//  act
        todos.addTask(task1);
//  assert
        Assertions.assertIterableEquals(expectedList, todos.taskList);
    }

    @Test
    public void removeTaskTest() {
//  arrange
        List<String> expectedList = new ArrayList<>();
        expectedList.add(task1);
//  act
        todos.addTask(task1);
        todos.addTask(task2);
        todos.removeTask(task2);
//  assert
        Assertions.assertIterableEquals(expectedList, todos.taskList);
    }

    @Test
    public void getAllTasksTest() {
//  arrange
        String expected = task1 + " " + task2;
//  act
        todos.addTask(task1);
        todos.addTask(task2);
        String actual = todos.getAllTasks();
//  assert
        Assertions.assertEquals(expected, actual);
    }
}
