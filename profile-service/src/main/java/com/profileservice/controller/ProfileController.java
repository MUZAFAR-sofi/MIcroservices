package com.profileservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {


	@PostMapping(path = "/updateProfile/")
	public String updateProfile(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("mobileNumber") String mobileNumber, @RequestPart MultipartFile file) {

		String fileUploaded = "Failure in File Upload";
		System.out.println("File  Service" + file.getName() + file.getContentType() + file.getSize());
		fileUploaded = "Successfully uploaded file";
		return fileUploaded;

	}
}
