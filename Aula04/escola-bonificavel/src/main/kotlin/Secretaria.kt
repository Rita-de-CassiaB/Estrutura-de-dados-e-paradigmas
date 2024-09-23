class Secretaria (
    nome:String,
    cpf:String,
    var salario:Double,
    var extra:Double

    ):Funcionario(nome, cpf){
    override fun calculaSalario():Double {
       return salario + extra

        }

    override fun toString(): String {
        return """
            Nome: $nome,
            CPF: $cpf
            Salario: $salario
            Extra: $extra
            Total: ${calculaSalario()}
            
            
        """.trimIndent()
    }
    }