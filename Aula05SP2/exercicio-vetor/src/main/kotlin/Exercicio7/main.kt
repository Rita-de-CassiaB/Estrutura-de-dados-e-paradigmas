package Exercicio7

fun main() {
    val diasPorMes = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    println("Boas vindas ao vetor, digite o dia (1 a 31):")
    val dia = readln().toInt()

    println("Digite o mês (1 a 12):")
    val mes = readln().toInt()

    if (dia !in 1..31 || mes !in 1..12) {
        println("Data inválida.Insira um dia que está entre 1 e 31 e um mês que esta entre 1 e 12.")
        return
    }

    var diaAno = dia
    for (i in 0 .. mes - 1) {
        diaAno += diasPorMes[i]
    }

    println("O dia $dia/$mes corresponde ao dia $diaAno do ano.")
}
