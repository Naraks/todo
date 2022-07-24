package ru.denko.todo.repos

import org.springframework.data.repository.CrudRepository
import ru.denko.todo.entities.Task

interface TaskRepository: CrudRepository<Task, Long> {

}
