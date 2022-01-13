import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger

fun main() {
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    val contract = Storage_sol_Storage.load("0xcacb96ce2beb943c0069b46c6e475543f76017be",
        web3,account,provider)

    //val recipt = contract.store(BigInteger("100000")).send()
    //println("Txhash: ${recipt.transactionHash}")
    println("===========================")
    println("result value: ${contract.retrieve().send()}")
}