package examen;
/**
 * La clase Fecha dira si las fechas son validas
 * @author David Marinez
 * @version 1.1
 * 
 * 
 * */
public class Fecha {
	private static boolean fechaValida;
/*
 * El metodo validar fecha tiene como objetivo validar la fecha dada
 * 
 * 
 * @param anio contiene el año
 * @param mes contiene el mes
 * @param dia contiene el dia 
 * 
 * 
 * devuelve true o false si la fecha es valida o no 
 * 
 *
 * */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}

