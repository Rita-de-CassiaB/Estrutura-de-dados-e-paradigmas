class Coordenador (
    nome:String,
    cpf:String,
    var quantHorasSemanal:Int,
    var valorHoraCoordenacao:Double,
    var quantCursoCoordena:Int,

):Funcionario(nome, cpf), Bonificavel{
    override fun calculaSalario():Double {
        return quantHorasSemanal*valorHoraCoordenacao*4.5 + (quantCursoCoordena*500)
    }

    override fun getValorBonus(): Double {
        return calculaSalario() * 0.2
    }

    override fun toString(): String {
        return """
            Nome: $nome,
            CPF: $cpf
            Horas Semanais: $quantHorasSemanal
            Valor por Hora: $valorHoraCoordenacao
            Quantidade de Cursos Coordenados: $quantCursoCoordena
            Salario: ${calculaSalario()}
            Bonus: ${getValorBonus()}
   
   
            """.trimIndent()
    }

}