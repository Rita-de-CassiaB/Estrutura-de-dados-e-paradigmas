abstract class Funcionario (
    var nome:String,
    var cpf:String
){
    abstract fun calculaSalario():Double
    override fun toString(): String {
        return """
            Nome:$nome,
            CPF: $cpf
            
            
            """.trimIndent()
    }
}