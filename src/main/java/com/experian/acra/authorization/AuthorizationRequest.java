package com.experian.acra.authorization;

import lombok.Data;
import lombok.Getter;

/**
 * Copyright © 2020 Experian All Rights Reserved
 *
 * @author YoXung
 * @description 授权请求
 * @create 2020/10/20 7:55 下午
 */
@Data
public class AuthorizationRequest {
    private String grant_type;
    private String scope ;

    public AuthorizationRequest() {

    }
}
