package com.sidekicks.chikuyofreshproduce.farmmanagement.Configs;



import feign.RequestInterceptor;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurations {



    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Content-Type", "application/json");
            requestTemplate.header("Accept", "application/json");
            requestTemplate.header("Authorization","Bearer "+ getToken());
        };
    }




   public String getToken(){
        HttpResponse<TokenRequestResponse> response = Unirest.post("http://10.170.3.46:9193/auth/api/oauth/token")
            .header("Authorization", "Basic bW9iaWxlOnBpbg==")
            .header("Cookie", "JSESSIONID=09B5C45EE297D152393BB596960EDC7E")
            .multiPartContent()
            .field("grant_type", "client_credentials")
            .asObject(TokenRequestResponse.class);
        return  response.getBody().getAccess_token();
    }
}
