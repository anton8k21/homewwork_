var second: Int = 65

fun main(args: Array<String>) {
    agoToText()

}

fun day(days: Int): String {
    if (days > 1 && days < 2) {
        return "сегодня"
    } else if (days >= 2 && days < 3) {
        return "вчера"
    } else
        return "давно"
}

fun hour(hours: Int): String {
    if (hours % 100 == 11) {
        return "$hours часов назад"
    } else if (hours % 10 == 1) {
        return "$hours час назад"
    } else if (hours % 10 > 1 && hours % 10 < 5) {
        return "$hours часа назад"
    } else
        return "$hours часов назад"
}

fun minut(minute: Int): String {
    if (minute == 0) {
        return "недавно"
    } else if (minute % 100 == 11) {
        return "$minute минут назад"
    } else if (minute % 10 == 1) {
        return "$minute минуту назад"
    } else if (minute % 10 > 1 && minute % 10 < 5) {
        return "$minute минуты назад"
    } else
        return "$minute минут назад"
}


fun calculationMinutes(second: Int): Boolean {
    return second < 3600
}

fun calculationHour(second: Int): Boolean {
    return second >= 3600 && second < 86400
}

fun calculationDay(second: Int): Boolean {
    return second >= 86400 && second < 259200
}

fun agoToText() {
    when {
        calculationMinutes(second) -> println("Был(а) в сети " + minut(second / 60))
        calculationHour(second) -> println("Был(а) в сети " + hour(second / 3600))
        calculationDay(second) -> println("Был(а) в сети " + day(second / 86400))
    }
}