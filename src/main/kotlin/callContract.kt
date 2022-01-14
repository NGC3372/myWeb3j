import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger

fun main() {
    registerContract.register()
    registerContract.isRegisteted()
    storageContract.addData("dgdgsdkl;kl;gds")
    storageContract.getData()
}

object registerContract{
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    private val address = "0x8e75a501e6c9d9dd375bfe3b466eb36bd04cc0f6"
    private val  contract = Fengwen_sol_registerContract.load(address, web3, account, provider)

    fun register(){
        contract.registe_user(account.address).send()
    }

    fun isRegisteted(){
        println(contract.isRegisted(account.address).send())
    }

}

object storageContract{
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    private val address = "0x8536488307b2bf1a81b5cdbdf157bfd0bfe592b1"
    private val  contract = Fengwen_sol_storageContract.load(address, web3, account, provider)

    fun addData(str :String) {
        contract.addData(str).send()

    }

    fun getData(){
        val list = contract.getlist().send()
        println(list)
    }


}