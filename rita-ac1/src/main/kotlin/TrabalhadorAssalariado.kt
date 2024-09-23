class TrabalhadorAssalariado (
    var valorHoraExtra:Double,
    var qtdHoraExtra:Int,
    cpf:String,
    nome:String,
    salario:Double
):Trabalhador(cpf, nome, salario), Tributável{
    override fun getRenda(): Double {
        return salario + (valorHoraExtra*qtdHoraExtra)
    }

    override fun toString(): String {
        return """
            Olá $nome, 
            Seu CPF é $cpf
            Seu salário é $salario
            Suas horas extra são de $qtdHoraExtra
            Seu valor por hora extra é de $valorHoraExtra
            Sua renda atual é ${getRenda()}
            
        """.trimIndent()
    }

    override fun getImposto(): Double {
        return 0.12 * getRenda()
    }

}