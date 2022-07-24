package ru.denko.todo.models

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Task")
class TaskModel(
    val name: String,
    var description: String?
)
