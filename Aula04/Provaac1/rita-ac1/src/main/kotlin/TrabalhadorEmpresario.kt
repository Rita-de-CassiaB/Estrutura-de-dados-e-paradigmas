class TrabalhadorEmpresario (
    var valorParticipacaoLucro:Double,
    cpf:String,
    nome:String,
    salario:Double
):Trabalhador (cpf, nome, salario), Tributável {

    override fun getRenda():Double{
        return salario + valorParticipacaoLucro
    }

    override fun toString(): String {
        return """
            Olá $nome, 
            Seu CPF é $cpf
            Seu salário é $salario
            Seu valor de participação é $valorParticipacaoLucro
            Sua renda atual é ${getRenda()}
            
        """.trimIndent()
    }

    override fun getImposto(): Double {
        return 0.25 * getRenda()
    }


}