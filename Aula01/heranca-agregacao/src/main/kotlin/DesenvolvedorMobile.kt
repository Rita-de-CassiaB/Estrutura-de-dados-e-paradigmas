class DesenvolvedorMobile (
    nome:String,
    qtdHorasTrabalhadas:Int,
    valorHoraTrabalhada:Double,
    var qtdHorasTrabalhadasMobile:Int,
    var valorHorasTrabalhadasMobile:Double
):Desenvolvedor(nome, qtdHorasTrabalhadas, valorHoraTrabalhada) {

    override fun getSalario():Double {
        return qtdHorasTrabalhadasMobile*valorHorasTrabalhadasMobile
    }

    override fun toString(): String {
        return   """
            Nome: $nome,
            Horas Trabalhadas: $qtdHorasTrabalhadas,
            Horas Trabalhadas Mobile: $valorHorasTrabalhadasMobile,
            Valor por Hora: $valorHoraTrabalhada,
            Valor por Hora Mobile: $valorHorasTrabalhadasMobile,
            Salario: ${getSalario()}
        """.trimIndent()

    }

}