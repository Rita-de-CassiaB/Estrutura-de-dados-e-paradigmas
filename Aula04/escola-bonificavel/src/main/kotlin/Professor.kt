class Professor(
    nome:String,
    cpf:String,
    var quantHorasSemanal:Int,
    var valorHora:Double

):Funcionario(nome, cpf),Bonificavel{
    override fun calculaSalario():Double {
       return quantHorasSemanal*valorHora*4.5
    }

    override fun getValorBonus(): Double {
        return calculaSalario() * 0.15
    }

    override fun toString(): String {
        return """
            Nome: $nome,
            CPF: $cpf
            Horas Semanais: $quantHorasSemanal
            Valor por Hora: $valorHora
            Salario: ${calculaSalario()}
            Bonus: ${getValorBonus()}
            
            
            """.trimIndent()
    }
}