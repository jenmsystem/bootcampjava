package com.bootcampjava.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FundModel {

    @JsonProperty("fundId")
    @Builder.Default
    private Long id = null;

    @Builder.Default
    private String name = null;
}
