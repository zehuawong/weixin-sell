package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 廖师兄
 * 2017-07-03 00:50
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxef749875304c8b96&secret=58332011f1a3e2ce9607df8c942a6f34&code=" + code + "&grant_type=authorization_code";
        /**注意这里使用的是测试账号的appid,
         1.代码中设置的微信APPsecret和微信开放平台不一致，需要您自己对照微信开放平台和代码中的appsecret， 检查修正。
        2.由于秘钥无效导致的，秘钥如果长时间不登录，会自动重置。
         **/
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
        //这里返回的response可以找到用户的openid
    }
}
