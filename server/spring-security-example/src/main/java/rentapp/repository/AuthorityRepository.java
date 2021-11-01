package rentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentapp.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	Authority findByName(String name);
}
