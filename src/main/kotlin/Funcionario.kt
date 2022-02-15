open class Funcionario (  // o (open) e para qualquer classe poder herdar essa classe
    val nome: String,
    val cpf: String,
    val salario: Double
    ){


    open fun bonificacao(): Double = salario * 0.1

//        open val bonificacao: Double get() = salario * 0.1

    // Properties

//    override val bonificacao: Double
//    get() {
//        return  salario * 0.3
//    }


//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }

}