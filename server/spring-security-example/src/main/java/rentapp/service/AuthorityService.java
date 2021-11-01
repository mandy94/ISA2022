package rentapp.service;

import java.util.List;

import rentapp.model.Authority;


public interface AuthorityService {
	List<Authority> findById(Long id);
	List<Authority> findByname(String name);
}
