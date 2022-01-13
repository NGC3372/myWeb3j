import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService

object myWeb3 {
    private val localUrl = "http://112.74.35.138"
    private val ropsten = "https://ropsten.infura.io/v3/83b3315113a246e88abb1268847b4a5b"
    val ropstenAccount =  Credentials.create("DDA1EC2A2312151AC7D82CB9842B72C93EDCAD903B44A185387CD53FD2C29625");
    val localAccount =  Credentials.create("0xa0c94afb34b38d0b08d37104aa6d9f7521cabc994804c116459872fbbe956db0")
    val localWeb3  = Web3j.build(HttpService(localUrl))
    val ropstenlWeb3  = Web3j.build(HttpService(ropsten))
}