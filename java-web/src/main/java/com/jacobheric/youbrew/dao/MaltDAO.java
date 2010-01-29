/*
 * Description: Malts DAO, implements the malt service & extends the baseDao 
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

import com.jacobheric.youbrew.domain.Malt;
import com.jacobheric.youbrew.service.MaltService;


//PersistenceExceptions will be auto-translated due to @Repository
@Repository("maltService")
@RemotingDestination(channels = { "my-amf" })
@Transactional
public class MaltDAO extends BaseDao<Malt> implements MaltService {

	/**
	 * Constructor, see super class implementation.
	 */
	public MaltDAO() {
		super(new Malt());
	}

	@RemotingInclude
   @Override
   public void delete(Malt o) {
      // TODO Auto-generated method stub
      super.delete(o);
   }

	@RemotingInclude
   @Override
   public List<Malt> findAll() {
      // TODO Auto-generated method stub
      return super.findAll();
   }

   @RemotingInclude
   @Override
   public Malt findById(Long id) throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      // TODO Auto-generated method stub
      return super.findById(id);
   }

   @RemotingInclude
   @Override
   public Malt insert(Malt o) {
      // TODO Auto-generated method stub
      return super.insert(o);
   }

   @RemotingInclude
   @Override
   public Malt update(Malt o) {
      // TODO Auto-generated method stub
      return super.update(o);
   }

 
}
