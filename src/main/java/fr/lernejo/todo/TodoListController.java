package fr.lernejo.todo;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {

    private final TodoRepository repository;

    public TodoListController(TodoRepository r) {
        this.repository = r;
    }

    @PostMapping("/api/todo")
    public void addTodo(@RequestBody TodoEntity todo) {
        this.repository.save(todo);
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> getTodoList() {
        return this.repository.findAll();
    }
}
