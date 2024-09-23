class Servico (
    var descricao:String,
    var preco:Double
):Tributavel {
    override fun toString():String{
        return """
            
            Seu serviço é 
            descrição: $descricao
            preço: $preco
            Tributos: ${getValorTributo()}
            
        """.trimIndent()
    }

    override fun getValorTributo(): Double {
        return preco*1.12
    }
}