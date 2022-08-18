fun main() {
    print("Bem vindo ao  Bytebank!")

    var i = 0
    while (i < 5) {
        val titular: String = "Afonso $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.00

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta negativa")
    }
}