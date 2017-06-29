package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CUIDAD")
	private int idCuidad;

	@Column(name="CODIGO_CUIDAD")
	private int codigoCuidad;

	@Column(name="NOMBRE_CUIDAD")
	private String nombreCuidad;

	//bi-directional many-to-one association to Oficina
	@OneToMany(mappedBy="ciudad")
	private List<Oficina> oficinas;

	public Ciudad() {
	}

	public int getIdCuidad() {
		return this.idCuidad;
	}

	public void setIdCuidad(int idCuidad) {
		this.idCuidad = idCuidad;
	}

	public int getCodigoCuidad() {
		return this.codigoCuidad;
	}

	public void setCodigoCuidad(int codigoCuidad) {
		this.codigoCuidad = codigoCuidad;
	}

	public String getNombreCuidad() {
		return this.nombreCuidad;
	}

	public void setNombreCuidad(String nombreCuidad) {
		this.nombreCuidad = nombreCuidad;
	}

	public List<Oficina> getOficinas() {
		return this.oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	public Oficina addOficina(Oficina oficina) {
		getOficinas().add(oficina);
		oficina.setCiudad(this);

		return oficina;
	}

	public Oficina removeOficina(Oficina oficina) {
		getOficinas().remove(oficina);
		oficina.setCiudad(null);

		return oficina;
	}

}