/*
 * Description: Yeast DAO, implements the Yeast service & extends the baseDao 
 *   (even if just for remoting endpoints)
 * 
 * @author: jacob heric
 * Date: 1/27/2010
 *
 */
package com.jacobheric.youbrew.dao;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jacobheric.youbrew.domain.Yeast;
import com.jacobheric.youbrew.service.YeastService;


//PersistenceExceptions will be auto-translated due to @Repository
@Repository("yeastService")
@RemotingDestination(channels = { "my-amf" })
@Transactional
public class YeastDAO extends BaseDao<Yeast> implements YeastService {

	/**
	 * Constructor, see super class implementation.
	 */
	public YeastDAO() {
		super(new Yeast());
	}

	@RemotingInclude
   @Override
   public void delete(Yeast o) {
      // TODO Auto-generated method stub
      super.delete(o);
   }

	@RemotingInclude
   @Override
   public List<Yeast> findAll() {
      // TODO Auto-generated method stub
      return super.findAll();
   }

   @RemotingInclude
   @Override
   public Yeast findById(Long id) throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      // TODO Auto-generated method stub
      return super.findById(id);
   }

   @RemotingInclude
   @Override
   public Yeast insert(Yeast o) {
      // TODO Auto-generated method stub
      return super.insert(o);
   }

   @RemotingInclude
   @Override
   public Yeast update(Yeast o) {
      // TODO Auto-generated method stub
      return super.update(o);
   }

 
}
