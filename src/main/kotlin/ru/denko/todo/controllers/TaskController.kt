package ru.denko.todo.controllers

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*
import ru.denko.todo.models.TaskModel
import ru.denko.todo.services.TaskService

@Tag(name = "Task")
@RestController
@RequestMapping(path = ["/task"])
class TaskController(
    private val service: TaskService
) {

    @GetMapping("/all")
    fun getAllTasks(): List<TaskModel> = service.getAllTasks()

    @GetMapping("/{id}")
    fun getTask(@PathVariable id: String): TaskModel = service.getTask(id.toLong())

    @PostMapping("/create")
    fun createTask(@RequestBody taskModel: TaskModel) = service.createTask(taskModel)

}
