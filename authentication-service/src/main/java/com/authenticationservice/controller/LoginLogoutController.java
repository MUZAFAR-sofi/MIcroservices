package com.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authenticationservice.domain.ChangePassword;
import com.authenticationservice.domain.User;
import com.authenticationservice.service.UserService;

/**
 * 
 * @author sofiahmed
 *
 */
@RestController
@RequestMapping("/api/login")
@CrossOrigin
public class LoginLogoutController {

	@Autowired
	UserService mUserLoginService;


	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}

	@PostMapping(path = "/loginUser")
	public String login(@RequestBody User pUser) {

		String loginSuccess = "Failure";

		boolean isValidUser = mUserLoginService.verifyUser(pUser);

		if (isValidUser) {
			loginSuccess = "Success";
		}
		return loginSuccess;
	}

	@PostMapping(path = "/logout")
	public String logout(@RequestBody User pUser) {

		String loginSuccess = "Failure";

		boolean isValidUser = mUserLoginService.verifyUser(pUser);

		if (isValidUser) {
			loginSuccess = "Success";
		}
		return loginSuccess;
	}
	
	@PostMapping(path = "/changePassowrd")
	public String changePassword(@RequestBody ChangePassword pChangePassword) {

		String loginSuccess = "Failure";

		boolean isChanged = mUserLoginService.changePassword(pChangePassword);

		if (isChanged) {
			loginSuccess = "Success";
		}
		return loginSuccess;
	}
}
