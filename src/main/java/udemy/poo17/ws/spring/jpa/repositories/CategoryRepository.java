/**
 * 
 */
package udemy.poo17.ws.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import udemy.poo17.ws.spring.jpa.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
