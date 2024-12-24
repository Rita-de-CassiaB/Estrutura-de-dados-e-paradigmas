fun main() {

    println("Paradigma Imperativo - Laço de repetição // Como fazer algo")
    for (i in 0 .. 10){
        println(i)
    }

    println("Paradigma Funcional - Laço de repetição // O que fazer")
    (0..10).forEach{ println(it)}

    println("Soma = Imperativo")
    var acumulador = 0
    for (i in 0..10){
        acumulador += i
    }
    println(acumulador)

    println("Soma - funcional")
    println("Reduce")
    println((0..10).reduce { acc, valor -> acc + valor })
    println("Sum")
    println((0..10).sum())

    println("Alterando lista - Imperativo")
    val listaNumeros = listOf(1,2,3,4,5,6)
    val listaDobroPar = mutableListOf<Int>()

    for (numero in listaNumeros){
        if (numero % 2 == 0) {
            listaDobroPar.add(numero*2)
        }
    }

    println(listaDobroPar)

    println("Alterando lista - Funcional")
    println(listOf(1,2,3,4,5,6).filter {it % 2 == 0}.map {it * 2})

    println("Busca Imperativa")
    val listaLetras = listOf("a", "b", "c")
    var valorEncontrado:String? = null
    for (letra in listaLetras){
        if (letra == "b") {
            valorEncontrado = letra
        }
    }
    println(valorEncontrado)

    println("Busca Funcional")
    println(listOf("a", "b", "c").find {it == "b"})

    println("Removendo no Imperativo")
    val listaLetras2 = mutableListOf("a", "b", "c")
    listaLetras2.remove("b")
    println(listaLetras2)

    println("Removendo no Funcional")
    println(listOf("a", "b", "c").filter { it != "b" })


}