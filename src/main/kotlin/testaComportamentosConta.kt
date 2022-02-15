fun testaComportamentosConta() {   //ctrl + alt + m
    val contaSavio = Conta(titular = "Sávio", numero = 1)
//    contaSavio.titular = "Sávio"
//    contaSavio.numero = 1
    contaSavio.deposito(600.0)

    contaSavio.deposito(50.0)
    contaSavio.saque(100.0)

    println()
    println("Saldo de ${contaSavio.saldo} R$ na conta de ${contaSavio.titular}")

    //println("Número = ${contaSavio.numero}\nTitular = ${contaSavio.titular}\nSaldo = ${contaSavio.saldo}")

    println()

    val contaMarilia = Conta(titular = "Marília", numero = 2)
    println()
//    contaMarilia.titular = "Marília"
//    contaMarilia.numero = 2
    contaMarilia.deposito(5000.0)

    contaMarilia.deposito(100.0)
    contaMarilia.saque(1000.0)
    println()

    println("Saldo de ${contaMarilia.saldo} R$ na conta de ${contaMarilia.titular}")

    println()

    if (contaMarilia.tranferencia(1000.0, contaSavio)) {
        println("Trasferência sucedida")
    } else {
        println("Falha na Transferência")
    }
}
