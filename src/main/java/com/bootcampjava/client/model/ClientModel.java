package com.bootcampjava.client.model;

import com.bootcampjava.client.domain.Fund;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {
    @JsonProperty("clientId")
    @Builder.Default
    private Long id = null;

    @Builder.Default
    private String dni = null;

    @Builder.Default
    private String name = null;

    @Builder.Default
    private String surname = null;

    @Builder.Default
    private Fund fund = null;
}
