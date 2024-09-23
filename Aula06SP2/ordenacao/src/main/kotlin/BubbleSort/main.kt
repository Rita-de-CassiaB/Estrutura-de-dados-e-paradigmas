package BubbleSort

fun main () {

    var array: Array<Int> = arrayOf(4, 10, 7, 5, 2, 8, 1, 6, 3)

    var comparacao = 0
    var troca = 0

    for (a in array) {
        println(a)
    }

    println()

    for (i in 0 until array.size - 1) {
        for (j in i + 1 until array.size - i) {
            comparacao++
            if (array[j - 1] > array[j]) {

                var aux = array[j]

                array[j] = array[j-1]

                array[j-1] = aux

                troca++

            }
        }
    }

    for(a in array) {
        println(a)
    }

        println("Número de Comparação: ${comparacao}\nNúmero de Trocas: ${troca}")
}
