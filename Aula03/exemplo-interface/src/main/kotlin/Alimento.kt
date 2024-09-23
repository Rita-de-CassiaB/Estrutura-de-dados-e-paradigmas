import java.lang.constant.ClassDesc

class Alimento (
    codigo:Int,
    descricao:String,
    preco:Double,
    var quantVitamina:Int,
): Produto (codigo, descricao, preco) {

    override fun getValorTributo(): Double {
        return preco*1.15
    }

    override fun toString(): String {
        return """
            
              Seu produto é 
              codigo: $codigo,
              descrição: $descricao
              preço: $preco
              quantidade de Vitaminas: $quantVitamina
              Tributos: ${getValorTributo()}
                        
        """.trimIndent()
    }
}