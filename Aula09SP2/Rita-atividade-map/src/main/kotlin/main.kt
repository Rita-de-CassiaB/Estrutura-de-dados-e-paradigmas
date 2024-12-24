import kotlin.system.exitProcess

fun main() {
    val gerenciador = GerenciadorBrinquedo()

    while (true) {
        menuBrinquedos(gerenciador)
    }
}

    fun menuBrinquedos(gerenciador: GerenciadorBrinquedo) {
        println(
            """
        Escolha uma opção:
        1- Adicionar brinquedo
        2- Remover brinquedo
        3- Remover último brinquedo
        4- Exibir brinquedos
        5- Buscar brinquedo
        6- Atualizar brinquedo
        7- Gerar relatório
        0- Sair
        """.trimIndent()
        )

        val escolhida = readLine()!!.toInt()


        when (escolhida) {
            1 -> gerenciador.adicionarBrinquedo()
            2 -> gerenciador.removerBrinquedo()
            3 -> gerenciador.removerUltimoBrinquedo()
            4 -> gerenciador.exibirBrinquedos()
            5 -> gerenciador.buscarBrinquedo()
            6 -> gerenciador.atualizarBrinquedo()
            7 -> gerenciador.gerarRelatorio()
            0 -> {
                println("Programa finalizado!")
                exitProcess(0)
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }


