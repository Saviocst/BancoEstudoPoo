class Conta(var titular: String, val numero: Int) {

    var saldo = 0.0
    private set  // Não pode ser alterada por fora da classe

    fun deposito(valor: Double){
        if (valor > 0){
            this.saldo += valor
            println("Deposito de $valor R$ da conta de $titular \n Saldo Total = $saldo")

        }else{
            println("Erro não e possivel deposito negativo")
        }
    }

    fun saque(valor: Double){
        if (saldo >= valor){
            saldo -= valor

            println("Saque de $valor R$ da conta de $titular \n Saldo Total = $saldo ")
        }
    }

    fun tranferencia(valor: Double, destino: Conta): Boolean{

        if(saldo >= valor){
            saldo -= valor
            destino.deposito(valor)
            //println("Foi transferido $valor R$ para conta de ${destino.titular}")
            return true

        }

        return false
    }
}