package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vuelo database table.
 * 
 */
@Entity
@NamedQuery(name="Vuelo.findAll", query="SELECT v FROM Vuelo v")
public class Vuelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VUELO")
	private int idVuelo;

	@Column(name="ESTADO_VUELO")
	private String estadoVuelo;

	@Column(name="NUMERO_VUELO")
	private int numeroVuelo;

	@Column(name="TOTAL_PASAJEROS")
	private int totalPasajeros;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="vuelo")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to Tarifa
	@ManyToOne
	@JoinColumn(name="ID_TARIFA")
	private Tarifa tarifa;

	//bi-directional many-to-one association to Itinerario
	@ManyToOne
	@JoinColumn(name="ID_ITINERARIO")
	private Itinerario itinerario;

	public Vuelo() {
	}

	public int getIdVuelo() {
		return this.idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getEstadoVuelo() {
		return this.estadoVuelo;
	}

	public void setEstadoVuelo(String estadoVuelo) {
		this.estadoVuelo = estadoVuelo;
	}

	public int getNumeroVuelo() {
		return this.numeroVuelo;
	}

	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public int getTotalPasajeros() {
		return this.totalPasajeros;
	}

	public void setTotalPasajeros(int totalPasajeros) {
		this.totalPasajeros = totalPasajeros;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setVuelo(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setVuelo(null);

		return reserva;
	}

	public Tarifa getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public Itinerario getItinerario() {
		return this.itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}

}