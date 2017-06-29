package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the aeropuerto database table.
 * 
 */
@Entity
@NamedQuery(name = "Aeropuerto.findAll", query = "SELECT a FROM Aeropuerto a")
public class Aeropuerto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AEROPUERTO")
	private int idAeropuerto;

	@Lob
	private String ciudad;

	@Lob
	@Column(name = "NOMBRE_AEROPUERTO")
	private String nombreAeropuerto;

	@Lob
	private String ubicacion;

	@Column(name = "ABREVIATURA")
	private String abreviatura;

	// bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy = "aeropuerto1")
	private List<Ruta> rutas1;

	// bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy = "aeropuerto2")
	private List<Ruta> rutas2;

	// bi-directional many-to-one association to Terminalaerea
	@OneToMany(mappedBy = "aeropuerto")
	private List<Terminalaerea> terminalaereas;

	public Aeropuerto() {
	}

	public int getIdAeropuerto() {
		return this.idAeropuerto;
	}

	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreAeropuerto() {
		return this.nombreAeropuerto;
	}

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Ruta> getRutas1() {
		return this.rutas1;
	}

	public void setRutas1(List<Ruta> rutas1) {
		this.rutas1 = rutas1;
	}

	public Ruta addRutas1(Ruta rutas1) {
		getRutas1().add(rutas1);
		rutas1.setAeropuerto1(this);

		return rutas1;
	}

	public Ruta removeRutas1(Ruta rutas1) {
		getRutas1().remove(rutas1);
		rutas1.setAeropuerto1(null);

		return rutas1;
	}

	public List<Ruta> getRutas2() {
		return this.rutas2;
	}

	public void setRutas2(List<Ruta> rutas2) {
		this.rutas2 = rutas2;
	}

	public Ruta addRutas2(Ruta rutas2) {
		getRutas2().add(rutas2);
		rutas2.setAeropuerto2(this);

		return rutas2;
	}

	public Ruta removeRutas2(Ruta rutas2) {
		getRutas2().remove(rutas2);
		rutas2.setAeropuerto2(null);

		return rutas2;
	}

	public List<Terminalaerea> getTerminalaereas() {
		return this.terminalaereas;
	}

	public void setTerminalaereas(List<Terminalaerea> terminalaereas) {
		this.terminalaereas = terminalaereas;
	}

	public Terminalaerea addTerminalaerea(Terminalaerea terminalaerea) {
		getTerminalaereas().add(terminalaerea);
		terminalaerea.setAeropuerto(this);

		return terminalaerea;
	}

	public Terminalaerea removeTerminalaerea(Terminalaerea terminalaerea) {
		getTerminalaereas().remove(terminalaerea);
		terminalaerea.setAeropuerto(null);

		return terminalaerea;
	}

}