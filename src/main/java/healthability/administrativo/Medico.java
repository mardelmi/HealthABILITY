package healthability.administrativo;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import javax.imageio.ImageIO;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

final class Medico extends Persona
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String especialidad;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String slogan;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<Clinica> dondeTrabaja;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<String> idiomas;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<String> afiliaciones;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<Procedimiento> procedimientos;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<Educacion> educacion;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private static Set<Medico> medicos;

	public Medico(String nombre, ImageIO foto, String cedula, String correo,
			String especialidad, String slogan, Set<Clinica> dondeTrabaja,
			Set<String> idiomas, Set<String> afiliaciones,
			Set<Procedimiento> procedimientos, Set<Educacion> educacion) {
		super(nombre, foto, cedula, correo);
		this.especialidad = especialidad;
		this.slogan = slogan;
		this.dondeTrabaja = dondeTrabaja;
		this.idiomas = idiomas;
		this.afiliaciones = afiliaciones;
		this.procedimientos = procedimientos;
		this.educacion = educacion;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
}

