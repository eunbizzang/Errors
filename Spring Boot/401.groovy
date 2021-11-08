

Error occured when I tested with Junit.

org.junit.ComparisonFailure: 
Expected :200 OK
Actual   :401 UNAUTHORIZED
<Click to see difference>

Solution :
Add "WebSecurityConfig.java"


In the current version of Spring Boot (v2.1.0.RELEASE), the easiest way to get rid of the security issues is to add "WebSecurityConfig.java" to your project as follows:

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

}

Link : https://stackoverflow.com/questions/45232071/springboot-401-unauthorized-even-with-out-security