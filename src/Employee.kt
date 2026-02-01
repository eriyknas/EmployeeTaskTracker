//class Employee(
//    private val fullName: String,
//    private val position: String,
//    private var salary: Int,
//    private var experience: Int
//) {
//    fun getName() = fullName
//    fun getPosition() = position
//    fun getSalary() = salary
//    fun getExperience() = experience
//
//    fun setSalary(newSalary: Int) {
//        if (newSalary < 0) {
//            println("Ошибка: зарплата не может быть отрицательной")
//        } else {
//            salary = newSalary
//        }
//    }
//
//    fun setExperience(newExp: Int) {
//        if (newExp > 50) {
//            println("Предупреждение: опыт ограничен 50 годами")
//            experience = 50
//        } else if (newExp < 0) {
//            experience = 0
//        } else {
//            experience = newExp
//        }
//    }
//
//    fun printInfo() {
//        println("Сотрудник: $fullName")
//        println("Должность: $position")
//        println("Зарплата: $salary руб.")
//        println("Опыт: $experience лет")
//    }
//}
//fun main() {
//    val rez = Employee("Иван Петров", "Программист", 50000, 3)
//    rez.setSalary(-1000)
//    rez.setSalary(60000)
//    rez.setExperience(60)
//    rez.setExperience(10)
//
//    rez.printInfo()
//}

class Employee(
    val name: String,
    val position: String
) {
    private var currentTask: Task? = null
    fun assignTask(task: Task) {
        if (currentTask != null && !currentTask!!.isCompleted) {
            println("Ошибка: у сотрудника уже есть задача")
        } else {
            currentTask = task
            println("Сотруднику $name назначена задача: ${task.title}")
        }
    }
    fun completeTask() {
        currentTask?.isCompleted = true
        println("Задача завершена")
    }
    fun printStatus() {
        println("Сотрудник: $name")
        currentTask?.let {
            println("Текущая задача: ${it.title}")
            println("Выполнена: ${it.isCompleted}")
        } ?: println("Задач нет")
    }
}
fun main() {
    val emp = Employee("Петр Иванов", "Менеджер")
    val task1 = Task("План", "Составить план на месяц", Priority.MEDIUM)
    val task2 = Task("Встреча", "Провести собрание", Priority.HIGH)
    emp.assignTask(task1)
    emp.completeTask()
    emp.assignTask(task2)
    emp.printStatus()
    println("\n=== ОТЧЁТЫ ===")
    showPolymorphism()
}