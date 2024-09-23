class ControleTributo {

    private val tributaveis = mutableListOf<Tributável>()

    fun adicionaTributavel(t: Tributável) {
        tributaveis.add(t)
    }

    fun calculaTotalImposto() {
        var soma = 0.0

        for (tributavel in tributaveis) {
            soma += tributavel.getImposto()
        }

        var somaTratada = soma.toString()
        return println( "Total de imposto:"+ somaTratada)
    }

    fun exibeTodos() {
        println("Todos os tributáveis:")

        for (tributavel in tributaveis) {
            println(tributavel)
        }
    }
}