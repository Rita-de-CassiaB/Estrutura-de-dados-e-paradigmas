package Exercicio5

fun main() {

    val diasDaSemana = arrayOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")
    var numero = 0

    println("Boas vindas ao vetor, digite um número entre 1 e 7:")
    numero = readln().toInt()

    if (numero in 1..7) {
        println("O dia da semana correspondente é: ${diasDaSemana[numero - 1]}")
    } else {
        println("Número inválido. Por favor, digite um número entre 1 e 7.")
    }
}
