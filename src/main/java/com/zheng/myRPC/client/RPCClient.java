package com.zheng.myRPC.client;


import com.zheng.myRPC.common.RPCRequest;
import com.zheng.myRPC.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
