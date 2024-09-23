class Escola (
    var nome:String,
) {
    var alunos = mutableListOf<Aluno>()

    fun adicionarAlun(a:Aluno){
        alunos.add(a)
    }
    fun exibeTodos() {
        for (a in alunos){
            println(a)
        }
        println()
    }
    fun exibeAlunosGraduacao() {
        for (a in alunos){
            println(a.toString())
        if (a is AlunoGraduacao) {
            println(alunos.toString())
        }
        }
    }

    fun exibeAprovados() {
        for (a in alunos){
            println(a.toString())
            if (a.calculaMedia() > 6) {
                println(alunos.toString())
            }
        }
    }

    fun buscaAluno(ra:Int){
        var ra = getRa()

        for (a in alunos){
            println(a.toString())
        }
    }

    fun getRa():Int {
        var ra = 0
        for (a in alunos) {
            ra = a.ra
        }
        return ra
    }

}