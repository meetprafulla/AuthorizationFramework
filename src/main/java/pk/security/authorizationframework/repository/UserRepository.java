package pk.security.authorizationframework.repository;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pk.security.authorizationframework.entity.User;

@Repository
@Resource
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
