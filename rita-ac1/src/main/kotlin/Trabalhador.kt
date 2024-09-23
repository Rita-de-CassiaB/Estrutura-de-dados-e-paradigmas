abstract class Trabalhador (
    var cpf:String,
    var nome:String,
    var salario:Double
) {
    abstract fun getRenda():Double

    override fun toString(): String {
        return """
            Olá $nome, 
            Seu CPF é $cpf
            Seu salário é $salario
        """.trimIndent()
    }

}