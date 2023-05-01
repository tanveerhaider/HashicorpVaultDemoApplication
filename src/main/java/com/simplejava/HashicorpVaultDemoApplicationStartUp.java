package com.simplejava;

import com.simplejava.customer.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 4/30/2023
 * Time: 11:52 PM
 */

@Slf4j
@Component
@AllArgsConstructor
public class HashicorpVaultDemoApplicationStartUp implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    @Override
    public void run(String... args) throws Exception {
     log.info("Application starting");
     log.info(" Total count of rows in tables::"+customerRepository.count());
    }
}
