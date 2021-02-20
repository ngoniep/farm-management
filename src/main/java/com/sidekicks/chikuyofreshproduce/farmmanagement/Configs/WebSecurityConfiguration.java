package com.sidekicks.chikuyofreshproduce.farmmanagement.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.endpoint.NimbusAuthorizationCodeTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizationRequestRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Order(50)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/health", "/login**", "/error**").permitAll()
//            .anyRequest().authenticated()
//            .and().logout().logoutUrl("/logout").logoutSuccessUrl("/")
//            .and().oauth2Login();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
             .oauth2Login().clientRegistrationRepository(clientRegistrationRepository())
            .permitAll()
            //.loginPage("/common/login.html")
            .loginProcessingUrl("/login")
            //.failureUrl("/common/error.html")
            .defaultSuccessUrl("/oauth/authorize")
            // .passwordParameter("password")
            .and().authorizeRequests()
            .antMatchers("/code/*","/oauth/*","/oauth/**","/profile/post-personal-details/*","/profile/post-personal-details/**","/swagger-resources/**", "/swagger-ui.html", "/webjars/**", "/api-docs/**","/spring-security-rest/**","/api/swagger-ui.html","/swagger-ui/").permitAll()
            .antMatchers("/userAvailable/**").permitAll()
            .antMatchers("/health","**/health","*/health","**/swagger-ui/**","/common/**", "/v2/api-docs", "/configuration/ui", "/swagger-resources",
                "/configuration/security", "/swagger-ui.html", "/webjars/**","/health","**/health","*/health","/swagger-ui/").permitAll()
            .antMatchers("/*").hasAnyRole("Role_admin", "Role_operator")
            .anyRequest().authenticated()
            .and()
            .csrf()
            .and()
            .logout().logoutUrl("/logout").
             logoutSuccessUrl("/").permitAll();
    }
    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        List<ClientRegistration> registrations = new ArrayList<>();
        registrations.add(oauth2ClientRegistration());
        return new InMemoryClientRegistrationRepository(registrations);
    }

    private ClientRegistration oauth2ClientRegistration() {
        return ClientRegistration.withRegistrationId("oauth2")
            .clientId("mobile")
            .clientSecret("pin")
            .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
            .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
           // .redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}")
            .authorizationUri("http://10.170.3.46:8080/auth/api/oauth/authorize")
            .tokenUri("http://10.170.3.46:8080/auth/api/oauth/token")
            .userInfoUri("http://10.170.3.46:8080/auth/api/oauth/userinfo")
            .redirectUriTemplate("http://10.170.3.46:8080/auth/api/oauth/code'")
            .clientName("Oauth2").build();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //   web.ignoring().antMatchers("*/signup/**","*/code*");
        web.ignoring().antMatchers("/common/**", "/v2/api-docs", "/configuration/ui", "/swagger-resources",
            "/configuration/security", "/swagger-ui.html", "/webjars/**","/health","**/health","*/health","/swagger-ui/");
    }
//private final String[] PERMIT_ALL = {"/health", "unsecured-endpoint2", "..."};
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers(PERMIT_ALL).permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .oauth2Login()
//
//            .authorizationEndpoint()
//            .baseUri("/auth/api/oauth") //default is "/oauth2/authorization"
//            .and()
//
//            .tokenEndpoint()
//            .accessTokenResponseClient(accessTokenResponseClient())
//            .and()
//
//            //.redirectionEndpoint()
//            //.baseUri("/oauth2/redirect") //base for google is "/login/oauth2/code"
//            //.and()
//
//            .userInfoEndpoint().oidcUserService(new OidcUserService(){
//            @Override
//            public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
//                return super.loadUser(userRequest);
//            }
//        });

  //  }

    @Bean
    public AuthorizationRequestRepository<OAuth2AuthorizationRequest> authorizationRequestRepository(){
        return new HttpSessionOAuth2AuthorizationRequestRepository();
    }


    @Bean
    public OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> accessTokenResponseClient(){
        return new NimbusAuthorizationCodeTokenResponseClient();
    }

    @Bean
    protected AuthenticationManager getAuthenticationManager() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    PasswordEncoder passwordEncoder() {

        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }




}
