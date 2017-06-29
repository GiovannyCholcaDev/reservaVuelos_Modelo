package modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipoasiento database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoasiento.findAll", query="SELECT t FROM Tipoasiento t")
public class Tipoasiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TIPO_ASIENTEO")
	private int idTipoAsienteo;

	@Column(name="ESTADO_TIPO_ASIENTO")
	private String estadoTipoAsiento;

	@Column(name="NUM_ASIENTO")
	private int numAsiento;

	@Column(name="NUM_FILA")
	private int numFila;

	private short pasillo;

	private short ventana;

	//bi-directional many-to-one association to Clasificacioncabina
	@ManyToOne
	@JoinColumn(name="ID_CLASIFICACION_CABINA")
	private Clasificacioncabina clasificacioncabina;

	//bi-directional many-to-one association to Avion
	@ManyToOne
	@JoinColumn(name="ID_AVION")
	private Avion avion;

	public Tipoasiento() {
	}

	public int getIdTipoAsienteo() {
		return this.idTipoAsienteo;
	}

	public void setIdTipoAsienteo(int idTipoAsienteo) {
		this.idTipoAsienteo = idTipoAsienteo;
	}

	public String getEstadoTipoAsiento() {
		return this.estadoTipoAsiento;
	}

	public void setEstadoTipoAsiento(String estadoTipoAsiento) {
		this.estadoTipoAsiento = estadoTipoAsiento;
	}

	public int getNumAsiento() {
		return this.numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public int getNumFila() {
		return this.numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public short getPasillo() {
		return this.pasillo;
	}

	public void setPasillo(short pasillo) {
		this.pasillo = pasillo;
	}

	public short getVentana() {
		return this.ventana;
	}

	public void setVentana(short ventana) {
		this.ventana = ventana;
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

}