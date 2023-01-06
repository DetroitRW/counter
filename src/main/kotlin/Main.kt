import java.util.Scanner

fun main(args: Array<String>) {
    val counter = Counter()

    while (true) {
        menu()

        when(readCommand()) {
            "+" -> counter.increment()
            "-" -> counter.decrement()
            "=" -> println(counter.getValue())
        }
    }
}

fun menu() {
    println("Возможные команды:")
    println("- Увеличить на 1 (+)")
    println("- Уменьшить на 1 (-)")
    println("- Отобразить текущее значение (=)")
    println("Остановить программу (0)")
    print("Введите команду: ")
}



fun readCommand(): String {
    return Scanner(System.`in`).next()

}

class Counter {
    private var value: Int = 0
    fun getValue(): Int {
        return value
    }

    fun increment() {
        value +=1
    }

    fun decrement() {
        value -=1
    }
}