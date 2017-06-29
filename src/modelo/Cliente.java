package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLIENTE")
	private long idCliente;

	@Column(name="APELLIDO_CLI")
	private String apellidoCli;

	private String email;

	@Column(name="IDENTIFICACION_CLI")
	private int identificacionCli;

	private String nacionalidad;

	@Column(name="NOMBRE_CLI")
	private String nombreCli;

	private String pasaporte;

	//bi-directional many-to-one association to Comprainternet
	@OneToMany(mappedBy="cliente")
	private List<Comprainternet> comprainternets;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="cliente")
	private List<Reserva> reservas;

	public Cliente() {
	}

	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellidoCli() {
		return this.apellidoCli;
	}

	public void setApellidoCli(String apellidoCli) {
		this.apellidoCli = apellidoCli;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdentificacionCli() {
		return this.identificacionCli;
	}

	public void setIdentificacionCli(int identificacionCli) {
		this.identificacionCli = identificacionCli;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombreCli() {
		return this.nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public List<Comprainternet> getComprainternets() {
		return this.comprainternets;
	}

	public void setComprainternets(List<Comprainternet> comprainternets) {
		this.comprainternets = comprainternets;
	}

	public Comprainternet addComprainternet(Comprainternet comprainternet) {
		getComprainternets().add(comprainternet);
		comprainternet.setCliente(this);

		return comprainternet;
	}

	public Comprainternet removeComprainternet(Comprainternet comprainternet) {
		getComprainternets().remove(comprainternet);
		comprainternet.setCliente(null);

		return comprainternet;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setCliente(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setCliente(null);

		return reserva;
	}

}