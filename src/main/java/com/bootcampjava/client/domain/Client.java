package com.bootcampjava.client.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String name;
    private String surname;
    private String phone;
    private String mail;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Fund fund;
}
