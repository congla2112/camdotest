package poly.com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.com.entities.Users;
import poly.com.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}





	@PostMapping
	public Users save(@RequestBody  Users users) {
		return userRepository.save(users);
	}
	

}
