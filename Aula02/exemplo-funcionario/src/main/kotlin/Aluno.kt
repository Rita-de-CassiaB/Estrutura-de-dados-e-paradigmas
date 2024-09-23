abstract class Aluno (
    var ra:Int,
    var nome:String,
    var nota1:Double,
    var nota2:Double,
) {
    abstract fun calculaMedia():Double

    override fun toString(): String {
        return """Aluno: 
            nome - $nome, 
            ra - $ra,
            nota 1 - $nota1,
            nota 2 - $nota2,
            """.trimIndent()
    }

}