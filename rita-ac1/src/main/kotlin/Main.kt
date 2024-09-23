fun main() {

    val Rafael = TrabalhadorEmpresario(
        6598.65, "48598326596", "Rafael da Silva Mídea", 5500.30
    )

    val Thayna = TrabalhadorEmpresario(
        9698.65, "48986526596", "Thayna Cara Campos", 7900.30
    )

    val Alessandro = TrabalhadorAssalariado(
        500.55, 10, "598659830254","Alessandro Barreira Carmy", 9500.80
    )

    val Verydiana = TrabalhadorAssalariado(
        70.55, 3, "956659830254","Verydiana Marke Silva", 1000.80
    )

    val CasaVery = Imovel(50.50, 50, "Ceramica" )
    val AptoAle = Imovel(103.950, 70, "Brooklin" )
    val AptoThay = Imovel(250.00, 100, "Laranjeiras" )

    val tributo = ControleTributo()
    tributo.adicionaTributavel(Rafael)
    tributo.adicionaTributavel(Thayna)
    tributo.adicionaTributavel(Alessandro)
    tributo.adicionaTributavel(Verydiana)
    tributo.adicionaTributavel(CasaVery)
    tributo.adicionaTributavel(AptoAle)
    tributo.adicionaTributavel(AptoThay)

    tributo.calculaTotalImposto()
    println()
    tributo.exibeTodos()
    println()
}