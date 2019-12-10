package Printable;

import java.util.ArrayList;
import java.util.List;

public class Todo implements Printable {
    private String task;
    private String priority;
    private boolean isDone;
    private List<Todo> todos;

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
        this.todos = new ArrayList<Todo>();
    }

    public void addToDo(Todo todo) {
        this.todos.add(todo);
    }

    @Override
    public void printAllFields() {
        System.out.println(this.task + " | Priority " + this.priority + " | Done: " + this.isDone);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
