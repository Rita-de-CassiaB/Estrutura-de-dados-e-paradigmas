import java.io.FileReader
import java.util.Scanner

class Cachorro (
    var id: Int,
    var nome:String,
    var porte: String,
    var peso: Double
) {
    override fun toString(): String {
        return "Cachorro(id=$id, nome=$nome, porte=$porte, peso=$peso)"
    }



}