package modelo.vistas;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class ItinerarioVO implements Serializable {
	
	@Id
	@Column(insertable = false, updatable = false)
	private Integer idRuta;
	
	@Column(insertable = false, updatable = false)
	private String origen;
	
	@Column(insertable = false, updatable = false)
	private String origenCiudad;
	
	@Column(insertable = false, updatable = false)
	private String origenAbre;
	
	@Column(insertable = false, updatable = false)
	private String destino;
	
	@Column(insertable = false, updatable = false)
	private String destinoCiudad;
	
	@Column(insertable = false, updatable = false)
	private String destinoAbre;
	
	@Column(insertable = false, updatable = false)
	private Date origenFecha;
	
	@Column(insertable = false, updatable = false)
	private Time origenHora;
	
	@Column(insertable = false, updatable = false)
	private Date destinoFecha;
	
	@Column(insertable = false, updatable = false)
	private Time destinoHora;
	
	@Column(insertable = false, updatable = false)
	private Time  duracion;
	
	@Column(insertable = false, updatable = false)
	private String tipoClase;
	
	@Column(insertable = false, updatable = false)
	private String aerolinea;

	public Integer getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(Integer idRuta) {
		this.idRuta = idRuta;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getOrigenCiudad() {
		return origenCiudad;
	}
	public void setOrigenCiudad(String origenCiudad) {
		this.origenCiudad = origenCiudad;
	}
	public String getOrigenAbre() {
		return origenAbre;
	}
	public void setOrigenAbre(String origenAbre) {
		this.origenAbre = origenAbre;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDestinoCiudad() {
		return destinoCiudad;
	}
	public void setDestinoCiudad(String destinoCiudad) {
		this.destinoCiudad = destinoCiudad;
	}
	public String getDestinoAbre() {
		return destinoAbre;
	}
	public void setDestinoAbre(String destinoAbre) {
		this.destinoAbre = destinoAbre;
	}
	public Date getOrigenFecha() {
		return origenFecha;
	}
	public void setOrigenFecha(Date origenFecha) {
		this.origenFecha = origenFecha;
	}
	public Time getOrigenHora() {
		return origenHora;
	}
	public void setOrigenHora(Time origenHora) {
		this.origenHora = origenHora;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}
	public String getTipoClase() {
		return tipoClase;
	}
	public void setTipoClase(String tipoClase) {
		this.tipoClase = tipoClase;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Date getDestinoFecha() {
		return destinoFecha;
	}
	public void setDestinoFecha(Date destinoFecha) {
		this.destinoFecha = destinoFecha;
	}
	public Time getDestinoHora() {
		return destinoHora;
	}
	public void setDestinoHora(Time destinoHora) {
		this.destinoHora = destinoHora;
	}
	
}
