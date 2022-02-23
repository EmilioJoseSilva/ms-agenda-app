package mx.com.prueba.msagendaapp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author ejoses
 *
 */
@Repository
public class ContactoEntityDao {
	private static ArrayList<ContactoEntity> list =  new ArrayList<> ();
	private static int listSize = 4;
	
	static {
		list.add(new ContactoEntity (1,"Emilio"	,"1122334455"));
		list.add(new ContactoEntity (2,"Agustin"	,"2233445566"));
		list.add(new ContactoEntity (3,"Jose"		,"3344556677"));
		list.add(new ContactoEntity (4,"Silvia"	,"4455667788"));
	}
	
	/**
	 * @apiNote get all contact list
	 * @return
	 */
	public ArrayList<ContactoEntity> getAllContactos (){
		return list;
	}
	
	/**
	 * @apiNote add new contact
	 * @param clienteEntity
	 * @return
	 */
	public ContactoEntity addContacto (ContactoEntity clienteEntity) {
		if(clienteEntity.getIdContacto()==null) {
			clienteEntity.setIdContacto(++listSize);
		}
		list.add(clienteEntity);
		return clienteEntity;
	}
	
	/**
	 * @apiNote delete contact
	 * @param idCliente
	 * @return
	 */
	public ContactoEntity deleteContacto(Integer idCliente) {
		Iterator<ContactoEntity> iterator = list.iterator();
		while(iterator.hasNext()) {
			ContactoEntity row = iterator.next();
			if(row.getIdContacto() == idCliente) {
				iterator.remove();
				return row;
			}
		}
		return null;
	}
	
	/**
	 * @apiNote delete contact
	 * @param contactoEntity
	 * @return
	 */
	public ContactoEntity deleteContacto(ContactoEntity contactoEntity) {
		Iterator<ContactoEntity> iterator = list.iterator();
		while(iterator.hasNext()) {
			ContactoEntity row = iterator.next();
			if(row.getIdContacto() == contactoEntity.getIdContacto()) {
				iterator.remove();
				return row;
			}
		}
		return null;
	}
	
	/**
	 * @apiNote update contact
	 * @param contactoEntity
	 * @return
	 */
	public ContactoEntity updateContacto(ContactoEntity contactoEntity) {
		for (int i = 0; i<list.size();i++) {
			ContactoEntity row = list.get(i);
			if(row.getIdContacto() == contactoEntity.getIdContacto()) {
				row = contactoEntity;
				list.remove(i);
				list.add(i, row);
				return row;
			}
		}
		return null;
	}
}
