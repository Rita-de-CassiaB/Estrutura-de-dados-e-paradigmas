class Testes {

    fun main(){
        var func1 = Engenheiro("471498526-19", "Ana", 5800.50)
        var func2 = Engenheiro("471496526-19", "Carla", 10500.20)
        var func3 = Horista ("598625498-36", "Viviane", 50, 20.65)
        var func4 = Horista ("598625499-86", "Marcelly", 50, 65.65)
        var func5 = Vendedor ("598625486-86", "Amber", 509065.69, 0.9)
        var func6 = Vendedor ("598645499-86", "Mariana", 95658.30, 0.15)

        var empresa = Empresa("BusiWom")

        empresa.adicionarFun(func1)
        empresa.adicionarFun(func3)
        empresa.adicionarFun(func6)
        println()

        empresa.exibirTodos()
        println()
        empresa.exibirEngenheiros()
        println()
        empresa.exibirHorista()
        println()
        empresa.exibirVendedor()

        empresa.exibirTotalSalario()
        println()


        var escola = Escola("esc1")
        var al1 = AlunoGraduacao (222, "Ana", 8.6, 6.2)
        var al2 = AlunoPos (222, "Fernanda", 8.6, 6.2, 9.5)
        escola.adicionarAlun(al1)
        escola.exibeTodos()
        escola.buscaAluno(222)
        println()

    }
}