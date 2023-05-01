package com.simplejava.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 4/30/2023
 * Time: 8:40 PM
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties("app.config.auth")
public class VaultConfiguration {
    private String username;
    private String token;
}
