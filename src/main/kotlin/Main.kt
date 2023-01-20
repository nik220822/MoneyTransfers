fun main() {
    println("Введите сумму вашего перевода в рублях:")
    val amount = readLine()!!.toInt()
    var commission: Double = 0.0075 * amount
    if (commission < 35) {
        commission = 35.0
    }
    println("Коммиссия в рублях будет: $commission рублей")
}