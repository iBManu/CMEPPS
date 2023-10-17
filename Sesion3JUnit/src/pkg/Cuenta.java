package pkg;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> mMovimientos;
	
	public Cuenta(double saldo, String numero, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
