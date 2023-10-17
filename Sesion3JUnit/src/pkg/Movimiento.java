package pkg;

public class Movimiento {
	public enum Signo{D, H};
	
	private Double importe;
	private String detalle;
	private Signo tipoOperacion;
	
	
	public Movimiento(Double importe, String detalle, Signo tipoOperacion) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.tipoOperacion = tipoOperacion;
	}
	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Signo getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(Signo tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
}
