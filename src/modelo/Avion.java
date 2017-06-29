package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the avion database table.
 * 
 */
@Entity
@NamedQuery(name="Avion.findAll", query="SELECT a FROM Avion a")
public class Avion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_AVION")
	private int idAvion;

	private String aerolinea;

	@Column(name="ESTADO_AVION")
	private String estadoAvion;

	private int numasientos;

	private int numasientoseconomica;

	private int numasientosprimeraclase;

	@Column(name="TIPO_AVION")
	private String tipoAvion;

	//bi-directional many-to-one association to Itinerario
	@OneToMany(mappedBy="avion")
	private List<Itinerario> itinerarios;

	//bi-directional many-to-one association to Tipoasiento
	@OneToMany(mappedBy="avion")
	private List<Tipoasiento> tipoasientos;

	public Avion() {
	}

	public int getIdAvion() {
		return this.idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getAerolinea() {
		return this.aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getEstadoAvion() {
		return this.estadoAvion;
	}

	public void setEstadoAvion(String estadoAvion) {
		this.estadoAvion = estadoAvion;
	}

	public int getNumasientos() {
		return this.numasientos;
	}

	public void setNumasientos(int numasientos) {
		this.numasientos = numasientos;
	}

	public int getNumasientoseconomica() {
		return this.numasientoseconomica;
	}

	public void setNumasientoseconomica(int numasientoseconomica) {
		this.numasientoseconomica = numasientoseconomica;
	}

	public int getNumasientosprimeraclase() {
		return this.numasientosprimeraclase;
	}

	public void setNumasientosprimeraclase(int numasientosprimeraclase) {
		this.numasientosprimeraclase = numasientosprimeraclase;
	}

	public String getTipoAvion() {
		return this.tipoAvion;
	}

	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}

	public List<Itinerario> getItinerarios() {
		return this.itinerarios;
	}

	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public Itinerario addItinerario(Itinerario itinerario) {
		getItinerarios().add(itinerario);
		itinerario.setAvion(this);

		return itinerario;
	}

	public Itinerario removeItinerario(Itinerario itinerario) {
		getItinerarios().remove(itinerario);
		itinerario.setAvion(null);

		return itinerario;
	}

	public List<Tipoasiento> getTipoasientos() {
		return this.tipoasientos;
	}

	public void setTipoasientos(List<Tipoasiento> tipoasientos) {
		this.tipoasientos = tipoasientos;
	}

	public Tipoasiento addTipoasiento(Tipoasiento tipoasiento) {
		getTipoasientos().add(tipoasiento);
		tipoasiento.setAvion(this);

		return tipoasiento;
	}

	public Tipoasiento removeTipoasiento(Tipoasiento tipoasiento) {
		getTipoasientos().remove(tipoasiento);
		tipoasiento.setAvion(null);

		return tipoasiento;
	}

}