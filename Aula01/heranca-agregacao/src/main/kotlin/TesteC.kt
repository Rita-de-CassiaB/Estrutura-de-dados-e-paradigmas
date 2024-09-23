class TesteC {

    fun main() {
        var dev1 = Desenvolvedor("Ritinha",30,20.0)

        var dev2 = Desenvolvedor("Aninha",69,15.0)

        var dev3 = DesenvolvedorMobile("Marcia", 10, 100.0, 8, 150.0)

        var dev4 = DesenvolvedorMobile("Mari",100,40.0,2,35.0)

        var dev5 = DesenvolvedorMobile("Tai",100,40.0,2,89.0)

        var dev6 = Desenvolvedor("Vivi",0,65.0)


        var consultoria = Consultoria("TecWoman",4)


        consultoria.contratar(dev1)
        consultoria.contratar(dev2)
        consultoria.contratar(dev3)
        consultoria.contratar(dev4)
        consultoria.contratar(dev5)
        consultoria.contratar(dev6)

        println()

        consultoria.getQuantidadeDesenvolvedores()

        println()

        consultoria.getQuantidadeDesenvolvedoresMobile()

        println()

        consultoria.getTotalSalarios()

        println()

        println(consultoria.buscarDesenvolvedorPorNome("Aninha"))

        println()

        println(consultoria.buscarDesenvolvedorPorNome("Paula"))

        println()

        println(consultoria.toString())

    }
}