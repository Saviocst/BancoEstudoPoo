fun main() {
    println("Bem vindo ao Banco Estudo")
    println()

    val savio = Funcionario(
        nome = "Sávio",
        cpf = "123.526.478-02",
        salario = 1200.0
    )

    val marilia = Gerente(
        nome = "Marília",
        cpf = "125.522.365.04",
        salario = 5000.0,
        senha = 123
    )

    val dalva = Diretor(
        nome = "Dalva",
        cpf = "222.896.477.08",
        salario = 8000.0,
        senha = 1517,
        prl = 200.0
    )

    val lucas  = Analista(
        nome = "Lucas",
        cpf = "215.666.487.54",
        salario = 1200.0
    )


    println("Apresentação do funcionário\n\nNome: ${savio.nome}\nCPF: ${savio.cpf}\nSalário: ${savio.salario}\nBonificação: ${savio.bonificacao()}")
    println()
    println("Apresentação do funcionário\n\nNome: ${marilia.nome}\nCPF: ${marilia.cpf}\nSalário: ${marilia.salario}\nBonificação: ${marilia.bonificacao()} ")
    println()
    println("Apresentação do funcionário\n\nNome: ${dalva.nome}\nCPF: ${dalva.cpf}\nSalário: ${dalva.salario}\nBonificação: ${dalva.bonificacao()}\nPRL: ${dalva.prl} ")
    println()
    println("Apresentação do funcionário\n\nNome: ${lucas.nome}\nCPF: ${lucas.cpf}\nSalário: ${lucas.salario}\nBonificação: ${lucas.bonificacao()}")
    println()

    if (marilia.autentica(123)) println("Autenticada com sucesso") else println("Erro de autenticação senha incorreta")

    val calculadora = CalculadoraBinificacao()
    calculadora.registra(savio)
    calculadora.registra(marilia)
    calculadora.registra(dalva)
    calculadora.registra(lucas)

    println("Total de binificação: ${calculadora.total}")


    // Curso 2 - topico 3 - video 5


}


