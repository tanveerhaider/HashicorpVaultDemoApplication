package com.simplejava.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 4/30/2023
 * Time: 11:56 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String emailId;
    private String firstName;
    private String lastName;
    private String gender;
    private String cellPhone;
    private String zipCode;
    private String city;


}
