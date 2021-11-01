package rentapp.service;

import java.util.List;

import rentapp.model.User;
import rentapp.model.UserRequest;



public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
	User save(UserRequest userRequest);
}
