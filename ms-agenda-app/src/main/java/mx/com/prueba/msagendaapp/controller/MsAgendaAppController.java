package mx.com.prueba.msagendaapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.prueba.msagendaapp.dao.ContactoEntity;
import mx.com.prueba.msagendaapp.service.MsAgendaServiceApp;

/**
 * 
 * @author ejoses
 *
 */
@RestController
@RequestMapping("/agenda/")
public class MsAgendaAppController {
	
	@Autowired
	MsAgendaServiceApp msAgendaServiceApp;
	
	/**
	 * @apiNote get all contact list
	 * @return ArrayList<ContactoEntity>
	 */
	@GetMapping("/contactos")
	public ArrayList<ContactoEntity> getContacto () {
		return msAgendaServiceApp.getAll();
	}
	
	/**
	 * @apiNote add new contact
	 * @param clienteEntity
	 * @return new ContactoEntity or null
	 */
	@PostMapping("/contactos")
	public ContactoEntity addContacto (@RequestBody ContactoEntity clienteEntity) {
		return msAgendaServiceApp.addContacto(clienteEntity);
	}
	
	/**
	 * @apiNote delete contact by idContact
	 * @param idContacto
	 * @return deleted ContactoEntity or null
	 */
	@DeleteMapping("/contactos/{idContacto}")
	public ContactoEntity deleteContacto(@PathVariable Integer idContacto) {
		return msAgendaServiceApp.deleteContacto(idContacto);
	}
	
	/**
	 * @apiNote delete contact by ContactoEntity
	 * @param contactoEntity
	 * @return deleted ContactoEntity or null
	 */
	@DeleteMapping("/contactos")
	public ContactoEntity deleteContacto(@RequestBody ContactoEntity contactoEntity) {
		return msAgendaServiceApp.deleteContacto(contactoEntity);
	}
	
	/**
	 * @apiNote update contact by ContactoEntity
	 * @param contactoEntity
	 * @return updated ContactoEntity or null
	 */
	@PutMapping("/contactos")
	public ContactoEntity updateContacto(@RequestBody ContactoEntity contactoEntity) {
		return msAgendaServiceApp.updateContacto(contactoEntity);
	}
}
