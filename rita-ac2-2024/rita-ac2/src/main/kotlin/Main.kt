fun main() {
    val repo = Repositorio()

    println("Desfazendo pilha vazia:")
    repo.desfazer()

    println("\nExecutando agendado fila vazia:")
    repo.executarAgendado(1)

    repo.salvar("1000", "João Pedro")
    repo.salvar("1001", "Bruno Silva")

    println("\nRepositorio apos salvar 2 alunos:")
    repo.exibir()

    repo.desfazer()
    println("\nRepositorio apos desfazer")
    repo.exibir()

    repo.deletar("1000")
    println("\nDeletando aluno inexistente:")
    repo.deletar("4000")

    println("\nRepositorio apos deletar:")
    repo.exibir()

    repo.agendarSalvar("1002", "Maria Souza")
    repo.agendarSalvar("1003", "Isabela Santana")

    println("\nRepositorio apos agendarSalvar:")
    repo.exibir()

    println("\nExecutando agendado -1 operacoes:")
    repo.executarAgendado(-1)
    println("\nExecutando agendado 10 operacoes:")
    repo.executarAgendado(10)
    repo.executarAgendado(1)

    println("\nRepositorio apos executar agendado")
    repo.exibir()
}