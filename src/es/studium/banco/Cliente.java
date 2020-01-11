package es.studium.banco;

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
	
	public Cliente(String d, String nmb, String dml)
	{
		dni = d;
		nombre = nmb;
		domicilio = dml;
	}
	
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

