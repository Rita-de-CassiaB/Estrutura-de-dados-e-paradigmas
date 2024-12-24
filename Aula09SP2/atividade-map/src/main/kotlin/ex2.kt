fun main() {
    println("Boas vindas ao sistema de lista de contatos")

    val listaContatos = mutableMapOf<String, String>()

    while (true) {
        println("\nEscolha uma opção:")
        println("1 – Inserir contato")
        println("2 – Exibir contatos")
        println("0 – Sair")
        print("Opção: ")

        val opcao = readln().toInt()

        when (opcao) {
            1 -> {
                println("Digite o nome do seu contato:")
                val contatonome = readln()

                println("Digite o número do seu contato, considerando DD e sem espaços ou traços:")
                val contatonumero = readln()

                listaContatos[contatonome] = contatonumero

                println("Contato salvo: $contatonome - $contatonumero")
            }

            2 -> {
                if (listaContatos.isEmpty()) {
                    println("Nenhum contato cadastrado.")
                } else {
                    val contatosAgrupados = listaContatos.toSortedMap()
                    var letraAtual: Char? = null

                    for ((nome, numero) in contatosAgrupados) {
                        val primeiraLetra = nome[0].uppercaseChar()

                        if (primeiraLetra != letraAtual) {
                            letraAtual = primeiraLetra
                            println("[$letraAtual]")
                        }
                        println("$nome: $numero")
                    }
                }
            }

            0 -> {
                // Sair do programa
                println("Saindo...")
                break
            }

            else -> {
                println("Opção inválida! Tente novamente.")
            }
        }
    }
}
