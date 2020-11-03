package fr.lille.ippon.challenge.kanban.http.api;

import java.util.List;

import fr.lille.ippon.challenge.kanban.domain.Task;

public class TaskController {

    public List<Task> getTasks() {
        // TODO faire fonctionner. Refactorer ?
        return List.of(new Task("my first task"));
    }
    
}
