package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idhorario;

	@Column(name="ESTADO_HORARIO")
	private String estadoHorario;

	//bi-directional many-to-one association to Dia
	@ManyToOne
	@JoinColumn(name="ID_DIA")
	private Dia dia;

	//bi-directional many-to-one association to Hora
	@ManyToOne
	@JoinColumn(name="IDHORA")
	private Hora hora;

	//bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy="horario1")
	private List<Ruta> rutas1;

	//bi-directional many-to-one association to Ruta
	@OneToMany(mappedBy="horario2")
	private List<Ruta> rutas2;

	public Horario() {
	}

	public int getIdhorario() {
		return this.idhorario;
	}

	public void setIdhorario(int idhorario) {
		this.idhorario = idhorario;
	}

	public String getEstadoHorario() {
		return this.estadoHorario;
	}

	public void setEstadoHorario(String estadoHorario) {
		this.estadoHorario = estadoHorario;
	}

	public Dia getDia() {
		return this.dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Hora getHora() {
		return this.hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public List<Ruta> getRutas1() {
		return this.rutas1;
	}

	public void setRutas1(List<Ruta> rutas1) {
		this.rutas1 = rutas1;
	}

	public Ruta addRutas1(Ruta rutas1) {
		getRutas1().add(rutas1);
		rutas1.setHorario1(this);

		return rutas1;
	}

	public Ruta removeRutas1(Ruta rutas1) {
		getRutas1().remove(rutas1);
		rutas1.setHorario1(null);

		return rutas1;
	}

	public List<Ruta> getRutas2() {
		return this.rutas2;
	}

	public void setRutas2(List<Ruta> rutas2) {
		this.rutas2 = rutas2;
	}

	public Ruta addRutas2(Ruta rutas2) {
		getRutas2().add(rutas2);
		rutas2.setHorario2(this);

		return rutas2;
	}

	public Ruta removeRutas2(Ruta rutas2) {
		getRutas2().remove(rutas2);
		rutas2.setHorario2(null);

		return rutas2;
	}

}