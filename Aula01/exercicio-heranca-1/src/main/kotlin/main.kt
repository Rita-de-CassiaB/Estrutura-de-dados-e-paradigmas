
fun main() {
     var aluno = Aluno("Rafael", 5.3, 6.8)

    var alunoPos = AlunoPosGraduacao("Camila", 7.6, 8.0, 6.8)

    var faculdade = Faculdade("SPTech")

    faculdade.matricularAluno(aluno)
    faculdade.matricularAluno(alunoPos)
    faculdade.exibirAlunos()
    faculdade.exibirSomaDasMedias()
    faculdade.exibirAlunosPosGraduacao()
}