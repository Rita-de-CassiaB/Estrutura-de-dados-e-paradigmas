import java.util.*
import java.util.concurrent.ArrayBlockingQueue

fun main() {
    var fila = ArrayBlockingQueue<String> (10)

    fila.add("Item 1")
    fila.add("Item 2")
    fila.add("Item 3")
    fila.add("Item 4")

    println("Verificando os elementos da fila: $fila")

    println("Removendo item da fila: ${fila.poll()}")

    println("Verificando os elementos da fila: $fila")

    println("Espiando próximo da fila: ${fila.peek()}")

    var filaLetras = ArrayBlockingQueue<String> (10)

    filaLetras.add("f")
    filaLetras.add("i")
    filaLetras.add("l")
    filaLetras.add("a")

    println("Verificando a fila de letras completa $filaLetras")

    while (filaLetras.isNotEmpty()){
        println("Removendo item ${filaLetras.poll()} fila letras")
    }

    println("Boas vindas a função de separar positivos e negativos")

    var vetor2 = arrayOf(2, 7, -3, -50, 45, -95, -63)
    var filaPositivos = ArrayBlockingQueue<Int> (vetor2.size)
    var filaNegativos = ArrayBlockingQueue<Int> (vetor2.size)

    for(i in vetor2.indices) {

        if (vetor2[i] > 0) {
            filaPositivos.add(vetor2[i])
            println(filaPositivos)
        } else {
            filaNegativos.add(vetor2[i])
            println(filaNegativos)
        }
    }

    println("Esses são os numeros do vetor: ")
    verVetor(vetor2)
    println("\n Esses são os numeros positivos do vetor: $filaPositivos")
    println("Esses são os numeros negativos do vetor: $filaNegativos")
    println("Limpando as filas")

    while (filaPositivos.isNotEmpty()){
        println("Removendo item ${filaPositivos.poll()} da fila de positivos")
    }
    while (filaNegativos.isNotEmpty()){
        println("Removendo item ${filaNegativos.poll()} da fila de negativos")
    }

    println("Exibindo filas vazias... \n" +
            "Fila de Positivos: $filaPositivos \n" +
            "Fila de Negativos: $filaNegativos \n")


    println("Boas vindas a função de separar positivos e negativos em ordem diferente")

    var filaPositivo1 = ArrayBlockingQueue<Int>(vetor2.size)
    var filaNegativo1 = Stack<Int>()

    for (a in vetor2){

        if (a >= 0){
            filaPositivo1.add(a)
        }else{
            filaNegativo1.add(a)
        }

    }

    println("Exibindo fila de positivos")
    while (filaPositivo1.isNotEmpty()){
        print("${filaPositivo1.poll()}, ")
    }
    println()
    println("Exibindo fila de negativos")
    while (filaNegativo1.isNotEmpty()){
        print("${filaNegativo1.pop()}, ")
    }

}

fun verVetor(array:Array<Int>){

    for (a in array){
        print("${a}, ")
    }

}