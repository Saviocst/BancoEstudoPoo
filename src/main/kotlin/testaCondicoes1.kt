fun testaCondicoes1(saldo: Double) {    // Com When
    when {
        saldo > 0.0 -> println("Conta é Positiva")

        saldo == 0.0 -> println("Conta é Neutra")

        else -> println("Conta é negativa")
    }
}