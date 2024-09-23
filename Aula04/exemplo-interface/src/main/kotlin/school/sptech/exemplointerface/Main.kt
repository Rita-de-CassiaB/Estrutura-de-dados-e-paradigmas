package school.sptech.exemplointerface

fun main() {

    val batata = Alimento(
        codigo = 1234,
        descricao = "Comestivel",
        preco = 2.0,
        quantVitamina = 3
    )

    val purovoodo = Perfume(
        codigo = 2345,
        descricao = "Pobre e cafajeste",
        preco = 12.0 * 5,
        fragrancia = "Amadeirado, Alérgico"
    )

    val netflix = Servico(
        descricao = "Assista filmes e séries",
        preco = 36.99
    )

    val tributo = Tributo()
    tributo.adicionaTributavel(batata)
    tributo.adicionaTributavel(purovoodo)
    tributo.adicionaTributavel(netflix)

    tributo.exibeTodos()
    println("Total de tributos ${"%.2f".format(tributo.calculaTotalTributo())}")
}