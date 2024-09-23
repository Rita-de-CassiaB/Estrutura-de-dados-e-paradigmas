class Teste {
    fun main () {
        var prof1 = Professor("Rafael", "69874625916", 23, 6.50)
        var coord1 = Coordenador("Amanda", "69874698916", 63, 8.60, 6)

        var secre = Secretaria("Fernando", "89536241678", 8500.50, 65.65)

        var teste = ControleBonus()
        teste.adicionaBonus(prof1)
        teste.adicionaBonus(coord1)


        teste.calculaBonusProfessor()
        println()
        teste.calculaBonusCoordenador()
        println()
        teste.calculaTotalBonus()
        println()
        println(secre)
        teste.exibeTodos()
    }
}