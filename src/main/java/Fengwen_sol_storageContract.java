import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
public class Fengwen_sol_storageContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506040516107f43803806107f483398101604081905261002f91610054565b600180546001600160a01b0319166001600160a01b0392909216919091179055610084565b60006020828403121561006657600080fd5b81516001600160a01b038116811461007d57600080fd5b9392505050565b610761806100936000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630b2cb3bc1461005c57806347dc424e1461008c57806389a8e2a7146100a1578063d4a2498d146100b6578063e283b4dd146100c9575b600080fd5b60015461006f906001600160a01b031681565b6040516001600160a01b0390911681526020015b60405180910390f35b6100946100e9565b60405161008391906104dd565b6100b46100af3660046105e2565b6101cb565b005b6100b46100c4366004610629565b61028e565b6100dc6100d7366004610666565b61033e565b604051610083919061069e565b33600090815260208181526040808320805482518185028101850190935280835260609492939192909184015b828210156101c2578382906000526020600020018054610135906106b8565b80601f0160208091040260200160405190810160405280929190818152602001828054610161906106b8565b80156101ae5780601f10610183576101008083540402835291602001916101ae565b820191906000526020600020905b81548152906001019060200180831161019157829003601f168201915b505050505081526020019060010190610116565b50505050905090565b6001546040516317b7cf2b60e01b81523360048201819052916001600160a01b0316906317b7cf2b90602401602060405180830381865afa158015610214573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061023891906106f3565b15610289576001600160a01b038116600090815260208190526040902080548391908590811061026a5761026a610715565b9060005260206000200190805190602001906102879291906103f7565b505b505050565b6001546040516317b7cf2b60e01b81523360048201819052916001600160a01b0316906317b7cf2b90602401602060405180830381865afa1580156102d7573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906102fb91906106f3565b1561033a576001600160a01b038116600090815260208181526040822080546001810182559083529181902084516102899391909101918501906103f7565b5050565b6000602052816000526040600020818154811061035a57600080fd5b90600052602060002001600091509150508054610376906106b8565b80601f01602080910402602001604051908101604052809291908181526020018280546103a2906106b8565b80156103ef5780601f106103c4576101008083540402835291602001916103ef565b820191906000526020600020905b8154815290600101906020018083116103d257829003601f168201915b505050505081565b828054610403906106b8565b90600052602060002090601f016020900481019282610425576000855561046b565b82601f1061043e57805160ff191683800117855561046b565b8280016001018555821561046b579182015b8281111561046b578251825591602001919060010190610450565b5061047792915061047b565b5090565b5b80821115610477576000815560010161047c565b6000815180845260005b818110156104b65760208185018101518683018201520161049a565b818111156104c8576000602083870101525b50601f01601f19169290920160200192915050565b6000602080830181845280855180835260408601915060408160051b870101925083870160005b8281101561053257603f19888603018452610520858351610490565b94509285019290850190600101610504565b5092979650505050505050565b634e487b7160e01b600052604160045260246000fd5b600082601f83011261056657600080fd5b813567ffffffffffffffff808211156105815761058161053f565b604051601f8301601f19908116603f011681019082821181831017156105a9576105a961053f565b816040528381528660208588010111156105c257600080fd5b836020870160208301376000602085830101528094505050505092915050565b600080604083850312156105f557600080fd5b82359150602083013567ffffffffffffffff81111561061357600080fd5b61061f85828601610555565b9150509250929050565b60006020828403121561063b57600080fd5b813567ffffffffffffffff81111561065257600080fd5b61065e84828501610555565b949350505050565b6000806040838503121561067957600080fd5b82356001600160a01b038116811461069057600080fd5b946020939093013593505050565b6020815260006106b16020830184610490565b9392505050565b600181811c908216806106cc57607f821691505b602082108114156106ed57634e487b7160e01b600052602260045260246000fd5b50919050565b60006020828403121561070557600080fd5b815180151581146106b157600080fd5b634e487b7160e01b600052603260045260246000fdfea2646970667358221220a8704fecfe9c3a68ebe2474fe7db6b219feb99499415c7e4a9aa69fc4ce53ec464736f6c634300080b0033";

    public static final String FUNC_ADDDATA = "addData";

    public static final String FUNC_CON = "con";

    public static final String FUNC_DATA = "data";

    public static final String FUNC_GETLIST = "getlist";

    public static final String FUNC_UPDATEDATA = "updateData";

    @Deprecated
    protected Fengwen_sol_storageContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Fengwen_sol_storageContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Fengwen_sol_storageContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Fengwen_sol_storageContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addData(String str) {
        final Function function = new Function(
                FUNC_ADDDATA, 
                Arrays.<Type>asList(new Utf8String(str)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> con() {
        final Function function = new Function(FUNC_CON, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> data(String param0, BigInteger param1) {
        final Function function = new Function(FUNC_DATA, 
                Arrays.<Type>asList(new Address(160, param0),
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<List> getlist() {
        final Function function = new Function(FUNC_GETLIST, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> updateData(BigInteger position, String str) {
        final Function function = new Function(
                FUNC_UPDATEDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(position), 
                new Utf8String(str)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Fengwen_sol_storageContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Fengwen_sol_storageContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Fengwen_sol_storageContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Fengwen_sol_storageContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Fengwen_sol_storageContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Fengwen_sol_storageContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Fengwen_sol_storageContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Fengwen_sol_storageContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Fengwen_sol_storageContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String addr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, addr)));
        return deployRemoteCall(Fengwen_sol_storageContract.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Fengwen_sol_storageContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String addr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, addr)));
        return deployRemoteCall(Fengwen_sol_storageContract.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Fengwen_sol_storageContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String addr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, addr)));
        return deployRemoteCall(Fengwen_sol_storageContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Fengwen_sol_storageContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String addr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, addr)));
        return deployRemoteCall(Fengwen_sol_storageContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
