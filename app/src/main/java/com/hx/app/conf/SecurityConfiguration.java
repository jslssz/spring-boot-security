package com.hx.app.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author jxlgcmh
 * @create 2019-07-11 21:42
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**").authorizeRequests()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
				.and()
				.oauth2Login();
	}
}