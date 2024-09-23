open class Ator (
    var nome:String,
    var qtdHorasTrabalhadas: Int,
    var valorHoraTrabalhada:Double
){
   open fun getSalario():Double{
        return valorHoraTrabalhada*qtdHorasTrabalhadas
    }

    override fun toString():String{
        return """
            nome: ${nome},
            Horas Trabalhadas: ${qtdHorasTrabalhadas},
            Valor : ${valorHoraTrabalhada},
            Total: ${getSalario()}
        """.trimIndent()
    }
}