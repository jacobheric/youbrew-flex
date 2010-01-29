/**
 * Description:  A base dao class, consolidates shared dao activity, operates
 *   directly on the hibernate session factor.
 * 
 * @author jacob heric
 *
 */
package com.jacobheric.youbrew.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;

import com.jacobheric.youbrew.service.BaseService;

/**
 * @author jacob
 *
 */
@Transactional
@Scope("singleton")
public abstract class BaseDao<T> implements BaseService<T> {

   protected SessionFactory sessionFactory; //injected by Spring container
   @SuppressWarnings("unchecked")
   private final Class clazz;
   @SuppressWarnings("unchecked")
   private final Constructor noArgConstructor;

   /**
    * @param bo
    */
   @SuppressWarnings("unchecked")
   public BaseDao(T bo) {
      this.clazz = bo.getClass();
      try {
         this.noArgConstructor = this.clazz.getConstructor((Class[]) null);
      } catch (Exception e) {
         // Can't get the no argument constructor for this class,
         // let's throw a RuntimeException for this
         throw(new RuntimeException("Can't get the no argument constructor for " + clazz.toString(), e));
      }
   }

   /**
    * @return - hibernate sessionfactory
    */
   public SessionFactory getSessionFactory() {
      return sessionFactory;
   }

   /**
    * @param hibernate sessionfactory
    * Note injection by annotation.
    */
   @Autowired
   public void setSessionFactory(SessionFactory sessFactory) {
      this.sessionFactory = sessFactory;
   }

   /**
    * @param T - Extends BaseObject, determined by implementing classes.
    */
   public void delete(T o) {
      this.sessionFactory.getCurrentSession().delete(o);
   }

   /**
    * @param T - Extends BaseObject, determined by implementing classes.
    */
   public T update(T o) {
      return insert(o);
   }

   /**
    * @param T - Extends BaseObject, determined by implementing classes.
    */
   public T insert(T o) {
      this.sessionFactory.getCurrentSession().saveOrUpdate(o);
      return o;
   }

   /**
    * @param T - Extends BaseObject, determined by implementing classes.
    */
   @SuppressWarnings("unchecked")
   public List<T> findAll() {
      return (List<T>) this.sessionFactory.getCurrentSession().createCriteria(this.clazz).list();
   }

   /**
    * @return T - Extends BaseObject, determined by implementing classes.
    * @throws NoSuchMethodException
    * @throws InvocationTargetException
    * @throws IllegalAccessException
    * @throws InstantiationException
    * @throws SecurityException
    * @throws IllegalArgumentException
    */
   @SuppressWarnings("unchecked")
   public T findById(Long id) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      if(id != null) {
         return (T) this.sessionFactory.getCurrentSession().get(this.clazz, id);
      }
      else {
         return this.createEntity();
      }

   }

   /**
    * @return T - Extends BaseObject, determined by implementing classes.
    */
   @SuppressWarnings("unchecked")
   public T createEntity() {
      T newInstance = null;
      try {
         newInstance = (T) noArgConstructor.newInstance((Object []) null);
      }
      catch(Exception ex) {
         throw new RuntimeException();
      }
      return newInstance;
   }

}
