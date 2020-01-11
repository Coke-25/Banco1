package es.studium.banco;

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
	
	public Cuenta (int idc, int sld, Cliente nmb)
	{
		idCuenta = idc;
		saldo = sld;
		nombreCliente = nmb;
	}
	
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
