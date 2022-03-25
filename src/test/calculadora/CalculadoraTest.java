package test.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTest {

	private Calculadora calc;
	
	@BeforeEach
	public void inicializaObjeto() {
		calc = new Calculadora();
	}
	
	@Test
	public void testaConstrutorIniciaComZero() {
		double resultadoEsperado = 0.0;
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaConstrutorComParametroRecebendoPositivo() {
		double memoria = 53.00;

		calc.setMemoria(memoria);
		
		double resultadoEsperado = 53.00;
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoSomarComNumeroNegativo() {
		double memoria = -30.00;
		calc.setMemoria(memoria);
 
		double valor = -10.00;
		double resultadoEsperado = -40.00;
		
		calc.somar(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaMetodoSomarComNumeroGrande() {
		double memoria = 3333.00;
		calc.setMemoria(memoria);
 
		double valor = 10.00;
		double resultadoEsperado = 3343.00;
		
		calc.somar(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaMetodoSubtrairComNumeroNegativo() {
		double memoria = -50.00;
		calc.setMemoria(memoria);
 
		double valor = -10.00;
		double resultadoEsperado = -40.00;
		
		calc.subtrair(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoSubtrairComNumeroGrande() {
		double memoria = 2222.00;
		calc.setMemoria(memoria);
 
		double valor = 10.00;
		double resultadoEsperado = 2212.00;
		
		calc.subtrair(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoMultiplicarComNumeroNegativo() {
		double memoria = -50.00;
		calc.setMemoria(memoria);
 
		double valor = -10.00;
		double resultadoEsperado = 500.00;
		
		calc.multiplicar(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoMultiplicarComNumeroGrande() {
		double memoria = 2222.00;
		calc.setMemoria(memoria);
 
		double valor = 10.00;
		double resultadoEsperado = 22220.00;
		
		calc.multiplicar(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoDividirPorZero() {
		double memoria = 50.00;
		calc.setMemoria(memoria);
 
		double valor = 0.00;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		
		calc.dividir(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoDividirComNumeroGrande() {
		double memoria = 2222.00;
		calc.setMemoria(memoria);
 
		double valor = 10.00;
		double resultadoEsperado = 222.2;
		
		calc.dividir(valor);
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMetodoZerarMemoria() {
		double memoria = 10.00;
		calc.setMemoria(memoria);
		
		double resultadoEsperado = 0.00;
		calc.zerarMemoria();
		
		double resultadoObtido = calc.getMemoria();
		
		assertEquals(resultadoEsperado, resultadoObtido);		
	}
}
