package fr.lernejo.todo;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

    @RestController
    public class TodoListController {

        private final ArrayList<Todo> todoList;

        public TodoListController() {
            this.todoList = new ArrayList<Todo>();
        }

        @PostMapping("/api/todo")
        public void addTodo (@RequestParam("message") String message, @RequestParam("author") String author){
            this.todoList.add(new Todo(message, author));
            System.out.println(todoList);
        }

        @GetMapping("/api/todo")
        public ArrayList<Todo> getTodos(){
            return this.todoList;
        }
}
