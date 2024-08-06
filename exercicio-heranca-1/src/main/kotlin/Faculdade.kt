class Faculdade (
    var nome:String
){
    var alunos = mutableListOf<Aluno>()

    fun matricularAluno(novoAluno: Aluno){
        alunos.add(novoAluno)
    }

    fun exibirAlunos() {
        for (alunoDaVez in alunos) {
            println(alunoDaVez)
        }
        println()
    }

    fun exibirAlunosPosGraduacao(){
        for (alunoDaVez in alunos) {
            if (alunoDaVez is AlunoPosGraduacao)
                println(alunoDaVez)
        }
    }

    fun exibirSomaDasMedias(){
        var soma = 0.0
        for (alunoDaVez in alunos) {
            soma += alunoDaVez.calcularMedia()
        }
        println("Soma das médias: ${soma}")
    }

}