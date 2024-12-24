fun main() {
    val repositorio = Repositorio()
    var contadorId = 100

    while (true) {
        menuBrinquedos(repositorio, contadorId)
        println("Deseja continuar? (s/n): ")
        val continuar = readln().lowercase()

        if (continuar == "n"){
            println ("Programa finalizado! Obrigada e volte sempre!")
            break
        } else if ( continuar != "s"){
            main()
        }
    }
}

fun menuBrinquedos(repositorio: Repositorio, contadorId: Int) {
    println("""
        Escolha uma opção:
        1- Salvar objeto
        2- Deletar objeto
        3- Exibir
        4- Desfazer
        5- Agendar salvar
        6- Executar agendado
        7- Fim
    """.trimIndent())

    opcoes(repositorio, contadorId)
}

fun opcoes(repositorio: Repositorio, contadorId: Int) {
    println("Selecione uma das opções digitando o número correspondente:")
    val escolhida = readln().toInt()

    when (escolhida) {
        1 -> {
            println("Digite o tipo de brinquedo (Boneca/Lego): ")
            val tipo = readln().lowercase()

            when (tipo) {
                "boneca" -> {

                    println("Digite a altura da boneca em centimetros: ")
                    val altura = readln().toDouble()

                    println("Digite o tipo de cabelo da boneca: ")
                    val tipoCabelo = readln()

                    println("Digite a descrição da boneca: ")
                    val descricao = readln()

                    println("Digite a idade mínima para brincar: ")
                    val idadeMin = readln().toInt()

                    println("Digite o preço: (xx.xx)")
                    val preco = readln().toDouble()

                    println("Digite o material: ")
                    val material = readln()

                    println("Digite a vida útil em anos: ")
                    val vidaUtil = readln().toInt()

                    println("Digite o tipo de brincadeira: ")
                    val tipoBrincadeira = readln()

                    val boneca = Boneca(
                        altura = altura,
                        tipoCabelo = tipoCabelo,
                        codigo = contadorId,
                        descricao = descricao,
                        idadeMin = idadeMin,
                        preco = preco,
                        material = material,
                        vidaUtil = vidaUtil,
                        tipoBrincadeira = tipoBrincadeira
                    )

                    repositorio.salvar(boneca)
                }

                "lego" -> {

                    println("Digite o número de peças do Lego: ")
                    val numPecas = readln().toInt()

                    println("Digite o tema do Lego: ")
                    val tema = readln()

                    println("Digite a descrição do Lego: ")
                    val descricao = readln()

                    println("Digite a idade mínima para brincar: ")
                    val idadeMin = readln().toInt()

                    println("Digite o preço: (xx.xx) ")
                    val preco = readln().toDouble()

                    println("Digite o material: ")
                    val material = readln()

                    println("Digite a vida útil em anos: ")
                    val vidaUtil = readln().toInt()

                    println("Digite o tipo de brincadeira: ")
                    val tipoBrincadeira = readln()

                    val lego = Lego(
                        numPecas = numPecas,
                        tema = tema,
                        codigo = contadorId,
                        descricao = descricao,
                        idadeMin = idadeMin,
                        preco = preco,
                        material = material,
                        vidaUtil = vidaUtil,
                        tipoBrincadeira = tipoBrincadeira
                    )

                    repositorio.salvar(lego)
                }

                else -> {
                    println("Tipo de brinquedo inválido.")
                }
            }
        }

        2 -> {
            println("Digite o ID do objeto a ser deletado: ")
            val id = readln().toInt()
            repositorio.deletar(id)
        }

        3 -> {
            println(repositorio.exibir())
        }

        4 -> {
            println(repositorio.desfazer())
        }

        5 -> {
            println("Digite o tipo de brinquedo para agendar salvar (Boneca/Lego): ")
            val tipo = readln().lowercase()

            when (tipo) {
                "boneca" -> {

                    println("Digite a altura da boneca em centimetros: ")
                    val altura = readln().toDouble()

                    println("Digite o tipo de cabelo da boneca: ")
                    val tipoCabelo = readln()

                    println("Digite a descrição da boneca: ")
                    val descricao = readln()

                    println("Digite a idade mínima para brincar: ")
                    val idadeMin = readln().toInt()

                    println("Digite o preço (xx.xx): ")
                    val preco = readln().toDouble()

                    println("Digite o material: ")
                    val material = readln()

                    println("Digite a vida útil em anos: ")
                    val vidaUtil = readln().toInt()

                    println("Digite o tipo de brincadeira: ")
                    val tipoBrincadeira = readln()

                    val boneca = Boneca(
                        altura = altura,
                        tipoCabelo = tipoCabelo,
                        codigo = contadorId,
                        descricao = descricao,
                        idadeMin = idadeMin,
                        preco = preco,
                        material = material,
                        vidaUtil = vidaUtil,
                        tipoBrincadeira = tipoBrincadeira
                    )

                    repositorio.agendarSalvar(boneca)
                }

                "lego" -> {

                    println("Digite o número de peças do Lego: ")
                    val numPecas = readln().toInt()

                    println("Digite o tema do Lego: ")
                    val tema = readln()

                    println("Digite a descrição do Lego: ")
                    val descricao = readln()

                    println("Digite a idade mínima para brincar: ")
                    val idadeMin = readln().toInt()

                    println("Digite o preço (xx.xx): ")
                    val preco = readln().toDouble()

                    println("Digite o material: ")
                    val material = readln()

                    println("Digite a vida útil em anos: ")
                    val vidaUtil = readln().toInt()

                    println("Digite o tipo de brincadeira: ")
                    val tipoBrincadeira = readln()

                    val lego = Lego(
                        numPecas = numPecas,
                        tema = tema,
                        codigo = contadorId,
                        descricao = descricao,
                        idadeMin = idadeMin,
                        preco = preco,
                        material = material,
                        vidaUtil = vidaUtil,
                        tipoBrincadeira = tipoBrincadeira
                    )

                    repositorio.agendarSalvar(lego)
                }

                else -> {
                    println("Tipo de brinquedo inválido.")
                }
            }
        }

        6 -> {
            println("Digite a quantidade de operações agendadas a serem executadas: ")
            val qtdOperacoes = readln().toInt()
            println(repositorio.executarAgendado(qtdOperacoes))
        }

        7 -> {
            println("Programa finalizado.")
            return
        }

        else -> {
            println("Opção inválida, insira novamente!")
        }
    }
}
