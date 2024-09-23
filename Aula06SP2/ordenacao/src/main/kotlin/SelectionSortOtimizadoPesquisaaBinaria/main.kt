package SelectionSortOtimizadoPesquisaaBinaria

fun main (){
    var v:Array<Int> = arrayOf(4,7,5,9,2,8,1,6,3)

    for(a in v){
        println(a)
    }

    var comparacao = 0
    var troca = 0

    println()

    for(i in 0 until v.size-1){
        var indMenor = i

        for (j in i+1 until v.size) {
            comparacao++
            if (v[j] < v[indMenor]) {
                indMenor = j

                var troca = v[i]

                v[i] = v[indMenor]

                v[indMenor] = troca
                troca++
            }
        }
    }

    for(a in v) {
        println(a)
    }
    println()
    println("Número de Comparação: ${comparacao}\nNúmero de Trocas: ${troca}")


    fun verVetor(array:Array<*>){
        for(a in array) {
            print("${a}, ")
        }
    }

    fun pesquisaBinaria(array:Array<Int>,valor:Int,inicio:Int,fim:Int){


        if (inicio <= fim){

            var meio = (inicio+fim)/2

            if (valor == array[meio]){
                println("Valor está na posição: ${meio}")
                verVetor(array)
            }else if(valor > array[meio]){
                pesquisaBinaria(array,valor,meio+1,fim)
            }else if(valor < array[meio]){
                pesquisaBinaria(array,valor,inicio,meio-1)
            }

        }else{

            verVetor(array)
            println("\nValor não existe no vetor\nValor pesquisa: ${valor}")

        }

    }

}