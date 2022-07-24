package ru.denko.todo.controllers

import org.springframework.web.bind.annotation.*
import ru.denko.todo.models.TaskModel
import ru.denko.todo.services.TaskService

@RestController
class TaskController(
    private val service: TaskService
) {

    @GetMapping("/tasks")
    fun getAllTasks(): List<TaskModel> = service.getAllTasks()

    @GetMapping("/task/{id}")
    fun getTask(@PathVariable id: String): TaskModel = service.getTask(id.toLong())

    @PostMapping("/task/create")
    fun createTask(@RequestBody taskModel: TaskModel) = service.createTask(taskModel)

}
