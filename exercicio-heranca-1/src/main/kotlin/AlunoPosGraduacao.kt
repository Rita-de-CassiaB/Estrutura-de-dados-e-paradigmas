 class AlunoPosGraduacao (
    nome:String,
    nota1: Double,
    nota2:Double,
   var notaTCC:Double
):Aluno(nome,nota1, nota2 ) {

    override fun calcularMedia(): Double {
        return (nota1 + nota2 + notaTCC)/3
    }

     override fun toString():String {
         return "Aluno Pós-Graduação: nota de TCC = $notaTCC ${super.toString()}"
     }

}