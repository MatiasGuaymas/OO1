package ar.edu.unlp.info.oo1._Ejercicio17;

public class PoliticaDeCancelacionFlexible implements PoliticaDeCancelacion {
	@Override
	public double reembolsar(Reserva r) {
		return r.costo();
	}
}
