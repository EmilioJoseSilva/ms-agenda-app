package mx.com.prueba.msagendaapp.dao;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ejoses
 *
 */
public class ContactoEntity {
	@Getter @Setter
	private Integer idContacto;
	
	@Getter @Setter
	private String nombre;
	
	@Getter @Setter
	private String telefono;

	/**
	 * @apiNote Constructor
	 */
	public ContactoEntity() {
		super();
	}

	/**
	 * @apiNote Constructor
	 * @param idContacto
	 * @param nombre
	 * @param telefono
	 */
	public ContactoEntity(Integer idContacto,String nombre, String telefono) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	
}
