package school.sptech.exemplointerface

class Perfume(
    codigo: Int,
    descricao: String,
    preco: Double,
    var fragrancia: String
): Produto(codigo, descricao, preco) {

    override fun getValorTributo(): Double {
        return preco * 0.27
    }

    override fun toString(): String {
        return "Perfume(fragrancia='$fragrancia') ${super.toString()}"
    }
}