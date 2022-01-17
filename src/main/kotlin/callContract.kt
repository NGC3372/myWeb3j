import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.StaticGasProvider
import java.math.BigInteger

fun main() {
   // registerContract.register()

   // registerContract.isRegisteted()
//    storageContract.addData("2020-10-1#123131")
    storageContract.getData()
}

object registerContract{
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    private val address = "0x46ac89282c836190913195c6590814d38624ddbd"
    private val  contract = Fengwen_sol_registerContract.load(address, web3, account, provider)

    fun register(){
        contract.registe_user(account.address).send()
    }

    fun isRegisteted(){
        println(account.address)
        println(contract.isRegisted(account.address).send())
    }

}

object storageContract{
    val web3 = myWeb3.localWeb3
    val account = myWeb3.localAccount
    val provider: ContractGasProvider = StaticGasProvider(BigInteger("100000"), BigInteger("200000"))
    private val address = "0x39fbd48274b1350e08f7685d8ad6d8bc50a51a64"
    private val  contract = Fengwen_sol_storageContract.load(address, web3, account, provider)

    fun addData(str :String) {
        contract.addData(str).send()

    }

    fun getData(){
        val list = contract.getlist().send()
        println(list)
    }

}