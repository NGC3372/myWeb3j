// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.8.0;

contract registerContract{
    address[] public list;

    function isRegisted(address add) public view returns(bool ok){
        for(uint256 i = 0; i < list.length; i++)
            if(list[i] == add)
                ok = true;
            else
                ok = false;
    }

    function registe_user(address add) public {
        if(! isRegisted(add))
            list.push(add);
    }

    function readList() public view returns(uint256 len){
        len = list.length;
    }

}

contract storageContract{
    mapping(address=>string[])public data;
    address public con;

    constructor(address addr){
        con = addr;
    }

    function addData(string memory str) public{
        address add =  msg.sender;
        if(registerContract(con).isRegisted(add))
            data[add].push(str);
    }

    function updateData(uint256 position,string memory str)public{
        address add = msg.sender;
        if(registerContract(con).isRegisted(add))
            data[add][position] = str;

    }

    function getlist()public view returns(string[] memory list){
        list = data[msg.sender];
    }

}