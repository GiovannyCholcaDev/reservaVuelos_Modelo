package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the comprainternet database table.
 * 
 */
@Entity
@NamedQuery(name="Comprainternet.findAll", query="SELECT c FROM Comprainternet c")
public class Comprainternet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_COMPRA_INTERNET")
	private int idCompraInternet;

	@Column(name="FECHA_CONFIRMACION")
	private Timestamp fechaConfirmacion;

	@Column(name="FECHA_PAGO")
	private Timestamp fechaPago;

	@Column(name="FORMA_PAGO")
	private String formaPago;

	@Column(name="NOMBRE_TARJETA")
	private String nombreTarjeta;

	@Column(name="NUMERO_MESES")
	private int numeroMeses;

	@Column(name="NUMERO_TARJETA")
	private BigDecimal numeroTarjeta;

	private String origen;

	@Column(name="TIPO_COMPRA_INTERGER")
	private String tipoCompraInterger;

	@Column(name="VALOR_COMPRA")
	private BigDecimal valorCompra;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE")
	private Cliente cliente;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="comprainternet")
	private List<Reserva> reservas;

	public Comprainternet() {
	}

	public int getIdCompraInternet() {
		return this.idCompraInternet;
	}

	public void setIdCompraInternet(int idCompraInternet) {
		this.idCompraInternet = idCompraInternet;
	}

	public Timestamp getFechaConfirmacion() {
		return this.fechaConfirmacion;
	}

	public void setFechaConfirmacion(Timestamp fechaConfirmacion) {
		this.fechaConfirmacion = fechaConfirmacion;
	}

	public Timestamp getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(Timestamp fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getNombreTarjeta() {
		return this.nombreTarjeta;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	public int getNumeroMeses() {
		return this.numeroMeses;
	}

	public void setNumeroMeses(int numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public BigDecimal getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(BigDecimal numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getTipoCompraInterger() {
		return this.tipoCompraInterger;
	}

	public void setTipoCompraInterger(String tipoCompraInterger) {
		this.tipoCompraInterger = tipoCompraInterger;
	}

	public BigDecimal getValorCompra() {
		return this.valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setComprainternet(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setComprainternet(null);

		return reserva;
	}

}