package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the personal_aerolinea database table.
 * 
 */
@Entity
@Table(name="personal_aerolinea")
@NamedQuery(name="PersonalAerolinea.findAll", query="SELECT p FROM PersonalAerolinea p")
public class PersonalAerolinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PERSONAL_LAN")
	private int idPersonalLan;

	@Column(name="APELLIDO_PERSONAL_LAN")
	private String apellidoPersonalLan;

	private String cargo;

	@Column(name="IDENTIFICACION_PERSONAL_LAN")
	private int identificacionPersonalLan;

	@Column(name="NOMBRE_PERSONAL_LAN")
	private String nombrePersonalLan;

	//bi-directional many-to-one association to Oficina
	@OneToMany(mappedBy="personalAerolinea")
	private List<Oficina> oficinas;

	//bi-directional many-to-one association to Terminalaerea
	@OneToMany(mappedBy="personalAerolinea")
	private List<Terminalaerea> terminalaereas;

	public PersonalAerolinea() {
	}

	public int getIdPersonalLan() {
		return this.idPersonalLan;
	}

	public void setIdPersonalLan(int idPersonalLan) {
		this.idPersonalLan = idPersonalLan;
	}

	public String getApellidoPersonalLan() {
		return this.apellidoPersonalLan;
	}

	public void setApellidoPersonalLan(String apellidoPersonalLan) {
		this.apellidoPersonalLan = apellidoPersonalLan;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdentificacionPersonalLan() {
		return this.identificacionPersonalLan;
	}

	public void setIdentificacionPersonalLan(int identificacionPersonalLan) {
		this.identificacionPersonalLan = identificacionPersonalLan;
	}

	public String getNombrePersonalLan() {
		return this.nombrePersonalLan;
	}

	public void setNombrePersonalLan(String nombrePersonalLan) {
		this.nombrePersonalLan = nombrePersonalLan;
	}

	public List<Oficina> getOficinas() {
		return this.oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	public Oficina addOficina(Oficina oficina) {
		getOficinas().add(oficina);
		oficina.setPersonalAerolinea(this);

		return oficina;
	}

	public Oficina removeOficina(Oficina oficina) {
		getOficinas().remove(oficina);
		oficina.setPersonalAerolinea(null);

		return oficina;
	}

	public List<Terminalaerea> getTerminalaereas() {
		return this.terminalaereas;
	}

	public void setTerminalaereas(List<Terminalaerea> terminalaereas) {
		this.terminalaereas = terminalaereas;
	}

	public Terminalaerea addTerminalaerea(Terminalaerea terminalaerea) {
		getTerminalaereas().add(terminalaerea);
		terminalaerea.setPersonalAerolinea(this);

		return terminalaerea;
	}

	public Terminalaerea removeTerminalaerea(Terminalaerea terminalaerea) {
		getTerminalaereas().remove(terminalaerea);
		terminalaerea.setPersonalAerolinea(null);

		return terminalaerea;
	}

}