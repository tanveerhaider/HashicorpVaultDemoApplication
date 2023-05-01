package com.simplejava.app.config.service;

import com.simplejava.app.config.VaultConfiguration;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 4/30/2023
 * Time: 8:41 PM
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class VaultConfigurationService {
    private final VaultConfiguration vaultConfiguration;

    @PostConstruct
    public void readConfigurationFromVault(){
        log.info("*** Reading Vault Configuration****");
        log.info("Reading configuration {} - {} \n", vaultConfiguration.getToken(), vaultConfiguration.getUsername());
    }
}
