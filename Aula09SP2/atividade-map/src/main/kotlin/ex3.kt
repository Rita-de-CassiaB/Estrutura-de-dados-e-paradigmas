fun main() {
    println("Bem-vindo à votação de sabores de sorvete!")
    println("Digite o sabor de sorvete favorito (ou 0 para encerrar e ver o resultado):")

    val votos = mutableMapOf<String, Int>()

    while (true) {
        print("Sabor: ")
        val sabor = readln()

        if (sabor == "0") {
            break
        }

        if (votos.containsKey(sabor)) {
            votos[sabor] = votos[sabor]!! + 1
        } else {
            votos[sabor] = 1
        }
    }

    println("\nContagem de votos:")
    for ((sabor, quantidade) in votos) {
        println("$sabor: $quantidade")
    }
}
