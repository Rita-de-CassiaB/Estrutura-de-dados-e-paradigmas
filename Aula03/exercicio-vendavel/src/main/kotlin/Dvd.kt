class Dvd (
    codigo:Int,
    precoCusto:Double,
    var nome:String,
    var gravadora:String
):Produto(codigo, precoCusto) {

    override fun getValorVenda(): Double {
        return precoCusto*1.20
    }

    override fun toString(): String {
        return """
            
            Seu produto é 
            codigo: $codigo
            nome: $nome
            gravadora: $gravadora
            preco de custo: $precoCusto
            valor final: ${getValorVenda()}
            
            """.trimIndent()
         }

}