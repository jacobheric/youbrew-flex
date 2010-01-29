/*
 * Description: Recipe DAO, implements the recipe service & extends the baseDao
 * 
 * @author: jacob heric
 * Date: 1/27/2010
 *
 */
package com.jacobheric.youbrew.dao;


import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jacobheric.youbrew.domain.Recipe;
import com.jacobheric.youbrew.service.RecipeService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

//PersistenceExceptions will be auto-translated due to @Repository
@Repository("recipeService")
@RemotingDestination(channels = { "my-amf" })
@Transactional
public class RecipeDAO extends BaseDao<Recipe> implements RecipeService {

	/**
	 * Constructor, see super class implementation.
	 */
	public RecipeDAO() {
		super(new Recipe());
	}

   /**
    * @param recipeName
    * @return List<Recipe> - Recipes that match
    * @throws Exception
    */
	@RemotingInclude
   @SuppressWarnings("unchecked")
   public List<Recipe> findByName(String recipeName) throws Exception {
      List<Recipe> recipes = (List<Recipe>) 
         this.getSessionFactory().getCurrentSession().createCriteria(Recipe.class)
         .add( Restrictions.like("name", recipeName.trim(), MatchMode.ANYWHERE) ).list();
      return recipes;
   }

	@RemotingInclude
   @Override
   public void delete(Recipe o) {
      // TODO Auto-generated method stub
      super.delete(o);
   }

   @RemotingInclude
   @Override
   public List<Recipe> findAll() {
      // TODO Auto-generated method stub
      return super.findAll();
   }

   @RemotingInclude
   @Override
   public Recipe findById(Long id) throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      // TODO Auto-generated method stub
      return super.findById(id);
   }

   @RemotingInclude
   @Override
   public Recipe insert(Recipe o) {
      // TODO Auto-generated method stub
      return super.insert(o);
   }

   @RemotingInclude
   @Override
   public Recipe update(Recipe o) {
      // TODO Auto-generated method stub
      return super.update(o);
   }
}
