package com.example.customerservice.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String email;




    public Customer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
