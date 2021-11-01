package rentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentapp.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}

