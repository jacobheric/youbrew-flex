/*
 * Description: Yeast domain object (original's autogened)
 * 
 * @author: jacob heric
 * Date: 1/27/2010
 *
 */

package com.jacobheric.youbrew.domain;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: yeast.
 * @author autogenerated
 */

@Entity
@Table(name = "yeast", catalog = "youbrew")
public class Yeast implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559010455L;
	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Integer attenuation;
	/** Field mapping. */
	private String description;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private String name;
	/** Field mapping. */

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Yeast() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Yeast(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param attenuation Integer object;
	 * @param id Integer object;
	 * @param name String object;
	 */
	public Yeast(Integer attenuation, Integer id, String name) {

		this.attenuation = attenuation;
		this.id = id;
		this.name = name;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Yeast.class;
	}
 

    /**
     * Return the value associated with the column: attenuation.
	 * @return A Integer object (this.attenuation)
	 */
	@Column( nullable = false  )
	public Integer getAttenuation() {
		return this.attenuation;
		
	}
	

  
    /**  
     * Set the value related to the column: attenuation.
	 * @param attenuation the attenuation value you wish to set
	 */
	public void setAttenuation(final Integer attenuation) {
		this.attenuation = attenuation;
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
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Yeast clone() throws CloneNotSupportedException {
		super.clone();  // keep hierarchy
        final Yeast copy = new Yeast();

		copy.setAttenuation(this.getAttenuation());
		copy.setDescription(this.getDescription());
		copy.setId(this.getId());
		copy.setName(this.getName());
		return copy;
	}
	
 
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("attenuation: " + this.getAttenuation() + ", ");
		sb.append("description: " + this.getDescription() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("name: " + this.getName() + ", ");
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
		
		final Yeast that; 
		try {
			that = (Yeast) proxyThat;
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
		result = result && (((getAttenuation() == null) && (that.getAttenuation() == null)) || (getAttenuation() != null && getAttenuation().equals(that.getAttenuation())));
		result = result && (((getDescription() == null) && (that.getDescription() == null)) || (getDescription() != null && getDescription().equals(that.getDescription())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
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
