class AlunoPos (
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
    var notaMonografia:Double
): Aluno (ra, nome, nota1, nota2){

    override fun calculaMedia():Double{
        return nota1+nota2+notaMonografia/3
    }

    override fun toString(): String {
        return """Aluno: 
            nome - $nome, 
            ra - $ra,
            nota 1 - $nota1,
            nota 2 - $nota2,
            nota monografia - $notaMonografia
            media - ${calculaMedia()}
            """.trimIndent()
    }
}