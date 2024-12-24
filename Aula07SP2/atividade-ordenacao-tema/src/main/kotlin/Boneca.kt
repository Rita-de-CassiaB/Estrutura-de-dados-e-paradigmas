class Boneca (
    var altura: Double,
    var tipoCabelo: String,
    codigo: Int,
    descricao: String,
    idadeMin: Int,
    preco: Double,
    material: String,
    vidaUtil: Int,
    tipoBrincadeira: String
):Brinquedo (codigo, descricao, idadeMin, preco, material, vidaUtil, tipoBrincadeira){

    override fun brincar() {
        println("Brincando com a boneca!")
    }

    override fun toString(): String {
        return """
            Olá essa é a Boneca $codigo,
            Descricao:$descricao,
            Tipo de Cabelo: $tipoCabelo
            Altura:$altura,
            Tipo de Brincadeira:$tipoBrincadeira
            Idade Mínima para brincar: $idadeMin
            Preço: $preco
            Material: $material
            Vida Útil: $vidaUtil
        """.trimIndent()
    }
}
