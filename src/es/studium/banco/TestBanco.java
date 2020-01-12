package es.studium.banco;


/**
 * Clase empleada para la consulta de las transacciones bancarias
 * @author Coke-25
 * @version 1.0
 */
public class TestBanco {
	public static void main(String[] args) {
		
		//constantes para refactorización
		final String enunciadoParte1 = "La cuenta de ";
		final String enunciadoParte2 = " tiene ";
		final String enunciadoParte3 = " euros.";
		

		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		
 
		/* Función refactorizada donde Antonio y Beatriz consultan el saldo */
		consultaAntonio(enunciadoParte1, enunciadoParte2, enunciadoParte3, cuentaAntonio);
		consultaBeatriz(enunciadoParte1, enunciadoParte2, enunciadoParte3, cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
 
		/* Función refactorizada donde Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		consultaAntonio(enunciadoParte1, enunciadoParte2, enunciadoParte3, cuentaAntonio);
		consultaBeatriz(enunciadoParte1, enunciadoParte2, enunciadoParte3, cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		
		/* Antonio transfiere 50€ a Beatriz */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		
	}
	

	/**
	 * Consulta de la transacción bancaria lista para usarla de manera refactorizada
	 * @param enunciadoParte1
	 * @param enunciadoParte2
	 * @param enunciadoParte3
	 * @param cuentaBeatriz
	 */
	private static void consultaBeatriz(final String enunciadoParte1, final String enunciadoParte2, final String enunciadoParte3, Cuenta cuentaBeatriz) 
	{
		System.out.println(enunciadoParte1 + cuentaBeatriz.getNombreCliente().getNombre() + enunciadoParte2 + cuentaBeatriz.getSaldo() + enunciadoParte3);
	}
	/**
	 * 
	 * @param enunciadoParte1
	 * @param enunciadoParte2
	 * @param enunciadoParte3
	 * @param cuentaAntonio
	 */
	private static void consultaAntonio(final String enunciadoParte1, final String enunciadoParte2, final String enunciadoParte3, Cuenta cuentaAntonio) 
	{
		System.out.println(enunciadoParte1 + cuentaAntonio.getNombreCliente().getNombre() + enunciadoParte2 + cuentaAntonio.getSaldo() + enunciadoParte3);
	}

}
