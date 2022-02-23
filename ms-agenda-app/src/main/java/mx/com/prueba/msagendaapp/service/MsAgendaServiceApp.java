package mx.com.prueba.msagendaapp.service;

import java.util.ArrayList;
import mx.com.prueba.msagendaapp.dao.ContactoEntity;

/**
 * 
 * @author ejoses
 *
 */
public interface MsAgendaServiceApp {
	
	/**
	 * @apiNote get all contact list
	 * @return ArrayList<ContactoEntity>
	 */
	public ArrayList<ContactoEntity> getAll ();
	
	/**
	 * @apiNote add new contact
	 * @param clienteEntity
	 * @return new ContactoEntity or null
	 */
	public ContactoEntity addContacto (ContactoEntity clienteEntity);
	
	/**
	 * @apiNote delete contact by idContacto
	 * @param idCliente
	 * @return deleted ContactoEntity or null
	 */
	public ContactoEntity deleteContacto (Integer idContacto);
	
	/**
	 * @apiNote 
	 * @param contactoEntity
	 * @return deleted ContactoEntity or null
	 */
	public ContactoEntity deleteContacto (ContactoEntity contactoEntity);
	
	/**
	 * @apiNote update contact by ContactoEntity
	 * @param contactoEntity
	 * @return updated ContactoEntity or null
	 */
	public ContactoEntity updateContacto (ContactoEntity contactoEntity);
}
