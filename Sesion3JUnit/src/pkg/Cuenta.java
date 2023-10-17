package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Signo;

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
		this.mMovimientos = new ArrayList<Movimiento>();
	}
	
	public void transaccionar(Movimiento m) {
		if(m.getTipoOperacion() == Signo.H) {
			ingresar(m.getImporte());
		}
		else if(m.getTipoOperacion() == Signo.D) {
			retirar(m.getImporte());
		}
	}
	
	public void ingresar(double cantidad) {
		this.saldo += cantidad;
		this.mMovimientos.add(new Movimiento(cantidad,"Ingreso",Signo.H));
		System.out.println("Se ha hecho un ingreso de " + cantidad + "€ en la cuenta de numero " + numero);
	}
	
	public void retirar(double cantidad) {
		if(saldo-cantidad < -500) {
			System.out.println("Fondos insuficientes (saldo "+this.saldo+"€) en la cuenta "+this.numero+" para el reintegro de "+cantidad+"€");
			return;
		}
		this.saldo -= cantidad;
		this.mMovimientos.add(new Movimiento(cantidad,"Retirada",Signo.D));
		System.out.println("Se ha hecho una retirada de " + cantidad + "€ en la cuenta de numero " + numero);
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
	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}
	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
	
	
}
