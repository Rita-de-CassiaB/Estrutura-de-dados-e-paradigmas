class Servico (
    var descricao:String,
    var codigo:Int,
    var quantHoras:Int,
    var valorHora:Double
):Vendável {

    override fun getValorVenda(): Double {
        return quantHoras*valorHora
    }

    override fun toString(): String {
        return """
            Seu serviço é 
            descrição: $descricao
            codigo: $codigo
            quantidade de Horas: $quantHoras
            valor por hora: $valorHora
            valor de venda: ${getValorVenda()}

        """.trimIndent()
    }
}