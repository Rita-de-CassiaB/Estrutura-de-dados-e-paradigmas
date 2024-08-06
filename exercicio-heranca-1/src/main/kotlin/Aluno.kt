open class Aluno (
    var nome:String,
    var nota1:Double,
    var nota2:Double
) {
 open fun calcularMedia():Double{
     return (nota1+nota2)/2
 }

    override fun toString(): String {
        return "Aluno: nome = $nome, nota 1 = $nota1 nota 2 = $nota2"
    }


}