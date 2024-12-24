class Lego (
    var numPecas: Int,
    var tema: String,
    codigo: Int,
    descricao: String,
    idadeMin: Int,
    preco: Double,
    material: String,
    vidaUtil: Int,
    tipoBrincadeira: String
) : Brinquedo(codigo, descricao, idadeMin, preco, material, vidaUtil, tipoBrincadeira) {

    override fun brincar() {
        println("Brincando com o Lego $descricao!")
    }

    override fun toString(): String {
        return """
            Olá, este é o Lego $codigo,
            Descrição: $descricao
            Número de Peças: $numPecas
            Tema: $tema
            Tipo de Brincadeira: $tipoBrincadeira
            Idade Mínima para brincar: $idadeMin
            Preço: $preco
            Material: $material
            Vida Útil: $vidaUtil
        """.trimIndent()
    }
}
