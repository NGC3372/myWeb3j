import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService

object myWeb3 {
    private val localUrl = "HTTP://127.0.0.1:7545"
    private val ropsten = "https://ropsten.infura.io/v3/83b3315113a246e88abb1268847b4a5b"
    val ropstenAccount =  Credentials.create("DDA1EC2A2312151AC7D82CB9842B72C93EDCAD903B44A185387CD53FD2C29625");
    val web3  = Web3j.build(HttpService(localUrl))
}