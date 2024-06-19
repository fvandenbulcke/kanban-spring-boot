package fr.lille.ippon.challenge.kanban.service;

import fr.lille.ippon.challenge.kanban.domain.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task postTask(Task task) {
        tasks.add(task);
        return task;
    }

    public Task updateState(int id, Task.State state){
        Task taskToUpdate = tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .get();

        tasks.remove(taskToUpdate);

        taskToUpdate.setState(state);

        tasks.add(taskToUpdate);

        return taskToUpdate;
    }
}
