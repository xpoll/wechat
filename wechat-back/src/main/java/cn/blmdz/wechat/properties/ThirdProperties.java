package cn.blmdz.wechat.properties;

import lombok.Data;

@Data
public class ThirdProperties {
    private String domain; // for redirectUrl
    private CommonProperties alipay;
    private CommonProperties baidu;
    private CommonProperties sina;
}