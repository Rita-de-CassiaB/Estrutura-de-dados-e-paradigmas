abstract class Produto (
    var codigo:Int,
    var precoCusto:Double
):Vendável {
    override fun toString(): String {
        return """
            Seu produto é 
            codigo: $codigo
            preco de custo: $precoCusto
            
        """.trimIndent()
    }
}