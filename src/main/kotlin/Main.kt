fun main(args: Array<String>) {
fun menu() {
    println("Возможные команды:")
    println("- Увеличить на 1 (+)")
    println("- Уменьшить на 1 (-)")
    println("- Отобразить текущее значение (=)")
    println("Остановить программу (0)")
}

fun counter(command: String, number: Int): Int {
    var num = number
    if (command == "+") {
        num += 1
    }
    if (command == "-") {
        num -= 1
    }
    if (command == "="){
        println(num)
    }
    return num
}
fun scanner(): String {
    val reader = Scanner(System.`in`)
    return reader.next()
}