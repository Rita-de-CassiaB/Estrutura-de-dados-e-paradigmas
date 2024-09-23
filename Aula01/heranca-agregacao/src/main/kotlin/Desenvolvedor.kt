open class Desenvolvedor (
    var nome:String,
    var qtdHorasTrabalhadas:Int,
    var valorHoraTrabalhada:Double
) {
    open fun getSalario():Double{
        return valorHoraTrabalhada*qtdHorasTrabalhadas
    }

    override fun toString():String {
        return  """
            Nome: $nome,
            Horas Trabalhadas: $qtdHorasTrabalhadas,
            Valor por Hora: $valorHoraTrabalhada,
            Salario: ${getSalario()}
        """.trimIndent()
    }
}