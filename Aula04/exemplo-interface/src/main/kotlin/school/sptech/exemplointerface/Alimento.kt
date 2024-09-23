package school.sptech.exemplointerface

class Alimento(
    codigo: Int,
    descricao: String,
    preco: Double,
    var quantVitamina: Int
): Produto(codigo, descricao, preco) {

    override fun getValorTributo(): Double {
        return preco * 0.15
    }

    override fun toString(): String {
        return "Alimento(quantVitamina=$quantVitamina) ${super.toString()}"
    }
}