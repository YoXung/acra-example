package com.experian.acra.acra;

import com.experian.acra.common.Credential;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Copyright © 2020 Experian All Rights Reserved
 *
 * @author YoXung
 * @description
 * @create 2020/10/20 7:26 下午
 */
@Data
public class AcraClient {
    @Value("authorization.server")
    private String authorization_server;
    @Value("resource.server")
    private String resource_server;
    private Credential credential;
}
