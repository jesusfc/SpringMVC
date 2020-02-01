package com.jesusfc.test.database;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz para operaciones CRUD que deben proporcionar los modulos que sirvan como fuente de datos.
 * 
 * Define las operaciones genéricas contra fuentes de datos, expuestas a capas superiores.
 * 
 * Solo se debe usar Business Beans
 * 
 * Toda operacion CRUD debe realizarse a traves de este interfaz.
 * 
 * 
 * @param <B>
 *            Business bean
 */
public interface ICRUDDao<B> {

	/**
	 * Persiste el bean.
	 * 
	 * El bean pasado ahora tiene el ID y la version actualizados.
	 * 
	 * @param obj
	 */
	int save(B obj);

	/**
	 * Persiste los beans.
	 * 
	 * Los beans ahora tienen ID y version actualizados.
	 * 
	 * @param obj
	 */
	void persist(List<B> objs);

	/**
	 * Updatea el objeto en BD.
	 * 
	 * El bean pasado ahora tiene la version actualizada.
	 * 
	 * @param obj
	 */
	void update(B obj);

	/**
	 * Updatea los objetos en BD.
	 * 
	 * El bean pasado ahora tiene la version actualizada.
	 * 
	 * @param obj
	 */
	void update(Collection<B> objs);

	/**
	 * Borra el objeto de BD.
	 * 
	 * @param id
	 */
	void delete(String id);

	/**
	 * Borra los objetos de BD, objs solo es necesario que tengan el ID.
	 * 
	 * @param id
	 */
	void delete(List<B> objs);

	/**
	 * Obtiene todos los objetos de la tabla de BD depth = 1
	 */
	List<B> findAll();

	/**
	 * Obtiene todos los ids de objetos de Bd
	 * 
	 */
	List<String> getAllIds();

	/**
	 * Obtiene todos los objetos con profundidad = depth
	 *  
	 * @param depth
	 * @return
	 */
	List<B> getAll(int depth);
	
	/**
	 * Obtiene el numero total de objetos en la tabla de BD.
	 */
	int getTotalRows();

	/**
	 * Indica si existe el objeto con el ID dado en BD.
	 * 
	 * @param id
	 * @return
	 */
	boolean exists(String id);
	
	/**
	 * Devuelve el bean Depth = 0. IMPLICA ACCESO A BD. 
	 * Null si no existe.
	 * 
	 * @param id
	 * @return
	 */
	Optional<B> findById(Integer id);

	/**
	 * Construye el bean a partir del id accediendo a BD, con profundidad por defecto.
	 * 
	 * @param id
	 * @return
	 */
	B buildBean(String id);

	/**
	 * Construye el bean a partir del id accediendo a BD, indicando profundidad.
	 * 
	 * @param id
	 * @param depth
	 * @return
	 */
	B buildBean(String id, int depth);

	/**
	 * Metodo para obtener los beans completos a partir de otros que solo tienen el ID, con profundidad por defecto.
	 * 
	 * @param objs
	 * @return
	 */
	List<B> buildBeans(Collection<B> beans);

	/**
	 * Metodo para obtener los beans completos a partir de otros que solo tienen el ID, indicando profundidad.
	 * 
	 * @param beans
	 * @param depth
	 * @return
	 */
	List<B> buildBeans(Collection<B> beans, int depth);
	
	/**
	 * Metodo generico para busquedas sin paginacion 
	 * 
	 * @param filterBean
	 * @return
	 */
	List<B> executeQueryList(B filterBean);
	
	
	/**
	 * Metodo generico para busquedas con paginacion.
	 * 
	 * @param beanParam
	 * @param firstRow
	 * @param numRows
	 * @return
	 */
	/*
	PaginatedResult executePaginatedQuery(B filterBean, int firstRow, int numRows);
	*/
}
