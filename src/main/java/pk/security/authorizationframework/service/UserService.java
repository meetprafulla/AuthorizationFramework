package pk.security.authorizationframework.service;

import java.util.List;

import pk.security.authorizationframework.entity.Role;
import pk.security.authorizationframework.entity.User;


public interface UserService {
	User saveUser(User user);

	Role saveRole(Role role);

	void addRoleToUser(String username, String rolename);

	User getUser(String username);
	
	List<User> getAllUsers();
}
