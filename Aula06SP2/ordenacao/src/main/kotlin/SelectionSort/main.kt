package SelectionSort

fun main (){
    var array:Array<Int> = arrayOf(4,7,5,2,8,1,6,3)

    for(a in array){
        println(a)
    }
    var comparacao = 0
    var troca = 0

    println()

    for(i in 0 until array.size-1){
        for (j in i+1 until array.size){
            comparacao++

            if (array[j] < array[i]){
                var aux = array[i]
                array[i] = array[j]
                array[j] = aux
                troca++

            }
        }
    }

    for(a in array){
        println(a)
    }

    println("Selection Sort - Número de Comparação: ${comparacao}\nNúmero de Trocas: ${troca}")
}