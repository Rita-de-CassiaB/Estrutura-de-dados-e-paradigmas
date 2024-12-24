abstract class Brinquedo(
    var codigo: Int,
    var descricao: String,
    var idadeMin: Int,
    var preco: Double,
    var material: String,
    var vidaUtil: Int,
    var tipoBrincadeira: String
) {
    abstract fun brincar() // Método abstrato

    abstract override fun toString(): String // Método abstrato
}
