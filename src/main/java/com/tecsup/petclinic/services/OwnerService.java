package com.tecsup.petclinic.services;

import com.tecsup.petclinic.dtos.OwnerDTO;
import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exceptions.OwnerNotFoundException;

import java.util.List;

/**
 * 
 * @author jgomezm
 *
 */
public interface OwnerService {

	/**
	 * 
	 * @param ownerDTO
	 * @return
	 */
	OwnerDTO create(OwnerDTO ownerDTO);

	/**
	 * 
	 * @param ownerDTO
	 * @return
	 */
	OwnerDTO update(OwnerDTO ownerDTO);

	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException
	 */
	void delete(Long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	OwnerDTO findById(Long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param firstName
	 * @return
	 */
	List<OwnerDTO> findByFirstName(String firstName);

	/**
	 * 
	 * @param lastName
	 * @return
	 */
	List<OwnerDTO> findByLastName(String lastName);

	/**
	 * 
	 * @param city
	 * @return
	 */
	List<Owner> findByCity(String city);

	/**
	 *
	 * @return
	 */
	List<Owner> findAll();
}
