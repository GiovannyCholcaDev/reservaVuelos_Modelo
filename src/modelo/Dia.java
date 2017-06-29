package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dia database table.
 * 
 */
@Entity
@NamedQuery(name="Dia.findAll", query="SELECT d FROM Dia d")
public class Dia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_DIA")
	private int idDia;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="dia")
	private List<Horario> horarios;

	public Dia() {
	}

	public int getIdDia() {
		return this.idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setDia(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setDia(null);

		return horario;
	}

}