package org.iesalandalus.programacion.alquilervehiculos;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.ModeloCascada;
import org.iesalandalus.programacion.alquilervehiculos.vista.FactoriaVista;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		// Ánimo!!!!
		Vista vista = FactoriaVista.TEXTO.crear();
		ModeloCascada modeloCascada = new ModeloCascada(FactoriaFuenteDatos.MEMORIA.crear());
		Controlador controlador = new Controlador(modeloCascada, vista);

		controlador.comenzar();
		controlador.terminar();

	}

}
