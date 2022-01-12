import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.core.DefaultBlockParameterName
import org.web3j.protocol.http.HttpService

fun main() {
    val web3 = myWeb3.web3
    val account = web3.ethAccounts()
    print(account.send().accounts)
    //val value = web3.ethGetBalance(account.address, DefaultBlockParameterName.LATEST)
    //print(value.send().balance)

}


