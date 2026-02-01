
interface ReportGenerator {
    fun generateReport(): String
}
class EmployeeWithReport(
    val name: String,
    val position: String
) : ReportGenerator {

    override fun generateReport(): String {
        return "Отчёт по сотруднику:\nИмя: $name\nДолжность: $position"
    }
}
class DevelopmentDepartmentWithReport : ReportGenerator {
    val name = "Отдел разработки"

    override fun generateReport(): String {
        return "Отчёт по отделу:\nНазвание: $name\nЗадача: Разработка ПО"
    }
}
fun showPolymorphism() {
    val reports: List<ReportGenerator> = listOf(
        EmployeeWithReport("Анна Сидорова", "Дизайнер"),
        DevelopmentDepartmentWithReport()
    )
    for (report in reports) {
        println(report.generateReport())
    }
}