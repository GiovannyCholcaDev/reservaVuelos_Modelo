package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ruta database table.
 * 
 */
@Entity
@NamedQuery(name="Ruta.findAll", query="SELECT r FROM Ruta r")
public class Ruta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RUTA")
	private int idRuta;

	private String abordaje;

	private int distancia;

	@Column(name="ESTADO_RUTA")
	private short estadoRuta;

	//bi-directional many-to-one association to Itinerario
	@OneToMany(mappedBy="ruta")
	private List<Itinerario> itinerarios;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="ID_AEROPUERTO_DESTINO")
	private Aeropuerto aeropuerto1;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="ID_HORARIO_IDA")
	private Horario horario1;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="ID_HORARIO_LLEGADA")
	private Horario horario2;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="ID_AEROPUERTO_ORIGEN")
	private Aeropuerto aeropuerto2;

	public Ruta() {
	}

	public int getIdRuta() {
		return this.idRuta;
	}

	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	public String getAbordaje() {
		return this.abordaje;
	}

	public void setAbordaje(String abordaje) {
		this.abordaje = abordaje;
	}

	public int getDistancia() {
		return this.distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public short getEstadoRuta() {
		return this.estadoRuta;
	}

	public void setEstadoRuta(short estadoRuta) {
		this.estadoRuta = estadoRuta;
	}

	public List<Itinerario> getItinerarios() {
		return this.itinerarios;
	}

	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public Itinerario addItinerario(Itinerario itinerario) {
		getItinerarios().add(itinerario);
		itinerario.setRuta(this);

		return itinerario;
	}

	public Itinerario removeItinerario(Itinerario itinerario) {
		getItinerarios().remove(itinerario);
		itinerario.setRuta(null);

		return itinerario;
	}

	public Aeropuerto getAeropuerto1() {
		return this.aeropuerto1;
	}

	public void setAeropuerto1(Aeropuerto aeropuerto1) {
		this.aeropuerto1 = aeropuerto1;
	}

	public Horario getHorario1() {
		return this.horario1;
	}

	public void setHorario1(Horario horario1) {
		this.horario1 = horario1;
	}

	public Horario getHorario2() {
		return this.horario2;
	}

	public void setHorario2(Horario horario2) {
		this.horario2 = horario2;
	}

	public Aeropuerto getAeropuerto2() {
		return this.aeropuerto2;
	}

	public void setAeropuerto2(Aeropuerto aeropuerto2) {
		this.aeropuerto2 = aeropuerto2;
	}

}