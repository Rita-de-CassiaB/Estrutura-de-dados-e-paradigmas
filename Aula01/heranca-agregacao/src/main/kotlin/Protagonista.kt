class Protagonista (
    nome:String,
    qtdHorasTrabalhadas:Int,
    valorHoraTrabalhada:Double,
    var qtdHorasTrabalhadasProtagonista:Int,
    var valorHoraTrabalhadaProtagonista:Double,
):Ator(nome, qtdHorasTrabalhadas, valorHoraTrabalhada) {

    override fun getSalario(): Double {
        return super.getSalario() + (qtdHorasTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista)
    }
    override fun toString(): String {
        return """
            Nome: $nome,
            Horas Trabalhadas: $qtdHorasTrabalhadas,
            Horas como Protagonista: $qtdHorasTrabalhadasProtagonista
            Valor por Hora: $valorHoraTrabalhada,
            Valor por Hora de Protagonista: $valorHoraTrabalhadaProtagonista
            Salario: ${getSalario()}
        """.trimIndent()
    }
}