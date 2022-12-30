fun main(args: Array<String>) {
    while (true) {
        print("Введите команду: ")
        val reader = Scanner(System.`in`)
        val command = reader.next()

        if (command == "+") {
            number += 1
        }
        if (command == "-") {
            number -= 1
        }
        if (command == "="){
            println(number)
        }
        if (command == "0") {
            break
        }
    }
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