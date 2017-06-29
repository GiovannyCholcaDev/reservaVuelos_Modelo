package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clasificacioncabina database table.
 * 
 */
@Entity
@NamedQuery(name="Clasificacioncabina.findAll", query="SELECT c FROM Clasificacioncabina c")
public class Clasificacioncabina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLASIFICACION_CABINA")
	private int idClasificacionCabina;

	@Column(name="TIPO_CLASE")
	private String tipoClase;

	//bi-directional many-to-one association to Itinerario
	@OneToMany(mappedBy="clasificacioncabina")
	private List<Itinerario> itinerarios;

	//bi-directional many-to-one association to Tipoasiento
	@OneToMany(mappedBy="clasificacioncabina")
	private List<Tipoasiento> tipoasientos;

	public Clasificacioncabina() {
	}

	public int getIdClasificacionCabina() {
		return this.idClasificacionCabina;
	}

	public void setIdClasificacionCabina(int idClasificacionCabina) {
		this.idClasificacionCabina = idClasificacionCabina;
	}

	public String getTipoClase() {
		return this.tipoClase;
	}

	public void setTipoClase(String tipoClase) {
		this.tipoClase = tipoClase;
	}

	public List<Itinerario> getItinerarios() {
		return this.itinerarios;
	}

	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public Itinerario addItinerario(Itinerario itinerario) {
		getItinerarios().add(itinerario);
		itinerario.setClasificacioncabina(this);

		return itinerario;
	}

	public Itinerario removeItinerario(Itinerario itinerario) {
		getItinerarios().remove(itinerario);
		itinerario.setClasificacioncabina(null);

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
		tipoasiento.setClasificacioncabina(this);

		return tipoasiento;
	}

	public Tipoasiento removeTipoasiento(Tipoasiento tipoasiento) {
		getTipoasientos().remove(tipoasiento);
		tipoasiento.setClasificacioncabina(null);

		return tipoasiento;
	}

}