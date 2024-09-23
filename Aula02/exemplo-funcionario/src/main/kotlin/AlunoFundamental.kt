class AlunoFundamental (
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
    var nota3:Double,
    var nota4:Double,
):Aluno (ra, nome, nota1, nota2) {
    override fun calculaMedia():Double{
        return nota1+nota2+nota3+nota4/4
    }

    override fun toString(): String {
        return """Aluno: 
            nome - $nome, 
            ra - $ra,
            nota 1 - $nota1,
            nota 2 - $nota2,
            nota 3 - $nota3,
            nota 4 - $nota4,
           
            media - ${calculaMedia()}
            """.trimIndent()
    }
}
