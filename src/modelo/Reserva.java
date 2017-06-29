package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the reserva database table.
 * 
 */
@Entity
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idreserva;

	@Column(name="ASIENTOS_PERMITIDOS")
	private int asientosPermitidos;

	@Column(name="ESTADO_RESERVA")
	private String estadoReserva;

	private short estadovalidado;

	@Column(name="NUM_PASAJERO")
	private int numPasajero;

	@Column(name="TIPO_PAGO")
	private String tipoPago;

	@Column(name="TOTAL_PAGADO")
	private int totalPagado;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="reserva")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE")
	private Cliente cliente;

	//bi-directional many-to-one association to Comprainternet
	@ManyToOne
	@JoinColumn(name="ID_COMPRA_INTERNET")
	private Comprainternet comprainternet;

	//bi-directional many-to-one association to Oficina
	@ManyToOne
	@JoinColumn(name="ID_OFICINA")
	private Oficina oficina;

	//bi-directional many-to-one association to Terminalaerea
	@ManyToOne
	@JoinColumn(name="ID_TERMINAL_AREA")
	private Terminalaerea terminalaerea;

	//bi-directional many-to-one association to Vuelo
	@ManyToOne
	@JoinColumn(name="ID_VUELO")
	private Vuelo vuelo;

	public Reserva() {
	}

	public int getIdreserva() {
		return this.idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public int getAsientosPermitidos() {
		return this.asientosPermitidos;
	}

	public void setAsientosPermitidos(int asientosPermitidos) {
		this.asientosPermitidos = asientosPermitidos;
	}

	public String getEstadoReserva() {
		return this.estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public short getEstadovalidado() {
		return this.estadovalidado;
	}

	public void setEstadovalidado(short estadovalidado) {
		this.estadovalidado = estadovalidado;
	}

	public int getNumPasajero() {
		return this.numPasajero;
	}

	public void setNumPasajero(int numPasajero) {
		this.numPasajero = numPasajero;
	}

	public String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public int getTotalPagado() {
		return this.totalPagado;
	}

	public void setTotalPagado(int totalPagado) {
		this.totalPagado = totalPagado;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setReserva(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setReserva(null);

		return factura;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Comprainternet getComprainternet() {
		return this.comprainternet;
	}

	public void setComprainternet(Comprainternet comprainternet) {
		this.comprainternet = comprainternet;
	}

	public Oficina getOficina() {
		return this.oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public Terminalaerea getTerminalaerea() {
		return this.terminalaerea;
	}

	public void setTerminalaerea(Terminalaerea terminalaerea) {
		this.terminalaerea = terminalaerea;
	}

	public Vuelo getVuelo() {
		return this.vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

}