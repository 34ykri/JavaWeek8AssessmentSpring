
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Pokemon;

/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Feb 27, 2023
 */
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
