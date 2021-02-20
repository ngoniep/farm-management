package com.sidekicks.chikuyofreshproduce.farmmanagement.Configs;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenRequestResponse {

     String access_token;
     String token_type;
     String refresh_token;
     int expires_in;
      String scope;
}
