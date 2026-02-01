
abstract class Department {
    abstract val name: String
    abstract fun showGoal()
}
class DevelopmentDepartment : Department() {
    override val name = "Отдел разработки"
    override fun showGoal() {
        println("Цель отдела '$name': Создавать качественные программы")
    }
}
class TestingDepartment : Department() {
    override val name = "Отдел тестирования"
    override fun showGoal() {
        println("Цель отдела '$name': Находить ошибки в программах")
    }
}
fun main() {
    val dev = DevelopmentDepartment()
    val test = TestingDepartment()
    dev.showGoal()
    test.showGoal()
}