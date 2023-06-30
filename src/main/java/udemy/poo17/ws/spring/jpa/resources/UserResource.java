/**
 * 
 */
package udemy.poo17.ws.spring.jpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.poo17.ws.spring.jpa.entities.User;

/**
 * @author Matos
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Maria", "maria@gmail.com", "111 222 333", "123");
		return ResponseEntity.ok().body(user);
	}
}
