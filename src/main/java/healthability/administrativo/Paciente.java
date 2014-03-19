package healthability.administrativo;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

import javax.imageio.ImageIO;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Paciente extends Persona
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Set<Padecimiento> padecimientos;

	public Paciente(String nombre, ImageIO foto, String cedula, String correo,
			Set<Padecimiento> padecimientos) {
		super(nombre, foto, cedula, correo);
		this.padecimientos = padecimientos;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
}

