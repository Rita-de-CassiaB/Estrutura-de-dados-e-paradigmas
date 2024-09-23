package Exercicio4

fun main() {
    val valores = Array(10) { 0 }

    for (i in valores.indices) {
        println("Boas Vindas ao Vetor, digite o ${i + 1}º valor inteiro:")
        valores[i] = readln().toInt()
    }

    println("Digite um número para verificar frequência:")
    val numeroPesquisa = readln().toInt()

    val frequencia = valores.count { it == numeroPesquisa }


    if (frequencia > 0) {
        println("O número $numeroPesquisa ocorre $frequencia vez(es) no seu vetor.")
    } else {
        println("O número $numeroPesquisa não ocorre nenhuma vez.")
    }
}
