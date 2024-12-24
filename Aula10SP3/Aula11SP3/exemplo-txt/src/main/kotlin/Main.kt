import java.io.FileReader
import java.io.FileWriter
import java.lang.StringBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var alunos = mutableListOf<Aluno>()

    alunos.add(Aluno(
        "03231036", "Edson Morro", "SIS","Estrudigmas", 9.0,0))

    alunos.add(Aluno(
        "03231012", "Maria Paula", "SIS","Gestão de Projetos", 10.0,1))

    escreverArquivotxt(alunos, "notas.txt")
}

fun escreverArquivotxt(lista: List<Aluno>, nomeArquivo:String){
    val arquivo = FileWriter(nomeArquivo)
    val saida = Formatter(arquivo)

    // HEADER
    var header = "00NOTA20242"
    header += LocalDateTime.now()
        .format(DateTimeFormatter
            .ofPattern("dd-MM-yyyy HH:mm:ss")
        )
    header += "01"

    saida.format(header + "\n")

    for (aluno in lista){
        val linha = StringBuilder()
        linha.append("02")
        linha.append(String.format("%-5.5s", aluno.curso))
        linha.append(String.format("%-8.8s", aluno.ra))
        linha.append(String.format("%-50.50s", aluno.nome))
        linha.append(String.format("%-40.40s", aluno.disciplina))
        linha.append(String.format("%05.2f", aluno.media))
        linha.append(String.format("%03d", aluno.qtdFaltas))

        saida.format(linha.toString()+"\n")
        }

    //  TRAILER
    var trailer = "01"
    trailer += String.format("%010d", lista.size)
    saida.format((trailer + "\n"))

    saida.close()
    arquivo.close()

    lerArquivoTxt("notas.txt")
}

fun lerArquivoTxt(nomeArquivo: String){
    val arquivo = FileReader(nomeArquivo)
    val leitor = Scanner(arquivo)

    val listaAluno = mutableListOf<Aluno>()

    while(leitor.hasNext()) {

        val linha = leitor.nextLine()
        val registro = linha.substring(0,2)

        if (registro == "00"){
            val conteudo = linha.substring(2,6)
            val semestre = linha.substring(6,11)
            val dataHora = linha.substring(12,30)
            val versao = linha.substring(30,32)

            println("Conteúdo do arquivo: $conteudo")
            println("Semestre: $semestre")
            println("Data e hora: $dataHora")
            println("Versão: $versao")
        } else if (registro == "02") {
            val ra = linha.substring(7,15).trim()
            val nome = linha.substring(15,65).trim()
            val curso = linha.substring(2, 7).trim()
            val disciplina = linha. substring(65, 105).trim()
            val media = linha.substring(105,110).replace(",", ".").toDouble()
            val qtdFaltas = linha.substring(110,113).toInt()

            val aluno = Aluno(ra,nome,curso, disciplina, media, qtdFaltas)

            listaAluno.add(aluno)
        } else if( registro == "01") {
            val qtdRegistros = linha.substring(2,12).toInt()

            if (qtdRegistros == listaAluno.size) {
                println("Quantidade de registros corresponde" + "ao valor informado de $qtdRegistros")
            } else {
                println("Quantidade de registros NÃO corresponde" + "ao valor informado de $qtdRegistros")
            }
        }
    }

    leitor.close()
    arquivo.close()

    for (aluno in listaAluno){
        println(aluno)
    }
}

