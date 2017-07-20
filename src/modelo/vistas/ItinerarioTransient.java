package modelo.vistas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@SuppressWarnings("serial")
public class ItinerarioTransient implements Serializable {
	
	private Integer idItinerario;
	private Integer idRuta;
	private String abordaje;
	private Integer idAeropuertoOrigen;
	private String nombreAeropuertoOrigen;
	private String ubicacionOrigen;
	private String ciudadOrigen;
	private String abreviaturaOrigen;
	
	private Integer idAeropuertoDestino;
	private String nombreAeropuertoDestino;
	private String ubicacionDestino;
	private String ciudadDestino;
	private String abreviaturaDestino;
	
	private Date fechaOrigen;
	private Time horaOrigen;
	private Date fechaDestino;
	private Time horaDestino;

	private Time  duracion;
	private String tipoClase;
	private Integer idCabina;
	private String aerolinea;
	
	private Integer numAsientos;
	private Integer numAsientosPrimeraClase;
	private Integer numAsientosEconomica;
	private String estadoAvion;
	private String tipoAvion;
	
	private Integer idVuelo;
	private String numeroVuelo;
	
	private BigDecimal valorTarifa;
	private BigDecimal impuestoTasa;
	private BigDecimal totalPagarTarifa;
	
	public Integer getIdItinerario() {
		return idItinerario;
	}
	public void setIdItinerario(Integer idItinerario) {
		this.idItinerario = idItinerario;
	}
	public Integer getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(Integer idRuta) {
		this.idRuta = idRuta;
	}
	public String getAbordaje() {
		return abordaje;
	}
	public void setAbordaje(String abordaje) {
		this.abordaje = abordaje;
	}
	public Integer getIdAeropuertoOrigen() {
		return idAeropuertoOrigen;
	}
	public void setIdAeropuertoOrigen(Integer idAeropuertoOrigen) {
		this.idAeropuertoOrigen = idAeropuertoOrigen;
	}
	public String getNombreAeropuertoOrigen() {
		return nombreAeropuertoOrigen;
	}
	public void setNombreAeropuertoOrigen(String nombreAeropuertoOrigen) {
		this.nombreAeropuertoOrigen = nombreAeropuertoOrigen;
	}
	public String getUbicacionOrigen() {
		return ubicacionOrigen;
	}
	public void setUbicacionOrigen(String ubicacionOrigen) {
		this.ubicacionOrigen = ubicacionOrigen;
	}
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	public String getAbreviaturaOrigen() {
		return abreviaturaOrigen;
	}
	public void setAbreviaturaOrigen(String abreviaturaOrigen) {
		this.abreviaturaOrigen = abreviaturaOrigen;
	}
	public Integer getIdAeropuertoDestino() {
		return idAeropuertoDestino;
	}
	public void setIdAeropuertoDestino(Integer idAeropuertoDestino) {
		this.idAeropuertoDestino = idAeropuertoDestino;
	}
	public String getNombreAeropuertoDestino() {
		return nombreAeropuertoDestino;
	}
	public void setNombreAeropuertoDestino(String nombreAeropuertoDestino) {
		this.nombreAeropuertoDestino = nombreAeropuertoDestino;
	}
	public String getUbicacionDestino() {
		return ubicacionDestino;
	}
	public void setUbicacionDestino(String ubicacionDestino) {
		this.ubicacionDestino = ubicacionDestino;
	}
	public String getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	public String getAbreviaturaDestino() {
		return abreviaturaDestino;
	}
	public void setAbreviaturaDestino(String abreviaturaDestino) {
		this.abreviaturaDestino = abreviaturaDestino;
	}
	public Date getFechaOrigen() {
		return fechaOrigen;
	}
	public void setFechaOrigen(Date fechaOrigen) {
		this.fechaOrigen = fechaOrigen;
	}
	public Time getHoraOrigen() {
		return horaOrigen;
	}
	public void setHoraOrigen(Time horaOrigen) {
		this.horaOrigen = horaOrigen;
	}
	public Date getFechaDestino() {
		return fechaDestino;
	}
	public void setFechaDestino(Date fechaDestino) {
		this.fechaDestino = fechaDestino;
	}
	public Time getHoraDestino() {
		return horaDestino;
	}
	public void setHoraDestino(Time horaDestino) {
		this.horaDestino = horaDestino;
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
	public Integer getNumAsientos() {
		return numAsientos;
	}
	public void setNumAsientos(Integer numAsientos) {
		this.numAsientos = numAsientos;
	}
	public Integer getNumAsientosPrimeraClase() {
		return numAsientosPrimeraClase;
	}
	public void setNumAsientosPrimeraClase(Integer numAsientosPrimeraClase) {
		this.numAsientosPrimeraClase = numAsientosPrimeraClase;
	}
	public Integer getNumAsientosEconomica() {
		return numAsientosEconomica;
	}
	public void setNumAsientosEconomica(Integer numAsientosEconomica) {
		this.numAsientosEconomica = numAsientosEconomica;
	}
	public String getEstadoAvion() {
		return estadoAvion;
	}
	public void setEstadoAvion(String estadoAvion) {
		this.estadoAvion = estadoAvion;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public Integer getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}
	public String getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public BigDecimal getValorTarifa() {
		return valorTarifa;
	}
	public void setValorTarifa(BigDecimal valorTarifa) {
		this.valorTarifa = valorTarifa;
	}
	public BigDecimal getImpuestoTasa() {
		return impuestoTasa;
	}
	public void setImpuestoTasa(BigDecimal impuestoTasa) {
		this.impuestoTasa = impuestoTasa;
	}
	public BigDecimal getTotalPagarTarifa() {
		return totalPagarTarifa;
	}
	public void setTotalPagarTarifa(BigDecimal totalPagarTarifa) {
		this.totalPagarTarifa = totalPagarTarifa;
	}
	public Integer getIdCabina() {
		return idCabina;
	}
	public void setIdCabina(Integer idCabina) {
		this.idCabina = idCabina;
	}

}
