package cn.blmdz.wechat.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="other")
public class OtherProperties {
    private Boolean debugger = Boolean.FALSE.booleanValue();
    private ThirdProperties third;
}