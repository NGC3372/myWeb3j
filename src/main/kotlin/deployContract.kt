import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger


fun main() {
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    val request = Storage_sol_Storage.deploy(web3,account,provider)
    println(request.send().contractAddress)
}