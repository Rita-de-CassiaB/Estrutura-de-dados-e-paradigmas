class TesteP {

    fun main(){

        var ator1 = Ator("Ritinha",30,20.0)

        var ator2 = Ator("Aninha",69,15.0)

        var ator3 = Protagonista("Marcia", 10, 100.0, 8, 150.0)

        var ator4 = Protagonista("Mari",100,40.0,2,35.0)

        var ator5 = Protagonista("Tai",100,40.0,2,89.0)

        var ator6 = Ator("Vivi",0,65.0)


        var produtora = Produtora("ActionWoman",4)

        produtora.contratar(ator1)
        produtora.contratar(ator2)
        produtora.contratar(ator3)
        produtora.contratar(ator4)
        produtora.contratar(ator5)
        produtora.contratar(ator6)

        println()

        produtora.getQuantidadeAtores()

        println()

        produtora.getQuantidadePrortagonista()

        println()

        produtora.getTotalSalarios()

        println()

        println(produtora.buscarAtorPorNome("Aninha"))

        println()

        println(produtora.buscarAtorPorNome("Carla"))

        println()

        println(produtora.toString())

    }

}