package Exercicio3

import java.sql.SQLData

fun main(){

    println("Boas Vindas ao Vetor, insira 10 nomes")
    var nomes = Array(10) { "" }

    for (i in nomes.indices) {
        println("Digite o nome ${i + 1}°")
        nomes[i] = readln()
    }

    println("Insira um termo de pesquisa")
    var pesquisa:String = readln()

    var ind = nomes.indexOf(pesquisa)

        if (ind != -1) {
            println("Nome encontrado em $ind")
        } else {
            println("Nome não encontrado")
        }
}