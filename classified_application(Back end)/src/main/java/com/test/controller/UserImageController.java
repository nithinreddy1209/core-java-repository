package com.test.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.test.model.Advertisement;
import com.test.model.User;
import com.test.model.UserImage;
import com.test.service.UserImageService;
import com.test.service.UserService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="http://localhost:4200")
public class UserImageController {
	
	@Autowired
	private UserImageService userImageService;
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/userimage")
	public ResponseEntity<?> addUserImage(@RequestParam("image") MultipartFile image,@RequestParam("user") User user) throws IOException
	{
		Optional<UserImage> check=userImageService.getUserImage(user.getId());
		Map<String, String> response=new HashMap<>();
		if(check.isEmpty()) {
			try
			{
				userImageService.addUserImage(image, user);
				response.put("status", "success");
				response.put("message", "file uploaded successfully!!");
				return new ResponseEntity<Map>(response,HttpStatus.CREATED);
			}
			catch(Exception e)
			{
				response.put("status", "failed");
				response.put("message", e.getMessage());
				return new ResponseEntity<Map>(response,HttpStatus.BAD_REQUEST);
			}
		}
		else
		{
			response.put("status", "failed");
			response.put("message","Profile Picture for user this has been uploaded already");
			return new ResponseEntity<Map>(response,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/userimage/{id}")
	public ResponseEntity<?> getFile(@PathVariable long id)
	{
		Map<String, String> response=new HashMap<>();
		Optional<User> check = userService.getUserById(id);
		if(check.isPresent())
		{
			Optional<UserImage> userImage= userImageService.getUserImage(check.get().getId());
			if(userImage.isPresent())
			{
				HttpHeaders headers=new HttpHeaders();
				headers.setContentType(MediaType.IMAGE_JPEG);
				return new ResponseEntity<byte[]>(userImage.get().getProfilePicture(),headers, HttpStatus.OK);
			}
			else
			{
				response.put("status", "failed");
				response.put("message","No user Image Found");
				return new ResponseEntity<Map>(response,HttpStatus.BAD_REQUEST);
			}
			
		}
		else
		{    
			response.put("status", "failed");
			response.put("message","No user Found");
			return new ResponseEntity<Map>(response,HttpStatus.BAD_REQUEST);
		}
	}

}
