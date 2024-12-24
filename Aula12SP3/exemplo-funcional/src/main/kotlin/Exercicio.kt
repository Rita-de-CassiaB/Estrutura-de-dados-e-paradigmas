fun main() {
    println("Boas vindas ao exercicio 1")
        println("Números pares de 0 a 50:")
        (0..50).filter { it % 2 == 0 }.forEach { println(it) }

        println("\nNúmeros divisíveis por 3, multiplicados por 5:")
        (0..50).filter { it % 3 == 0 }.map { it * 5 }.forEach { println(it) }

        println("\nNúmeros de 0 a 10 menos 4, 7 e 9:")
        (0..10).filterNot { it == 4 || it == 7 || it == 9 }.forEach { println(it) }

        println("\nNúmeros de 1 a 10 multiplicados:")
        (1..10).map { it * it }.forEach { println(it) }


    println("Boas vindas ao exercicio 2")

    val soma: (Double, Double) -> Double = { a, b -> a + b }
    val divisao: (Double, Double) -> Double = { a, b -> a / b }

    val numero = Numero(2.0)

    numero.operacao(4.0, soma)
        .operacao(3.0, divisao)
        .finalizar { resultado -> println("Resultado final: $resultado") }

}
