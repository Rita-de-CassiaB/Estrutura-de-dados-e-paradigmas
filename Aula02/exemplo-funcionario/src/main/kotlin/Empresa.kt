class Empresa (
    var nome:String
) {
    var funcionarios = mutableListOf<Funcionario>()

    fun adicionarFun (f:Funcionario) {
        funcionarios.add(f)
    }

    fun exibirTodos () {
        for (f in funcionarios){
            println(f)
        }
        println()
    }

    fun exibirTotalSalario() {
        var total  = 0.0

        for (f in funcionarios){
            total += f.calSalario()
        }
        println ("Total de salario dos Funcionários = $total")
    }
    fun exibirEngenheiros(){
        for (f in funcionarios){
            println(f.toString())

           if (f is Engenheiro){
               println(funcionarios.toString())
           }
        }
        println()
    }

    fun exibirVendedor(){
        for (f in funcionarios){
            println(f.toString())

            if (f is Vendedor){
                println(funcionarios.toString())
            }
        }
        println()
    }

    fun exibirHorista(){
        for (f in funcionarios){
            println(f.toString())

            if (f is Horista){
                println(funcionarios.toString())
            }
        }
        println()
    }

}