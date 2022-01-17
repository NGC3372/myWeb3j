import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService

object myWeb3 {
    private val localUrl = "http://112.74.35.138"
    val localAccount =  Credentials.create("0xb235fcc5da872243bfa42cc907ad33bbb062db9f82244900ea959f68b317ae3a")

    private val ropsten = "https://ropsten.infura.io/v3/83b3315113a246e88abb1268847b4a5b"
    val ropstenAccount =  Credentials.create("DDA1EC2A2312151AC7D82CB9842B72C93EDCAD903B44A185387CD53FD2C29625");

    val localWeb3  = Web3j.build(HttpService(localUrl))
    val ropstenlWeb3  = Web3j.build(HttpService(ropsten))
}