package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimen
 * @author Administrator
 *
 */
public interface ISpecimenService {

	/**
	 * Get specimens from persistance layer
	 * @param id a unique lookup
	 * @return a specimen with a matching ID
	 */
	
	SpecimenDTO fetchBy(int id);

	/**
	 * Persist the given DTO
	 * @param specimenDTO 
	 * @return a specimen with a matching ID
	 */
	void save(SpecimenDTO specimenDTO);

}