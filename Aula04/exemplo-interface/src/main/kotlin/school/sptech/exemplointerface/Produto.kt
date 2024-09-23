package school.sptech.exemplointerface

abstract class Produto(
    var codigo: Int,
    var descricao: String,
    var preco: Double
): Tributavel {

    override fun toString(): String {
        return "Produto(codigo=$codigo, descricao='$descricao', preco=$preco)"
    }
}