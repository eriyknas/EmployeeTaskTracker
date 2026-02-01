data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean = false
)

fun main() {
    val task1 = Task("Уборка", "Убраться в офисе", Priority.LOW)
    val task2 = Task("Отчёт", "Сдать годовой отчёт", Priority.HIGH)
    val task3 = task1.copy()
    println("task1 == task3: ${task1 == task3}")
    val task4 = task1.copy(title = "Генеральная уборка", isCompleted = true)
    println(task4)
    val (title, desc, priority, done) = task2
    println("Задача: $title, Приоритет: $priority")
}