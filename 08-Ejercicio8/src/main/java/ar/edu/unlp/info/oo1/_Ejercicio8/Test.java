package ar.edu.unlp.info.oo1._Ejercicio8;

public class Test {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();

		Gerente alan2 = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan2.sueldoBasico();

		System.out.println("APORTES DE ALAN = " + aportesDeAlan); // 2850.0
		System.out.println("SUELDO BASICO DE ALAN = " + sueldoBasicoDeAlan); // 67850.0

		/*
		 * Alan 1 - Gerente (Aportes): 1) Método +aportes de la clase Gerente. 2) Método
		 * +montoBasico de la clase Gerente. Resultado = 57.000 * 0.05d = 2850.0
		 * 
		 * Alan 2 - Gerente (Sueldo básico): 1) Búsqueda de método en clase Gerente. 2)
		 * Método +sueldoBasico de la clase EmpleadoJerarquico. 3) Método +sueldoBasico
		 * de la clase Empleado. 3.1) this.montoBasico() + this.aportes() = 57000 + 2850
		 * = 59850. Se ejecutan los metodos de la clase Gerente. 2.1)
		 * super.sueldoBasico() + this.bonoPorCategoria() = 59850 +
		 * this.bonoPorCategoria(). 2.2) Búsqueda de método de la clase Gerente. 2.3)
		 * Método +bonoPorCategoria de la clase EmpleadoJerarquico. 2.4) 59850 + 8000 =
		 * 67850.0
		 */

	}

}
