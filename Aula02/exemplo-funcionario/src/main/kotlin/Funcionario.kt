abstract class Funcionario (
    var cpf:String,
    var nome:String,
    ) {
    abstract fun calSalario():Double

    override fun toString(): String {
        return """Funcionario: 
            nome - $nome, 
            cpf - $cpf
            """.trimIndent()
    }
}
