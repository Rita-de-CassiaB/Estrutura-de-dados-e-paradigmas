package school.sptech.exemplointerface

class Tributo {

    private val tributaveis = mutableListOf<Tributavel>()

    fun adicionaTributavel(t: Tributavel) {
        tributaveis.add(t)
    }

    fun calculaTotalTributo(): Double {
        var soma = 0.0

        for (tributavel in tributaveis) {
            soma += tributavel.getValorTributo()
        }

        return soma
    }

    fun exibeTodos() {
        println("Todos os tributáveis:")

        for (tributavel in tributaveis) {
            println(tributavel)
        }
    }
}