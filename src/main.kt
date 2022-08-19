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

    println("Depositando na conta do Alex")
    deposita(contaAlex, valor = 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta do Fran")
    deposita(contaFran, valor = 100.0)
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
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

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    /*
        Referencias, ou seja, espaço reservados na memórian o momento em que definimos em que a conta Mária tinha o valor
        presente da conta João, o João aponta para conta e por consequência a Maria também aponta para Conta(), quando
        alteramos alguma coisa presente do titular acabamos alterando o mesmo objeto, tome cuidado na atribuição pois não
        se trata de uma cópia, mas uma referencia a o espaço da memória
    */

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao // Substitua para Conta(), para que assim não ocorra erro!
    contaMaria.titular = "Maria"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    /*
        Print da classe + hash da alocação de memória, porém se utilizarmos uma instacia com um novo objeto, ele aponta
        para um novo espaço de memoria, mudando o hash.
    */

    println(contaJoao)
    println(contaMaria)
}
