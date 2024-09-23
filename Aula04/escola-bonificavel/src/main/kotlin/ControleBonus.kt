class ControleBonus {

    var controle = mutableListOf<Bonificavel>()

    fun adicionaBonus(b:Bonificavel){
        controle.add(b)
    }

    fun calculaBonusProfessor(): Double {
        var soma = 0.0

        for (b in controle) {

            if (b is Professor){
                soma += b.getValorBonus()}
            }
        println("Total Bonus Professor "+soma)
        return soma
    }

    fun calculaBonusCoordenador(): String {
        var soma = 0.0

        for (b in controle) {

            if (b is Coordenador){
                soma += b.getValorBonus()}
        }
        println("Total Bonus Coordenador" + soma)
        return soma.toString()
    }

    fun calculaTotalBonus(): Double {
        var soma = 0.0

        for (b in controle) {
                soma += b.getValorBonus()
        }
        println("Total em bonus:"+ soma)
        return soma
    }

    fun exibeTodos() {
        for (b in controle) {
            println(b.toString())
        }
    }
}