/*
 * Description: Hop domain object (original's autogened)
 * 
 * @author: jacob heric
 * Date: 1/27/2010
 *
 */

package com.jacobheric.youbrew.domain;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: hop
 */

@Entity
@Table(name = "hop", catalog = "youbrew")
public class Hop implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559010460L;
	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private String alpha;
	/** Field mapping. */
	private String description;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private String origin;
	/** Field mapping. */

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Hop() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Hop(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param alpha String object;
	 * @param id Integer object;
	 * @param name String object;
	 */
	public Hop(String alpha, Integer id, String name) {

		this.alpha = alpha;
		this.id = id;
		this.name = name;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Hop.class;
	}
 

    /**
     * Return the value associated with the column: alpha.
	 * @return A String object (this.alpha)
	 */
	@Column( nullable = false, length = 45  )
	public String getAlpha() {
		return this.alpha;
		
	}
	

  
    /**  
     * Set the value related to the column: alpha.
	 * @param alpha the alpha value you wish to set
	 */
	public void setAlpha(final String alpha) {
		this.alpha = alpha;
	}

    /**
     * Return the value associated with the column: description.
	 * @return A String object (this.description)
	 */
	@Column( length = 1028  )
	public String getDescription() {
		return this.description;
		
	}
	

  
    /**  
     * Set the value related to the column: description.
	 * @param description the description value you wish to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@Column( name = "id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
			SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Column( nullable = false, length = 128  )
	public String getName() {
		return this.name;
		
	}
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

    /**
     * Return the value associated with the column: origin.
	 * @return A String object (this.origin)
	 */
	@Column( length = 45  )
	public String getOrigin() {
		return this.origin;
		
	}
	

  
    /**  
     * Set the value related to the column: origin.
	 * @param origin the origin value you wish to set
	 */
	public void setOrigin(final String origin) {
		this.origin = origin;
	}



   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Hop clone() throws CloneNotSupportedException {
		super.clone();  // keep hierarchy
        final Hop copy = new Hop();

		copy.setAlpha(this.getAlpha());
		copy.setDescription(this.getDescription());
		copy.setId(this.getId());
		copy.setName(this.getName());
		copy.setOrigin(this.getOrigin());
		return copy;
	}
	
 
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("alpha: " + this.getAlpha() + ", ");
		sb.append("description: " + this.getDescription() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("name: " + this.getName() + ", ");
		sb.append("origin: " + this.getOrigin() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Hop that; 
		try {
			that = (Hop) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getAlpha() == null) && (that.getAlpha() == null)) || (getAlpha() != null && getAlpha().equals(that.getAlpha())));
		result = result && (((getDescription() == null) && (that.getDescription() == null)) || (getDescription() != null && getDescription().equals(that.getDescription())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
		result = result && (((getOrigin() == null) && (that.getOrigin() == null)) || (getOrigin() != null && getOrigin().equals(that.getOrigin())));
		return result;
	}
	
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
						newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {
							newHashCode = super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	
	

	
}
