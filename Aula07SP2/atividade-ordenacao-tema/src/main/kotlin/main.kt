fun main() {
    val brinquedos = arrayOfNulls<Brinquedo>(8)

    brinquedos[0] = Lego(500, "Espaço", 1, "Lego de espaço", 6, 199.99, "Plástico", 10, "Construir")

    brinquedos[1] = Lego(300, "Cidade", 2, "Lego de cidade", 8, 249.99, "Plástico", 12, "Construir")

    brinquedos[2] = Lego(150, "Super Heróis", 3, "Lego de super heróis", 10, 299.99, "Plástico", 8, "Construir")

    brinquedos[3] = Lego(400, "Piratas", 4, "Lego de piratas", 9, 179.99, "Plástico", 15, "Construir")


    brinquedos[4] = Boneca(30.0, "Cabelo Cacheado", 5, "Boneca Princesa", 4, 394.99, "Plástico", 5, "Brincar de boneca")

    brinquedos[5] = Boneca(25.0, "Cabelo Liso", 6, "Boneca Barbie", 5, 89.99, "Plástico", 6, "Brincar de boneca")

    brinquedos[6] = Boneca(35.0, "Cabelo Crespo", 7, "Boneca Real", 4, 109.99, "Tecido", 4, "Brincar de boneca")

    brinquedos[7] = Boneca(28.0, "Cabelo Liso", 8, "Boneca Bailarina", 6, 119.99, "Plástico", 7, "Brincar de boneca")

    // Testes
    bubbleSortPorPreco(brinquedos)
    println("Boas Vindas ao app de brinquedos!")
    println("Brinquedos ordenados por preço (decrescente):")

    for (brinquedo in brinquedos) {
        println(brinquedo?.toString())
        println()
    }

    val precoPesquisa = 199.99
    val indexEncontrado = pesquisaBinariaPorPreco(brinquedos, precoPesquisa)
    if (indexEncontrado != -1) {
        println("\nBrinquedo encontrado pelo preço $precoPesquisa: ${brinquedos[indexEncontrado]}")
    } else {
        println("\nBrinquedo com preço $precoPesquisa não encontrado.")
    }

    val precoInexistente = 500.00
    val indexInexistente = pesquisaBinariaPorPreco(brinquedos, precoInexistente)
    if (indexInexistente != -1) {
        println("\nBrinquedo encontrado pelo preço $precoInexistente: ${brinquedos[indexInexistente]}")
    } else {
        println("\nBrinquedo com preço $precoInexistente não encontrado.")
    }
}

    // Funções

fun bubbleSortPorPreco(brinquedos: Array<Brinquedo?>) {
    for (i in brinquedos.indices) {
        for (j in 0 until brinquedos.size - i - 1) {
            if (brinquedos[j] != null && brinquedos[j + 1] != null && brinquedos[j]!!.preco < brinquedos[j + 1]!!.preco) {

                val temp = brinquedos[j]
                brinquedos[j] = brinquedos[j + 1]
                brinquedos[j + 1] = temp
            }
        }
    }
}

fun pesquisaBinariaPorPreco(brinquedos: Array<Brinquedo?>, preco: Double): Int {
    var inicio = 0
    var fim = brinquedos.size - 1

    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        if (brinquedos[meio] != null) {
            if (brinquedos[meio]!!.preco == preco) {
                return meio
            } else if (brinquedos[meio]!!.preco > preco) {
                inicio = meio + 1
            } else {
                fim = meio - 1
            }
        }
    }
    return -1
}

