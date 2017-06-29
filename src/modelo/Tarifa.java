package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the tarifa database table.
 * 
 */
@Entity
@NamedQuery(name="Tarifa.findAll", query="SELECT t FROM Tarifa t")
public class Tarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TARIFA")
	private int idTarifa;

	@Column(name="DESCUENTOS_TARIFA")
	private BigDecimal descuentosTarifa;

	@Column(name="ESTADO_TARIFA")
	private short estadoTarifa;

	@Column(name="IMPUESTO_TARIFA")
	private BigDecimal impuestoTarifa;

	@Column(name="IVA_TARIFA")
	private BigDecimal ivaTarifa;

	@Column(name="PROMOCIONES_TARIFA")
	private BigDecimal promocionesTarifa;

	@Column(name="TASA_TARIFA")
	private BigDecimal tasaTarifa;

	@Column(name="TOTAL_PAGAR_TARIFA")
	private BigDecimal totalPagarTarifa;

	@Column(name="VALOR_TARIFA")
	private BigDecimal valorTarifa;

	//bi-directional many-to-one association to Vuelo
	@OneToMany(mappedBy="tarifa")
	private List<Vuelo> vuelos;

	public Tarifa() {
	}

	public int getIdTarifa() {
		return this.idTarifa;
	}

	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}

	public BigDecimal getDescuentosTarifa() {
		return this.descuentosTarifa;
	}

	public void setDescuentosTarifa(BigDecimal descuentosTarifa) {
		this.descuentosTarifa = descuentosTarifa;
	}

	public short getEstadoTarifa() {
		return this.estadoTarifa;
	}

	public void setEstadoTarifa(short estadoTarifa) {
		this.estadoTarifa = estadoTarifa;
	}

	public BigDecimal getImpuestoTarifa() {
		return this.impuestoTarifa;
	}

	public void setImpuestoTarifa(BigDecimal impuestoTarifa) {
		this.impuestoTarifa = impuestoTarifa;
	}

	public BigDecimal getIvaTarifa() {
		return this.ivaTarifa;
	}

	public void setIvaTarifa(BigDecimal ivaTarifa) {
		this.ivaTarifa = ivaTarifa;
	}

	public BigDecimal getPromocionesTarifa() {
		return this.promocionesTarifa;
	}

	public void setPromocionesTarifa(BigDecimal promocionesTarifa) {
		this.promocionesTarifa = promocionesTarifa;
	}

	public BigDecimal getTasaTarifa() {
		return this.tasaTarifa;
	}

	public void setTasaTarifa(BigDecimal tasaTarifa) {
		this.tasaTarifa = tasaTarifa;
	}

	public BigDecimal getTotalPagarTarifa() {
		return this.totalPagarTarifa;
	}

	public void setTotalPagarTarifa(BigDecimal totalPagarTarifa) {
		this.totalPagarTarifa = totalPagarTarifa;
	}

	public BigDecimal getValorTarifa() {
		return this.valorTarifa;
	}

	public void setValorTarifa(BigDecimal valorTarifa) {
		this.valorTarifa = valorTarifa;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public Vuelo addVuelo(Vuelo vuelo) {
		getVuelos().add(vuelo);
		vuelo.setTarifa(this);

		return vuelo;
	}

	public Vuelo removeVuelo(Vuelo vuelo) {
		getVuelos().remove(vuelo);
		vuelo.setTarifa(null);

		return vuelo;
	}

}