

class Consultoria (
    var nome:String,
    var vagas:Int
) {

    var funcionarios:MutableList<Desenvolvedor> = mutableListOf()

    fun existePorNome(nome: String):Boolean{

        for (funcionario in funcionarios){
            if (funcionario.nome == nome){
                return true
            }
        }
        return false
    }

    fun contratar(Contratado:Desenvolvedor) {

        if (funcionarios.size < vagas) {
            funcionarios.add(Contratado)
        } else {
            println("Sem vagas disponíveis!")
        }
    }

    fun getQuantidadeDesenvolvedores(){
        println(funcionarios.size)
    }

    fun getQuantidadeDesenvolvedoresMobile(){
        var qtdMob = 0

        for (funcionario in funcionarios){
            if (funcionario is DesenvolvedorMobile){
                qtdMob++
            }
        }
    println(qtdMob)
    }

    fun getTotalSalarios(){
        var somaSalario = 0.0

        for (funcionario in funcionarios) {
            somaSalario += funcionario.getSalario()
        }
        println(somaSalario)
    }

    fun buscarDesenvolvedorPorNome(nome:String):String?{

        if (existePorNome(nome)){
            for (funcionario in funcionarios){
                if (funcionario.nome == nome){
                    return funcionario.toString()
                }
            }
        }
        return null
    }

    override fun toString():String{
        return """
                Nome: $nome,
                Vagas: $vagas,
                Funcionarios: $funcionarios
        """.trimIndent()
    }
}