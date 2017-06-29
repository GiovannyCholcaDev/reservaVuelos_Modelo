package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the itinerario database table.
 * 
 */
@Entity
@NamedQuery(name="Itinerario.findAll", query="SELECT i FROM Itinerario i")
public class Itinerario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ITINERARIO")
	private int idItinerario;

	private Time duracion;

	@Column(name="ESTADO_ITINERARIO")
	private String estadoItinerario;

	@Column(name="NUM_PERSONAL_AEREO")
	private int numPersonalAereo;

	//bi-directional many-to-one association to Clasificacioncabina
	@ManyToOne
	@JoinColumn(name="ID_CLASIFICACION_CABINA")
	private Clasificacioncabina clasificacioncabina;

	//bi-directional many-to-one association to Avion
	@ManyToOne
	@JoinColumn(name="ID_AVION")
	private Avion avion;

	//bi-directional many-to-one association to Ruta
	@ManyToOne
	@JoinColumn(name="ID_RUTA")
	private Ruta ruta;

	//bi-directional many-to-one association to Vuelo
	@OneToMany(mappedBy="itinerario")
	private List<Vuelo> vuelos;

	public Itinerario() {
	}

	public int getIdItinerario() {
		return this.idItinerario;
	}

	public void setIdItinerario(int idItinerario) {
		this.idItinerario = idItinerario;
	}

	public Time getDuracion() {
		return this.duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public String getEstadoItinerario() {
		return this.estadoItinerario;
	}

	public void setEstadoItinerario(String estadoItinerario) {
		this.estadoItinerario = estadoItinerario;
	}

	public int getNumPersonalAereo() {
		return this.numPersonalAereo;
	}

	public void setNumPersonalAereo(int numPersonalAereo) {
		this.numPersonalAereo = numPersonalAereo;
	}

	public Clasificacioncabina getClasificacioncabina() {
		return this.clasificacioncabina;
	}

	public void setClasificacioncabina(Clasificacioncabina clasificacioncabina) {
		this.clasificacioncabina = clasificacioncabina;
	}

	public Avion getAvion() {
		return this.avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ruta getRuta() {
		return this.ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public Vuelo addVuelo(Vuelo vuelo) {
		getVuelos().add(vuelo);
		vuelo.setItinerario(this);

		return vuelo;
	}

	public Vuelo removeVuelo(Vuelo vuelo) {
		getVuelos().remove(vuelo);
		vuelo.setItinerario(null);

		return vuelo;
	}

}