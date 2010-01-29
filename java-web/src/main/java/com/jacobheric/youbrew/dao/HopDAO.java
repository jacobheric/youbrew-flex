/*
 * Description: Hop DAO, implements the hop service & extends the baseDao 
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

import com.jacobheric.youbrew.domain.Hop;
import com.jacobheric.youbrew.service.HopService;


//PersistenceExceptions will be auto-translated due to @Repository
@Repository("hopService")
@RemotingDestination(channels = { "my-amf" })
@Transactional
public class HopDAO extends BaseDao<Hop> implements HopService {

	/**
	 * Constructor, see super class implementation.
	 */
	public HopDAO() {
		super(new Hop());
	}

	@RemotingInclude
   @Override
   public void delete(Hop o) {
      // TODO Auto-generated method stub
      super.delete(o);
   }

	@RemotingInclude
   @Override
   public List<Hop> findAll() {
      // TODO Auto-generated method stub
      return super.findAll();
   }

   @RemotingInclude
   @Override
   public Hop findById(Long id) throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      // TODO Auto-generated method stub
      return super.findById(id);
   }

   @RemotingInclude
   @Override
   public Hop insert(Hop o) {
      // TODO Auto-generated method stub
      return super.insert(o);
   }

   @RemotingInclude
   @Override
   public Hop update(Hop o) {
      // TODO Auto-generated method stub
      return super.update(o);
   }

 
}
