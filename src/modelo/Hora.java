package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the hora database table.
 * 
 */
@Entity
@NamedQuery(name="Hora.findAll", query="SELECT h FROM Hora h")
public class Hora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idhora;

	private Time hora;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="hora")
	private List<Horario> horarios;

	public Hora() {
	}

	public int getIdhora() {
		return this.idhora;
	}

	public void setIdhora(int idhora) {
		this.idhora = idhora;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setHora(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setHora(null);

		return horario;
	}

}