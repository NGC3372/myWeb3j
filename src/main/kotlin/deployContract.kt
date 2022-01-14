import org.web3j.protocol.core.DefaultBlockParameter
import org.web3j.protocol.core.DefaultBlockParameterName
import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger


fun main() {
    deployStorage(deployRegister())
}


fun deployRegister():String{
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    //println(account.address)
    //println(web3.ethGetBalance(account.address, DefaultBlockParameterName.LATEST).send().balance)
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000000000"), BigInteger("2000000"))
    val request = Fengwen_sol_registerContract.deploy(web3,account,provider)
    println("register: ${request.send().contractAddress}")
    return request.send().contractAddress
}

fun deployStorage(contractAddress: String){
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    //println(account.address)
    //println(web3.ethGetBalance(account.address, DefaultBlockParameterName.LATEST).send().balance)
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000000000"), BigInteger("2000000"))
    val request = Fengwen_sol_storageContract.deploy(web3,account,provider,contractAddress)
    println("storage ${request.send().contractAddress}")
}