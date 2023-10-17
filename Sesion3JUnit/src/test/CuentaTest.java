package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;
import pkg.Movimiento.Signo;

class CuentaTest {

	static Cuenta cuenta;
	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	
	static Vector<Movimiento> movCuenta12345;
	static Vector<Movimiento> movCuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cuenta = new Cuenta(0,"Numero de cuenta","Nombre generico");
		
		cuenta12345 = new Cuenta(50, "12345", "Randalio");
		movCuenta12345 = new Vector<Movimiento>();
		movCuenta12345.add(new Movimiento(200d, "Retirada", Signo.D));
		movCuenta12345.add(new Movimiento(100d, "Ingreso", Signo.H));
		movCuenta12345.add(new Movimiento(200d, "Retirada", Signo.D));
		
		cuenta67890 = new Cuenta(0, "67890", "Atamino");
		movCuenta67890 = new Vector<Movimiento>();
		movCuenta67890.add(new Movimiento(350d, "Retirada", Signo.D));
		movCuenta67890.add(new Movimiento(200d, "Retirada", Signo.D));
		movCuenta67890.add(new Movimiento(150d, "Retirada", Signo.D));
		movCuenta67890.add(new Movimiento(50d, "Ingreso", Signo.H));
		movCuenta67890.add(new Movimiento(100d, "Retirada", Signo.D));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(250);
		assertEquals(250,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(250);
		assertEquals(-250,cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		System.out.println("Saldo inicial de la cuenta 12345: " + cuenta12345.getSaldo() + "€");
		for(int i = 0; i < movCuenta12345.size(); i++) {
			cuenta12345.transaccionar(movCuenta12345.get(i));
		}
		assertEquals(-250, cuenta12345.getSaldo());
		System.out.println("Saldo final de la cuenta 12345: " + cuenta12345.getSaldo() + "€");
		
		System.out.println("Saldo inicial de la cuenta 67890: " + cuenta67890.getSaldo() + "€");
		for(int i = 0; i < movCuenta67890.size(); i++) {
			cuenta67890.transaccionar(movCuenta67890.get(i));
		}
		assertEquals(-450, cuenta67890.getSaldo());
		System.out.println("Saldo final de la cuenta 67890: " + cuenta67890.getSaldo() + "€");
	}
	

}
