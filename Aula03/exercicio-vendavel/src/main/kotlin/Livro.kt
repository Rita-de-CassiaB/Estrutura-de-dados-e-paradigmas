class Livro (
    codigo:Int,
    precoCusto:Double,
    var nome:String,
    var autor:String,
    var isbn:String,
):Produto(codigo, precoCusto) {

    override fun getValorVenda(): Double{
        return precoCusto*1.10
    }

    override fun toString(): String {
        return """
            
            Seu produto é 
            codigo: $codigo
            nome: $nome
            autor: $autor
            isbn: $isbn
            preco de custo: $precoCusto
            valor final: ${getValorVenda()}
            
        """.trimIndent()
    }


}