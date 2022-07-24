package ru.denko.todo.services;

import org.springframework.stereotype.Service
import ru.denko.todo.entities.Task
import ru.denko.todo.models.TaskModel
import ru.denko.todo.repos.TaskRepository
import java.time.Clock
import java.time.LocalDateTime

@Service
class TaskService(
    private val repository: TaskRepository
) {

    fun getTask(id: Long): TaskModel =
        repository.findById(id)
            .map { task -> TaskModel(task.name, task.description) }
            .orElseThrow()

    fun getAllTasks(): List<TaskModel> =
        repository.findAll()
            .map { task -> TaskModel(task.name, task.description) }
            .toList()

    fun createTask(model: TaskModel) {
        val task = Task(
            name = model.name,
            description = model.description,
            createdOn = LocalDateTime.now(Clock.systemUTC())
        )

        repository.save(task)
    }

}
