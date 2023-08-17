package com.test.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.test.model.User;
import com.test.model.UserImage;
import com.test.repository.UserImageRepository;

@Service
public class UserImageService {
	
	@Autowired
	private UserImageRepository userImageRepository;
	
	public UserImage addUserImage(MultipartFile image,  User user) throws IOException
	{
		
		UserImage userImage=new UserImage();
		
		userImage.setProfilePicture(image.getBytes());
		userImage.setUser(user);
		
		return userImageRepository.save(userImage);
		
	}
	
	public Optional<UserImage> getUserImage(long id)
	{
		return userImageRepository.findImageByUserId(id);
	}

}
