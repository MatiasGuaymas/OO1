package ar.edu.unlp.info.oo1._Ejercicio23;

public class ExpressDomicilio implements TipoDeEnvio {

	@Override
	public double costoDeEnvio(String direccion1, String direccion2) {
		return CalculadoraDeDistancia.distanciaEntreLugares(direccion1, direccion2) * 0.5;
	}

}
