package es.studium.banco;

/**
 * Clase del objeto Cliente donde se definen sus atributos dni, nombre domicilio
 * @author Coke-25
 * @version 1.0
 * @see TestBanco
 */
public class Cliente 
{
	private String dni;
	private String nombre;
	private String domicilio;
	
	public Cliente()
	{
		dni = "";
		nombre = "";
		domicilio = "";
	}
	/**
	 * 
	 * @param d
	 * @param nmb
	 * @param dml
	 */
	public Cliente(String d, String nmb, String dml)
	{
		dni = d;
		nombre = nmb;
		domicilio = dml;
	}

	//Se generan los getters y setters de sus atributos
	public String getDni ()
	{
		return dni;
	}
	public void setDni (String d)
	{
		dni = d;
	}
	public String getNombre ()
	{
		return nombre;
	}
	public void setNombre (String nmb)
	{
		nombre = nmb;
	}
	public String getDomicilio ()
	{
		return domicilio;
	}
	public void setDomicilio (String dml)
	{
		domicilio = dml;
	}
}

