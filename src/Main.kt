fun main() {
    // Запрос ввода от пользователя
    println("Введите слова через пробел:")
    val input = readLine() ?: return

    // Разделяем строку на список слов
    val words = input.split(" ")

    // Используем Map для группировки слов по одинаковым буквам
    val groupedWords = words.groupBy { word -> word.toCharArray().sorted().joinToString("") }

    // Вывод сгруппированных слов
    println("Сгруппированные слова:")
    for ((_, group) in groupedWords) {
        println(group.joinToString(", "))
    }
}
