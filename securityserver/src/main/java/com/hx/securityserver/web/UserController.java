package com.hx.securityserver.web;

/**
 * @author jxlgcmh
 * @create 2019-07-11 21:13
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
	
	@GetMapping("/user/me")
	public Principal user(Principal principal) {
		return principal;
	}
}