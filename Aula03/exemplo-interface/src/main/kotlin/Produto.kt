abstract class Produto (
    var codigo:Int,
    var descricao:String,
    var preco:Double
): Tributavel{

    override fun toString():String{
        return """
            
            Seu produto é 
            codigo: $codigo,
            descrição: $descricao
            preço: $preco
            
        """.trimIndent()
    }

    override fun getValorTributo(): Double {
        TODO("Not yet implemented")
    }
}