/*
 * Description: Recipe service interface contract. 
 * 
 * @author: jacob
 * Date: 1/27/2010
 *
 */
package com.jacobheric.youbrew.service;

import com.jacobheric.youbrew.domain.Recipe;

import java.util.List;

public interface RecipeService extends BaseService<Recipe> {
   
   /**
    * @param recipeName
    * @return List<Recipe> - recipes that match
    * @throws Exception
    */
  public List<Recipe> findByName(String recipeName) throws Exception;   
	
}
