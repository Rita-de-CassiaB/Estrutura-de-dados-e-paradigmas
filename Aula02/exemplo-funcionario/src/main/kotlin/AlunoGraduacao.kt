class AlunoGraduacao (
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
):Aluno(ra, nome, nota1, nota2) {

    override fun calculaMedia():Double{
        return nota1*0.4+nota2*0.6
    }

    override fun toString(): String {
        return """Aluno: 
            nome - $nome, 
            ra - $ra,
            nota 1 - $nota1,
            nota 2 - $nota2,
            media - ${calculaMedia()}
            """.trimIndent()
    }
}