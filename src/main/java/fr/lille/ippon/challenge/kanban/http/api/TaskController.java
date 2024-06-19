package fr.lille.ippon.challenge.kanban.http.api;

import java.util.List;

import fr.lille.ippon.challenge.kanban.domain.Task;
import fr.lille.ippon.challenge.kanban.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task postTask(@RequestBody Task task) {
        return taskService.postTask(task);
    }

    @PutMapping("/{id}")
    public Task updateState(@PathVariable int id, @RequestBody Task.State state){
        return taskService.updateState(id, state);
    }
    
}
