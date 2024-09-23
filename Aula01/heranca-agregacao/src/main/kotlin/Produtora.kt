class Produtora(
    var nome: String,
    var vagas:Int
) {
    var atores:MutableList<Ator> = mutableListOf()

    fun existePorNome(nome:String):Boolean{

        for (ator in atores) {

            if (ator.nome == nome) {
                return true
            }
        }
        return false
    }

    fun contratar(Contratado: Ator){

        if (atores.size < vagas){
            atores.add(Contratado)
        }else{
            println("Sem vagas Disponiveis")
        }
    }

    fun getQuantidadeAtores(){
        println(atores.size)
    }

    fun getQuantidadePrortagonista(){
        var qtdProta = 0

        for (ator in atores){
            if (ator is Protagonista){
                qtdProta++
            }
        }
        println(qtdProta)
    }

    fun getTotalSalarios(){

        var somaSalario = 0.0
        for (ator in atores){
            somaSalario += ator.getSalario()
        }
        println(somaSalario)
    }

    fun buscarAtorPorNome(nome:String):String?{

        if (existePorNome(nome)){

            for (ator in atores){
                if (ator.nome == nome){
                    return ator.toString()
                }
            }
        }
        return null
    }

    override fun toString(): String {
        return """
            Nome: $nome,
            Vagas: $vagas,
            Funcionarios: $atores
                """.trimIndent()
    }
}