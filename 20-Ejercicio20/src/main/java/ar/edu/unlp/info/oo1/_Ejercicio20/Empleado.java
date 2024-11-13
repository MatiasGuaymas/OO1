package ar.edu.unlp.info.oo1._Ejercicio20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private int CUIL;
	private LocalDate fechaNacimiento;
	private boolean hijos;
	private boolean conyugue;
	private List<Contrato> contratos;

	public Empleado(String nombre, String apellido, int CUIL, LocalDate fechaNacimiento, boolean hijos,
			boolean conyugue) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.fechaNacimiento = fechaNacimiento;
		this.hijos = hijos;
		this.conyugue = conyugue;
		this.contratos = new ArrayList<Contrato>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public boolean tieneHijos() {
		return this.hijos;
	}

	public boolean tieneConyugue() {
		return this.conyugue;
	}

	public void agregarContrato(Contrato c) {
		this.contratos.add(c);
	}

	public int calcularAntiguedad() {
		return this.contratos.stream().mapToInt(c -> c.getSize()).sum();
	}

	public ReciboDeSueldo generarRecibo() {
		Contrato contrato = this.contratos.stream().filter(c -> c.isActivo()).findFirst().orElseThrow();
		return new ReciboDeSueldo(this.nombre, this.apellido, this.CUIL, this.calcularAntiguedad(), LocalDate.now(),
				contrato.calcularSueldoTotal());
	}

}
