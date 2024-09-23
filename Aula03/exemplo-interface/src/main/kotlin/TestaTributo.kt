class TestaTributo {
    fun main() {
        var tributo1 = Perfume(21, "Perfume Ame-se", 560.0, "Adocicado com notas de floral")
        var tributo2 = Alimento(31, "Pão 30% integral com fibras", 12.66, 5)
        var tributo3 = Servico("Sessão de nutricionista com acompanhamento de nutrientes", 250.0)
        var clinica = Tributo("Clinica BeHealth")

        clinica.adicionaTributavel(tributo1)
        clinica.adicionaTributavel(tributo2)
        clinica.adicionaTributavel(tributo3)
        println()
        clinica.exibeTodos()
        println()
       println("Seu total é "+ clinica.calculaTotalTributo())
        println()
    }
}