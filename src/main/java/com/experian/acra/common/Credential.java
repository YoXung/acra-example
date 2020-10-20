package com.experian.acra.common;

import lombok.Data;

/**
 * Copyright © 2020 Experian All Rights Reserved
 *
 * @author YoXung
 * @description ACRA凭证
 * @create 2020/10/20 7:24 下午
 */
@Data
public class Credential {
    private String credentialId;
    private String credentialKey;
}
