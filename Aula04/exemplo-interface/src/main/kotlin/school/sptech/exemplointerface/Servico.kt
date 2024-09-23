package school.sptech.exemplointerface

class Servico(
    var descricao: String,
    var preco: Double
): Tributavel {

    override fun getValorTributo(): Double {
        return preco * 0.12
    }

    override fun toString(): String {
        return "Servico(descricao='$descricao', preco=$preco)"
    }
}