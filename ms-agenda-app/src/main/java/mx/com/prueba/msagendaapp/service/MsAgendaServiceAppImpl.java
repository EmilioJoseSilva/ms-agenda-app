package mx.com.prueba.msagendaapp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.prueba.msagendaapp.dao.ContactoEntity;
import mx.com.prueba.msagendaapp.dao.ContactoEntityDao;

/**
 * 
 * @author ejoses
 *
 */
@Service
public class MsAgendaServiceAppImpl implements MsAgendaServiceApp{
	@Autowired
	private ContactoEntityDao clienteEntityDao;
	
	/**
	 * @apiNote get all contact list
	 * @return ArrayList<ContactoEntity>
	 */
	@Override
	public ArrayList<ContactoEntity> getAll() {
		return clienteEntityDao.getAllContactos();
	}

	/**
	 * @apiNote add new contact
	 * @param clienteEntity
	 * @return new ContactoEntity or null
	 */
	@Override
	public ContactoEntity addContacto(ContactoEntity clienteEntity) {
		return clienteEntityDao.addContacto(clienteEntity);
	}

	/**
	 * @apiNote delete contact by idContacto
	 * @param idCliente
	 * @return deleted ContactoEntity or null
	 */
	@Override
	public ContactoEntity deleteContacto(Integer idContacto) {
		return clienteEntityDao.deleteContacto(idContacto);
	}

	/**
	 * @apiNote 
	 * @param contactoEntity
	 * @return deleted ContactoEntity or null
	 */
	@Override
	public ContactoEntity deleteContacto(ContactoEntity contactoEntity) {
		return clienteEntityDao.deleteContacto(contactoEntity);
	}

	/**
	 * delete contact by ContactoEntity
	 * @param contactoEntity
	 * @return updated ContactoEntity or null
	 */
	@Override
	public ContactoEntity updateContacto(ContactoEntity contactoEntity) {
		return clienteEntityDao.updateContacto(contactoEntity);
	}
	
	
}
