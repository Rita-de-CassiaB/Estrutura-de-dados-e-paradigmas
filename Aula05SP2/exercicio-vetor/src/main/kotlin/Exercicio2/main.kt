package Exercicio2

fun main() {

    println("Boas Vindas ao Vetor, insira 10 números inteiros")
    var valores = Array(10) { 0.0 }
    var media: Double

    var acimaMedia = mutableListOf<Double>()

    for (i in valores.indices) {
        println("Digite o valor ${i + 1}°")
        valores[i] = readln().toDouble()
    }

    media = valores.average()
    println("A média dos valores inseridos é $media")

    for (valor in valores) {
        if (valor > media) {
            acimaMedia.add(valor)
        }
    }

    println("Os valores acima da média são: $acimaMedia")
}
