package es.studium.banco;

/**
 * Clase del objeto Cuenta donde se definen los atributos idCuenta, saldo y nombreCliente.
 * @author Coke-25
 * @version 1.0
 * @see TestBanco
 */
public class Cuenta 
{
	private int idCuenta;
	private int saldo;
	private Cliente nombreCliente;
	
	public Cuenta()
	{
		idCuenta = 0;
		saldo = 0;
		nombreCliente = new Cliente();
	}
	/**
	 * 
	 * @param idc
	 * @param sld
	 * @param nmb
	 */
	public Cuenta (int idc, int sld, Cliente nmb)
	{
		idCuenta = idc;
		saldo = sld;
		nombreCliente = nmb;
	}

	//Se generan los getters y setters de sus atributos
	public int getIdCuenta ()
	{
		return idCuenta;
	}
	public void setIdCuenta (int idc)
	{
		idCuenta = idc;
	}

	public int getSaldo ()
	{
		return saldo;
	}
	public void setSaldo (int sld)
	{
		saldo = sld;
	}
	
	public Cliente getNombreCliente ()
	{
		return nombreCliente;
	}
	public void setNombreCliente (Cliente nmb)
	{
		nombreCliente = nmb;
	}

}
