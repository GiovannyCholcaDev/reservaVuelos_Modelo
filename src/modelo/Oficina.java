package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the oficina database table.
 * 
 */
@Entity
@NamedQuery(name="Oficina.findAll", query="SELECT o FROM Oficina o")
public class Oficina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OFICINA")
	private int idOficina;

	@Column(name="DEPARTAMENTO_OFI")
	private String departamentoOfi;

	@Column(name="DIRECCION_OFI")
	private String direccionOfi;

	@Column(name="EXT_OFI")
	private int extOfi;

	@Column(name="TELEFONO_OFICINA")
	private int telefonoOficina;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="ID_CUIDAD")
	private Ciudad ciudad;

	//bi-directional many-to-one association to PersonalAerolinea
	@ManyToOne
	@JoinColumn(name="ID_PERSONAL_LAN")
	private PersonalAerolinea personalAerolinea;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="oficina")
	private List<Reserva> reservas;

	public Oficina() {
	}

	public int getIdOficina() {
		return this.idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public String getDepartamentoOfi() {
		return this.departamentoOfi;
	}

	public void setDepartamentoOfi(String departamentoOfi) {
		this.departamentoOfi = departamentoOfi;
	}

	public String getDireccionOfi() {
		return this.direccionOfi;
	}

	public void setDireccionOfi(String direccionOfi) {
		this.direccionOfi = direccionOfi;
	}

	public int getExtOfi() {
		return this.extOfi;
	}

	public void setExtOfi(int extOfi) {
		this.extOfi = extOfi;
	}

	public int getTelefonoOficina() {
		return this.telefonoOficina;
	}

	public void setTelefonoOficina(int telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public PersonalAerolinea getPersonalAerolinea() {
		return this.personalAerolinea;
	}

	public void setPersonalAerolinea(PersonalAerolinea personalAerolinea) {
		this.personalAerolinea = personalAerolinea;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setOficina(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setOficina(null);

		return reserva;
	}

}