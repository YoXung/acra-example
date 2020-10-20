package com.experian.acra.example;

import com.experian.acra.authorization.AuthorizationRequest;
import com.experian.acra.common.Credential;

/**
 * Copyright © 2020 Experian All Rights Reserved
 *
 * @author YoXung
 * @description 调用ACRA查询
 * @create 2020/10/20 7:21 下午
 */
public class CallAcra {
    public static void main(String[] args) {
        //AuthorizationRequest req = new AuthorizationRequest();
        Credential credential = new Credential();
        credential.setCredentialId("fdafda");
        System.out.println(credential.getCredentialId());
    }
}
