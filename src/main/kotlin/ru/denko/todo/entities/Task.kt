package ru.denko.todo.entities

import java.time.LocalDateTime
import javax.persistence.*

/**
 * Задача
 */

@Entity
class Task(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    /**
     * Краткое описание задачи
     */
    @Column(name = "name", nullable = false, length = 100)
    var name: String,

    /**
     * Полное описание задачи
     */
    @Column(name = "description", nullable = true, length = 2000)
    var description: String?,

    /**
     * Дата создания
     */
    @Column(name = "created_on", nullable = false)
    val createdOn: LocalDateTime

)
