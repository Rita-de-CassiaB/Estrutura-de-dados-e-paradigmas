fun main() {
    var vetor1 = arrayOf(1,2,3)

    //vetor manual
    var vetor2 = arrayOf("a", "b", "c")

    //vetor automatico de 100 tamanhos iniciando no zero
    var vetor3 = Array(100) {0}

    //Percorrendo vetor
    for (i in vetor1){
        println(i)
    }

    //Percorrendo vetor de trás p frente
    for (i in vetor1.indices.reversed()){
        println(vetor1[i])
    }

   var vetor4: Array<Double>
    println("Digite o tamanho do  vetor de notas:")
   var tamanho = readln().toInt()

    var notas = Array(tamanho) {0.0}

    for (i in notas.indices){
        println("Digite o valor da nota ${i+1}° Nota: ")

        notas[i] = readln().toDouble()
    }


    //Fazendo uma média
    var soma = 0.0
    for (i in notas.indices){
        soma += notas[i]
    }

    var media = soma/notas.size
    println("Média: $media")

    //Fazedo média com formula
    println("Média: ${notas.average()}")
}