class Employee(
    private val fullName: String,
    private val position: String,
    private var salary: Int,
    private var experience: Int
) {
    fun getName() = fullName
    fun getPosition() = position
    fun getSalary() = salary
    fun getExperience() = experience

    fun setSalary(newSalary: Int) {
        if (newSalary < 0) {
            println("Ошибка: зарплата не может быть отрицательной")
        } else {
            salary = newSalary
        }
    }

    fun setExperience(newExp: Int) {
        if (newExp > 50) {
            println("Предупреждение: опыт ограничен 50 годами")
            experience = 50
        } else if (newExp < 0) {
            experience = 0
        } else {
            experience = newExp
        }
    }

    fun printInfo() {
        println("Сотрудник: $fullName")
        println("Должность: $position")
        println("Зарплата: $salary руб.")
        println("Опыт: $experience лет")
    }
}
fun main() {
    val rez = Employee("Иван Петров", "Программист", 50000, 3)
    rez.setSalary(-1000)
    rez.setSalary(60000)
    rez.setExperience(60)
    rez.setExperience(10)

    rez.printInfo()
}