package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by 廖师兄
 * 2017-07-03 01:31
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**
     * 公众平台id
     */
    private String mpAppId;

    /**
     * 公众平台密钥
     */
    private String mpAppSecret;

    /**
     * 开放平台id
     */
    private String openAppId;

    /**
     * 开放平台密钥
     */
    private String openAppSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;

    /**
     * 微信模版id
     */
    private Map<String, String> templateId;

    public String getMpAppId() {
        return mpAppId;
    }

    public String getMpAppSecret() {
        return mpAppSecret;
    }

    public String getOpenAppId() {
        return openAppId;
    }

    public String getOpenAppSecret() {
        return openAppSecret;
    }

    public String getMchId() {
        return mchId;
    }

    public String getMchKey() {
        return mchKey;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public Map<String, String> getTemplateId() {
        return templateId;
    }
}
