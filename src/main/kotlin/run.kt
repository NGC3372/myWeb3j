import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.core.DefaultBlockParameterName
import org.web3j.protocol.http.HttpService

fun main() {
    val web3 = Web3j.build(HttpService("https://ropsten.infura.io/v3/83b3315113a246e88abb1268847b4a5b"))
    val account =  Credentials.create("DDA1EC2A2312151AC7D82CB9842B72C93EDCAD903B44A185387CD53FD2C29625");
    val value = web3.ethGetBalance(account.address, DefaultBlockParameterName.LATEST)
    print(value.send().balance)

}


