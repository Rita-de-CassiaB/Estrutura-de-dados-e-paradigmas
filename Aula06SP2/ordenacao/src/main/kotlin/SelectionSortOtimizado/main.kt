package SelectionSortOtimizado

fun main (){
    var array:Array<Int> = arrayOf(4,7,5,9,2,8,1,6,3)

    for(a in array){
        println(a)
    }

    var comparacao = 0
    var troca = 0

    println()

    for(i in 0 until array.size-1){
        var indMenor = i

        for (j in i+1 until array.size) {
            comparacao++
            if (array[j] < array[indMenor]) {
                indMenor = j

                var troca = array[i]

                array[i] = array[indMenor]

                array[indMenor] = troca
                troca++
            }
        }
    }

    for(a in array) {
        println(a)
    }
    println()
    println("Número de Comparação: ${comparacao}\nNúmero de Trocas: ${troca}")
}