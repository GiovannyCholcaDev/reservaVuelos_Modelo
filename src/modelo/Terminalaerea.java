package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the terminalaerea database table.
 * 
 */
@Entity
@NamedQuery(name="Terminalaerea.findAll", query="SELECT t FROM Terminalaerea t")
public class Terminalaerea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TERMINAL_AREA")
	private int idTerminalArea;

	private String direccion;

	@Column(name="EXT_TA")
	private int extTa;

	private int piso;

	@Column(name="TELEFONO_TA")
	private BigDecimal telefonoTa;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="terminalaerea")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="IDAEROPUERTO")
	private Aeropuerto aeropuerto;

	//bi-directional many-to-one association to PersonalAerolinea
	@ManyToOne
	@JoinColumn(name="ID_PERSONAL_LAN")
	private PersonalAerolinea personalAerolinea;

	public Terminalaerea() {
	}

	public int getIdTerminalArea() {
		return this.idTerminalArea;
	}

	public void setIdTerminalArea(int idTerminalArea) {
		this.idTerminalArea = idTerminalArea;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getExtTa() {
		return this.extTa;
	}

	public void setExtTa(int extTa) {
		this.extTa = extTa;
	}

	public int getPiso() {
		return this.piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public BigDecimal getTelefonoTa() {
		return this.telefonoTa;
	}

	public void setTelefonoTa(BigDecimal telefonoTa) {
		this.telefonoTa = telefonoTa;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setTerminalaerea(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setTerminalaerea(null);

		return reserva;
	}

	public Aeropuerto getAeropuerto() {
		return this.aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public PersonalAerolinea getPersonalAerolinea() {
		return this.personalAerolinea;
	}

	public void setPersonalAerolinea(PersonalAerolinea personalAerolinea) {
		this.personalAerolinea = personalAerolinea;
	}

}