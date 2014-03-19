package healthability.administrativo;
import java.util.Set;
import java.util.HashSet;

import javax.imageio.ImageIO;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Clinica extends Entidad
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int codigoClinica;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Direccion direccion;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private static Set<Clinica> clinicas;

	public Clinica(String nombre, ImageIO foto, int codigoClinica,
			Direccion direccion) {
		super(nombre, foto);
		this.codigoClinica = codigoClinica;
		this.direccion = direccion;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
}

