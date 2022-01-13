import org.web3j.protocol.core.DefaultBlockParameter
import org.web3j.protocol.core.DefaultBlockParameterName
import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger


fun main() {
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    println(account.address)
    println(web3.ethGetBalance(account.address, DefaultBlockParameterName.LATEST).send().balance)
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000000000"), BigInteger("2000000"))
    val request = Storage_sol_Storage.deploy(web3,account,provider)
    println(request.send().contractAddress)
}