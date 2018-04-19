package com.lzwing.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chenzhongyong@cecdat.com
 * Date: 2018/4/19
 * Time: 15:52
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Applicaiton {

    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Applicaiton.class, args);
    }
}
