package pk.security.authorizationframework.repository;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pk.security.authorizationframework.entity.Role;

@Repository
@Resource
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);
}
