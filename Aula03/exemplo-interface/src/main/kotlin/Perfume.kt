import java.nio.DoubleBuffer

class Perfume (
    codigo:Int,
    descricao:String,
    preco:Double,
    var fragancia:String
):Produto(codigo, descricao, preco) {

    override fun getValorTributo(): Double {
        return preco*1.27
    }

    override fun toString(): String {
        return """
            
              Seu produto é 
              codigo: $codigo,
              descrição: $descricao
              preço: $preco
              fragância: $fragancia
              Tributos: ${getValorTributo()}
                        
        """.trimIndent()
    }
}