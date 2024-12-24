import java.io.FileReader
import java.io.FileWriter
import java.util.*

fun main() {
    var cachorros = mutableListOf(
        Cachorro(111, "Billy", "Grande", 25.65),
        Cachorro(2, "Balinha", "Pequeno", 5.62),
        Cachorro(3, "Carlinhos C", "Medio", 15.98)
    )

    fun gravarCsv(lista:List<Cachorro>, nome:String) {
        val arquivo = FileWriter(nome)
        val saida = Formatter(arquivo)

        for (cachorro in lista){
            saida.format("%d;%s;%s;%.2f\n", cachorro.id, cachorro.nome, cachorro.porte, cachorro.peso)
        }

        saida.close()
        arquivo.close()

    }

    fun lerCsv(nome:String){
        var arquivo = FileReader(nome)
        var leitor = Scanner(arquivo).useDelimiter(";|\\n")

        //Cabeçalho

        println(String.format("%3S %-10S %-10S %5S", "id", "nome", "porte", "peso"))

        while(leitor.hasNext()){
            var id = leitor.nextInt()
            var nome = leitor.next()
            var porte = leitor.next()
            var peso = leitor.nextDouble()

            println(String.format("%03d %-10.10s %-10s %5.2f", id, nome, porte, peso))
        }
        leitor.close()
        arquivo.close()
    }

    gravarCsv(cachorros, "pets.csv")

    lerCsv("pets.csv")
}