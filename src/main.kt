fun main() {
    println("Bem vindo ao  Bytebank!")

    val contaAlex = Conta()
    contaAlex.titular = ("Alex")
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = ("Fran")
    contaFran.numero = 1001
    contaFran.saldo = 300.0

//    Print das informações referentes as valores atribuidos nas variaveis utilizando classes.
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
}

class Conta () {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
    for (i in 5 downTo 1) {
        val titular: String = "Afonso $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.00

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta negativa")
    }
}