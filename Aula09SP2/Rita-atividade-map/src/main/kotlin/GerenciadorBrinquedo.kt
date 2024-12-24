class GerenciadorBrinquedo {
    var brinquedos: MutableMap<Int, Brinquedo> = mutableMapOf<Int, Brinquedo>()
    var contadorId = 100


    fun adicionarBrinquedo() {
        println("Digite o tipo de brinquedo (Boneca/Lego):")
        val tipo = readLine()!!.lowercase()

        when (tipo) {
            "boneca" -> {
                println("Digite a descrição da boneca:")
                val descricao = readLine()!!
                println("Digite a idade mínima para brincar:")
                val idadeMin = readLine()!!.toInt()
                println("Digite o preço da boneca (xx.xx):")
                val preco = readLine()!!.toDouble()
                println("Digite o material da boneca:")
                val material = readLine()!!
                println("Digite a vida útil da boneca em anos:")
                val vidaUtil = readLine()!!.toInt()
                println("Digite o tipo de brincadeira:")
                val tipoBrincadeira = readLine()!!
                println("Digite a altura da boneca em centímetros:")
                val altura = readLine()!!.toDouble()
                println("Digite o tipo de cabelo da boneca:")
                val tipoCabelo = readLine()!!

                val boneca = Boneca(
                    codigo = ++contadorId,
                    descricao = descricao,
                    idadeMin = idadeMin,
                    preco = preco,
                    material = material,
                    vidaUtil = vidaUtil,
                    tipoBrincadeira = tipoBrincadeira,
                    altura = altura,
                    tipoCabelo = tipoCabelo
                )

                brinquedos[boneca.codigo] = boneca
                println("Boneca adicionada com sucesso! ID: ${boneca.codigo}")
            }

            "lego" -> {
                println("Digite a descrição do Lego:")
                val descricao = readLine()!!
                println("Digite a idade mínima para brincar:")
                val idadeMin = readLine()!!.toInt()
                println("Digite o preço do Lego (xx.xx):")
                val preco = readLine()!!.toDouble()
                println("Digite o material do Lego:")
                val material = readLine()!!
                println("Digite a vida útil do Lego em anos:")
                val vidaUtil = readLine()!!.toInt()
                println("Digite o tipo de brincadeira:")
                val tipoBrincadeira = readLine()!!
                println("Digite o número de peças do Lego:")
                val numPecas = readLine()!!.toInt()
                println("Digite o tema do Lego:")
                val tema = readLine()!!

                val lego = Lego(
                    codigo = ++contadorId,
                    descricao = descricao,
                    idadeMin = idadeMin,
                    preco = preco,
                    material = material,
                    vidaUtil = vidaUtil,
                    tipoBrincadeira = tipoBrincadeira,
                    numPecas = numPecas,
                    tema = tema
                )
                brinquedos[lego.codigo] = lego
                println("Lego adicionado com sucesso! ID: ${lego.codigo}")
            }

            else -> {
                println("Tipo de brinquedo inválido.")
            }
        }
    }

    fun removerBrinquedo() {
        println("Digite o ID do brinquedo que deseja remover:")
        val id = readLine()!!.toInt()

        if (brinquedos.remove(id) != null) {
            println("Brinquedo removido com sucesso!")
        } else {
            println("Brinquedo com ID $id não encontrado.")
        }
    }

    fun removerUltimoBrinquedo() {
        if (brinquedos.isNotEmpty()) {
            val ultimoId = brinquedos.keys.maxOrNull()
            brinquedos.remove(ultimoId)
            println("Último brinquedo (ID: $ultimoId) removido com sucesso!")
        } else {
            println("Nenhum brinquedo para remover.")
        }
    }

    fun exibirBrinquedos() {
        if (brinquedos.isEmpty()) {
            println("Nenhum brinquedo cadastrado.")
        } else {
            println("Brinquedos cadastrados:")
            brinquedos.forEach { (id, brinquedo) ->
                println("ID: $id -> $brinquedo")
            }
        }
    }

    fun buscarBrinquedo() {
        println("Digite o ID do brinquedo que deseja buscar:")
        val id = readln().toInt()
        val brinquedo = brinquedos[id]
        if (brinquedo != null) {
            println(brinquedo)
        } else {
            println("Chave não encontrada.")
        }
    }
    fun atualizarBrinquedo() {
        println("Digite o ID do brinquedo que deseja atualizar:")
        val id = readln().toInt()
        val brinquedo = brinquedos[id]

        if (brinquedo != null) {
            println("Digite a nova descrição do brinquedo:")
            brinquedo.descricao = readln()

            println("Brinquedo atualizado com sucesso!")
        } else {
            println("ID não encontrado.")
        }
    }

    fun gerarRelatorio() {
            if (brinquedos.isEmpty()) {
                println("Nenhum brinquedo cadastrado.")
                return
            }

            val somaPrecos = brinquedos.values.sumOf { it.preco }
            val mediaPrecos = somaPrecos / brinquedos.size

            println("Relatório:")
            println("Número total de brinquedos: ${brinquedos.size}")
            println("Soma dos preços: $somaPrecos")
            println("Média dos preços: $mediaPrecos")

    }
}



