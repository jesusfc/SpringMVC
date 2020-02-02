package com.jesusfc.test.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jesusfc.test.business.model.user.User;


/**
 * @author Jesús Fernández
 */
/**
 * Utiliza la implemetanción de Spring. No se necesita implementar los metodos definidos en 
 * el interface JpaRepository. De esta forma solo necesitamos llamar a los metodos para
 * obtener los resultados. 
 *
 * Ver UserDirectJpaDaoTest
 */
public interface UserDirectJpaDao extends JpaRepository<User, Integer> { 
	
}
