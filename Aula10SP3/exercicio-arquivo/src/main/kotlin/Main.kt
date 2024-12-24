import java.io.FileReader
import java.io.FileWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

var contadorId = 1 // Para gerar IDs únicos

fun main() {
    var brinquedos = mutableListOf<Brinquedo>()

    while (true) {
        menu(brinquedos)
    }
}

fun menu(brinquedos: MutableList<Brinquedo>) {
    println(
        """
        Escolha uma opção:
            1 - Cadastrar Lego
            2 - Exibir a lista de Legos
            3 - Gravar CSV
            4 - Ler CSV
            5 - Gravar TXT
            6 - Ler TXT
            7 - Fim
        """.trimIndent()
    )
    opcoes(brinquedos)
}

fun opcoes(brinquedos: MutableList<Brinquedo>) {
    println("Selecione uma das opções digitando o número correspondente:")
    val escolhida = readln().toInt()

    when (escolhida) {
        1 -> {
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
                codigo = contadorId++,
                descricao = descricao,
                idadeMin = idadeMin,
                preco = preco,
                material = material,
                vidaUtil = vidaUtil,
                tipoBrincadeira = tipoBrincadeira
            )

            brinquedos.add(lego)
            println("Lego cadastrado com sucesso!")
        }
        2 -> {
            println("Lista de Legos cadastrados:")
            if (brinquedos.isEmpty()) {
                println("Nenhum Lego cadastrado.")
            } else {
                brinquedos.forEach { println(it) }
            }
        }
        3 -> {
            if (brinquedos.isEmpty()) {
                println("Não há nada a gravar.")
            } else {
                println("Digite o nome do arquivo CSV para gravar: dica - adicione a extensão csv ")
                val nomeArquivo = readln()
                gravarCsv(brinquedos, nomeArquivo)
            }
        }
        4 -> {
            println("Digite o nome do arquivo CSV para ler: dica - adicione a extensão csv ")
            val nomeArquivo = readln()
            lerCsv(nomeArquivo)
        }
        5 -> {
            if (brinquedos.isEmpty()) {
                println("Não há nada a gravar.")
            } else {
                println("Digite o nome do arquivo TXT para gravar: dica - adicione a extensão txt ")
                val nomeArquivo = readln()
                escreverArquivotxt(brinquedos, nomeArquivo)
            }
        }
        6 -> {
            println("Digite o nome do arquivo TXT para ler: dica - adicione a extensão txt ")
            val nomeArquivo = readln()
            lerArquivoTxt(nomeArquivo)
        }
        7 -> {
            println("Encerrando o programa.")
            return
        }
        else -> {
            println("Opção inválida.")
        }
    }
}

fun gravarCsv(brinquedos: List<Brinquedo>, nome: String) {
    val arquivo = FileWriter(nome)
    val saida = Formatter(arquivo)

    // Cabeçalho do CSV
    saida.format("ID;Descrição;Idade Mínima;Preço;Material;Vida Útil;Tipo de Brincadeira;Detalhes Específicos\n")

    for (brinquedo in brinquedos) {
        if (brinquedo is Lego) {
            saida.format(
                "%d;%s;%d;%.2f;%s;%d;%s;Número de peças: %d, Tema: %s\n",
                brinquedo.codigo,
                brinquedo.descricao,
                brinquedo.idadeMin,
                brinquedo.preco,
                brinquedo.material,
                brinquedo.vidaUtil,
                brinquedo.tipoBrincadeira,
                brinquedo.numPecas,
                brinquedo.tema
            )
        }
    }

    saida.close()
    arquivo.close()

    println("Arquivo CSV gravado com sucesso: $nome")
}

fun lerCsv(nome: String) {
    val arquivo = FileReader(nome)
    val leitor = Scanner(arquivo).useDelimiter(";|\\n")

    // Ignorar o cabeçalho
    if (leitor.hasNext()) leitor.nextLine()

    println(String.format("%3S %-20S %10S %7S %-10S %5S %-20S %-30S",
        "ID", "Descrição", "IdadeMin", "Preço", "Material", "Vida", "TipoBrincadeira", "Detalhes"))

    while (leitor.hasNext()) {
        val id = leitor.nextInt()
        val descricao = leitor.next()
        val idadeMin = leitor.nextInt()
        val preco = leitor.nextDouble()
        val material = leitor.next()
        val vidaUtil = leitor.nextInt()
        val tipoBrincadeira = leitor.next()
        val detalhes = leitor.next()

        println(String.format("%03d %-20.20s %-10d %7.2f %-10s %5d %-20s %-30s",
            id, descricao, idadeMin, preco, material, vidaUtil, tipoBrincadeira, detalhes))
    }

    leitor.close()
    arquivo.close()
    println("Leitura do arquivo CSV concluída.")
}

fun escreverArquivotxt(lista: List<Brinquedo>, nomeArquivo: String) {
    if (lista.isEmpty()) {
        println("Lista vazia. Não há nada a gravar!")
        return
    }

    val arquivo = FileWriter(nomeArquivo)
    val saida = Formatter(arquivo)

    // HEADER
    var header = "00BRINQUEDOS2024"
    header += LocalDateTime.now().format(DateTimeFormatter
        .ofPattern("dd-MM-yyyy HH:mm:ss"))
    header += "01"

    saida.format(header.toString() + "\n")

    // Corpo
    for (brinquedo in lista) {
        if (brinquedo is Lego) {
            val linha = StringBuilder()
            linha.append("02") // Tipo de registro
            linha.append(String.format("%08d", brinquedo.codigo)) // Código do brinquedo (8 caracteres)
            linha.append(String.format("%-50.50s", brinquedo.descricao)) // Descrição (50 caracteres)
            linha.append(String.format("%02d", brinquedo.idadeMin)) // Idade mínima (2 dígitos)
            linha.append(String.format("%07.2f", brinquedo.preco)) // Preço (7 caracteres)
            linha.append(String.format("%-10.10s", brinquedo.material)) // Material (10 caracteres)
            linha.append(String.format("%02d", brinquedo.vidaUtil)) // Vida útil (2 dígitos)
            linha.append(String.format("%-20.20s", brinquedo.tipoBrincadeira)) // Tipo de brincadeira (20 caracteres)
            linha.append(String.format(" NumPecas: %04d Tema: %-20.20s", brinquedo.numPecas, brinquedo.tema))

            saida.format(linha.toString() + "\n")
        }
    }

    var trailer = "01"
    trailer += String.format("%010d", lista.size)
    saida.format((trailer + "\n"))

    saida.close()
    arquivo.close()

    println("Gravação efetuada com sucesso!")
}
fun lerArquivoTxt(nomeArquivo: String) {
    val arquivo = FileReader(nomeArquivo)
    val leitor = Scanner(arquivo)
    val brinquedos = mutableListOf<Brinquedo>()

    println("Lendo arquivo $nomeArquivo...")

    while (leitor.hasNextLine()) {
        val linha = leitor.nextLine()
        if (linha.length < 2) {
            println("Linha inválida: $linha")
            continue
        }

        val registro = linha.substring(0, 2)

        when (registro) {
            "00" -> { // Header
                if (linha.length >= 34) {
                    val conteudo = linha.substring(2, 13).trim()
                    val dataHora = linha.substring(13, 32).trim()
                    val versao = linha.substring(32, 34).trim()
                    println("Header -> Conteúdo: $conteudo, Data/Hora: $dataHora, Versão: $versao")
                } else {
                    println("Linha de header inválida: $linha")
                }
            }

            "02" -> { // Corpo (dados do brinquedo)
                if (linha.length >= 131) {
                    try {
                        // Extração dos dados conforme o layout
                        val codigo = linha.substring(2, 10).trim().toInt()
                        val descricao = linha.substring(10, 60).trim()
                        val idadeMin = linha.substring(60, 62).toInt()
                        val preco = linha.substring(62, 69).replace(",", ".").toDouble()
                        val material = linha.substring(69, 79).trim()
                        val vidaUtil = linha.substring(79, 81).toInt()
                        val tipoBrincadeira = linha.substring(81, 101).trim()
                        val detalhes = linha.substring(101).trim()

                        // Verificação do tipo de brinquedo (Lego, Boneca, etc.)
                        val brinquedo = if (detalhes.startsWith("NumPecas")) {
                            val numPecas = detalhes.substringAfter("NumPecas: ").substringBefore(" Tema").toInt()
                            val tema = detalhes.substringAfter("Tema: ").trim()
                            Lego(
                                codigo = codigo,
                                descricao = descricao,
                                idadeMin = idadeMin,
                                preco = preco,
                                material = material,
                                vidaUtil = vidaUtil,
                                tipoBrincadeira = tipoBrincadeira,
                                numPecas = numPecas,
                                tema = tema
                            )
                        } else {
                            // Se for outro tipo de brinquedo, poderia ser aqui que você
                            // criaria Boneca ou outros objetos, conforme a necessidade.
                            null // Deixe como null para exemplo
                        }

                        brinquedo?.let { brinquedos.add(it) }
                    } catch (e: Exception) {
                        println("Erro ao processar linha de dados: $linha -> ${e.message}")
                    }
                } else {
                    println("Linha de dados inválida: $linha")
                }
            }

            "01" -> { // Trailer
                if (linha.length >= 7) {
                    val quantidadeRegistros = linha.substring(2, 7).toInt()
                    println("Trailer -> Quantidade de registros de dados: $quantidadeRegistros")
                } else {
                    println("Linha de trailer inválida: $linha")
                }
            }

            else -> {
                println("Tipo de registro desconhecido: $linha")
            }
        }
    }

    leitor.close()
    arquivo.close()

    // Exibir a lista de brinquedos
    println("\nLista de Legos lidos do arquivo:")
    if (brinquedos.isEmpty()) {
        println("Nenhum Lego foi cadastrado.")
    } else {
        brinquedos.forEach { println(it) }
    }
}
