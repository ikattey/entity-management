package eu.europeana.entitymanagement.definitions.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import dev.morphia.annotations.Embedded;
import eu.europeana.corelib.definitions.edm.entity.ContextualClass;

//import eu.europeana.corelib.definitions.edm.entity.ContextualClass;
@Embedded
public interface EntityRoot extends ContextualClass {

	public String[] getIdentifier();

	public void setIdentifier(String[] identifier);

	public String[] getIsRelatedTo();

	public void setIsRelatedTo(String[] isRelatedTo);

	public String getEntityId();

	public void setEntityId(String enitityId);

	public String getInternalType();
	
	public String setInternalType(String internalTypeParam);

	public String[] getSameAs();

	public String getDepiction();
	
	public void setDepiction(String depiction);


	/**
	 * Retrieves the preferable label for a contextual class (language,value)
	 * 
	 * @return A Map<String, String> for the preferable labels of a contextual class 
	 *         (one per language)
	 */
	public Map<String, String> getPrefLabelStringMap();
	
	/**
	 * @return
	 */
	Date getCreated();

	void setCreated(Date created);

	/**
	 * @return
	 */
	Date getModified();

	void setModified(Date modified);
	
	WebResource getReferencedWebResource();
	
	String getIsShownBy();
	
	void setIsShownBy (WebResource webResource);
}