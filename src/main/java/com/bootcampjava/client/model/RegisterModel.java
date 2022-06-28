package com.bootcampjava.client.model;

import com.bootcampjava.client.domain.Client;
import com.bootcampjava.client.domain.Fund;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterModel {

    @JsonProperty("registerId")
    @Builder.Default
    private Long id = null;

    @Builder.Default
    private double amount = 0;

    @Builder.Default
    private Fund fund = null;

    @Builder.Default
    private Set<Client> client = null;
}
