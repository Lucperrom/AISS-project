package utiles;

public class Checkers {

/**
 * @param textoRestriccion
 * 		Mensaje que se inluir� en la excepci�n lanzada
 * @param condicion
 * Expresi�n booleana que ha de cumplirse para que no se lance una excepci�n
 * @throws IllegalArgumentException si no se cumple la condici�n
 */
	
public static void check(String textoRestriccion, Boolean condicion) {
	if(!condicion) {
		throw new IllegalArgumentException(
				Thread.currentThread().getStackTrace()[2].getClassName() +
				"," +
				Thread.currentThread().getStackTrace()[2].getMethodName() +
				":" +
				textoRestriccion);
				
				
	}
}

/**
 * @param parametros Lista de par�metros para los que se quiere realizar una comparaci�n de nulidad
 * @throws IllegalArgumentException si alguno de los par�metros es nulo
 */

public static void checkNoNull(Object... parametros) {
	for(int i=0; i < parametros.length; i++) {
		if(parametros[i] == null) {
			throw new IllegalArgumentException( 
					Thread.currentThread().getStackTrace()[2].getClassName() +
					","+
					Thread.currentThread().getStackTrace()[2].getMethodName() +
					":el par�metro" + (i+1) + "es nulo");
			
			
		}
	}
}
}
