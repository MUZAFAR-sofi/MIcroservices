package com.authenticationservice.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.authenticationservice.security.service.MyUserDetailsService;

/**
 * 
 * @author sofahmed
 *
 */
/**
 *This Class is not used in order to make it work remove password encoder from main spring class
 *
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyUserDetailsService mUserDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder pAuthentication) throws Exception {
		//

		pAuthentication.userDetailsService(mUserDetailsService);
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().httpBasic().and().authorizeRequests().antMatchers("/credit-api/**")
				.authenticated().anyRequest().permitAll();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
