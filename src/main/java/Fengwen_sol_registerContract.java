import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Fengwen_sol_registerContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610277806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806317b7cf2b1461005157806328b99e281461007957806380c9419e1461008e578063e01a58c8146100b9575b600080fd5b61006461005f3660046101b9565b6100ca565b60405190151581526020015b60405180910390f35b61008c6100873660046101b9565b610136565b005b6100a161009c3660046101e9565b61018f565b6040516001600160a01b039091168152602001610070565b600054604051908152602001610070565b6000805b60005481101561013057826001600160a01b0316600082815481106100f5576100f5610202565b6000918252602090912001546001600160a01b03161415610119576001915061011e565b600091505b8061012881610218565b9150506100ce565b50919050565b61013f816100ca565b61018c57600080546001810182559080527f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5630180546001600160a01b0319166001600160a01b0383161790555b50565b6000818154811061019f57600080fd5b6000918252602090912001546001600160a01b0316905081565b6000602082840312156101cb57600080fd5b81356001600160a01b03811681146101e257600080fd5b9392505050565b6000602082840312156101fb57600080fd5b5035919050565b634e487b7160e01b600052603260045260246000fd5b600060001982141561023a57634e487b7160e01b600052601160045260246000fd5b506001019056fea2646970667358221220cd5b51c6dffc4ee12c2cfa48d9e91ddfd02ce8ded380625ad395d3951869f52b64736f6c634300080b0033";

    public static final String FUNC_ISREGISTED = "isRegisted";

    public static final String FUNC_LIST = "list";

    public static final String FUNC_READLIST = "readList";

    public static final String FUNC_REGISTE_USER = "registe_user";

    @Deprecated
    protected Fengwen_sol_registerContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Fengwen_sol_registerContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Fengwen_sol_registerContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Fengwen_sol_registerContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Boolean> isRegisted(String add) {
        final Function function = new Function(FUNC_ISREGISTED, 
                Arrays.<Type>asList(new Address(160, add)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> list(BigInteger param0) {
        final Function function = new Function(FUNC_LIST, 
                Arrays.<Type>asList(new Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> readList() {
        final Function function = new Function(FUNC_READLIST, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> registe_user(String add) {
        final Function function = new Function(
                FUNC_REGISTE_USER, 
                Arrays.<Type>asList(new Address(160, add)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Fengwen_sol_registerContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Fengwen_sol_registerContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Fengwen_sol_registerContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Fengwen_sol_registerContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Fengwen_sol_registerContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Fengwen_sol_registerContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Fengwen_sol_registerContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Fengwen_sol_registerContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Fengwen_sol_registerContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Fengwen_sol_registerContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Fengwen_sol_registerContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Fengwen_sol_registerContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Fengwen_sol_registerContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Fengwen_sol_registerContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Fengwen_sol_registerContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Fengwen_sol_registerContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
