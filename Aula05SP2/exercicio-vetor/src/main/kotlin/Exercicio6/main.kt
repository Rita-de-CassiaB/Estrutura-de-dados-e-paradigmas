package Exercicio6

fun main() {
    val modelos = Array(5) { "" }
    val rendimentos = Array(5) { 0.0 }

    for (i in modelos.indices) {
        println("Boas vindas ao vetor, digite o nome do modelo do carro ${i + 1}:")
        modelos[i] = readln()

        println("Digite o rendimento (km/L) do ${modelos[i]}:")
        rendimentos[i] = readln().toDouble()
    }

    println("Calculando carro mais economico, aguarde...")
    var indiceMaisEconomico = 0
    for (i in rendimentos.indices) {
        if (rendimentos[i] > rendimentos[indiceMaisEconomico]) {
            indiceMaisEconomico = i
        }
    }

    println("O carro mais econômico é o ${modelos[indiceMaisEconomico]} com rendimento de ${rendimentos[indiceMaisEconomico]} km/L")
}
