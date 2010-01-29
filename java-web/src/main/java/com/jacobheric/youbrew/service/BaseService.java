/**
 * Description:  Base Service (abstract), defines a subset of shared services.
 * 
 * @author: jacob heric
 */
package com.jacobheric.youbrew.service;

import java.util.List;

public interface BaseService<T> {
   
   public T insert(T o) throws Exception;
   public T update(T o) throws Exception;
   public void delete(T o) throws Exception;
   public T findById(Long id) throws Exception;
   public List<T> findAll() throws Exception;  

}
