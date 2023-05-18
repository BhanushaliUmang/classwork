package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;

@RestController
@RequestMapping(value="/todoPackage")
public class TodoController {
    
    @Autowired
    TodoService todoService;
    
    @GetMapping(value = "/getAllTodos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @GetMapping(value = "/getTodosByStatus")
    public List<Todo> getTodosByStatus(@RequestParam String status)
    {
        return todoService.getTodosByUserStatus(status);
    }

    @RequestMapping(value = "/getTodoById/{id}",method = RequestMethod.GET)
    public Todo getTodoById(@PathVariable String id)
    {
        return todoService.getTodoBasedOnId(id);
    }

    

    @PostMapping(value = "/addTodo")
    public String addTodo(@RequestBody Todo todo)
    {
       return  todoService.addMyTodo(todo);
    }

    

    @DeleteMapping(value = "/deleteTodoById/{id}")
    public String deleteTodoById(@PathVariable String id)
    {
        return todoService.removeTodoById(id);
    }

    

    @PutMapping(value = "/updateTodoById/{id}/{status}")
    public String updateTodoStatusById(@PathVariable String id, @PathVariable String status)
    {
        return todoService.updateTodoStatusById(id,status);
    }

}
