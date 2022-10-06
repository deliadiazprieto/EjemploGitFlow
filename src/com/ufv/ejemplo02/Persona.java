package com.ufv.ejemplo02;

public class Persona
{
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;

    public void setNombre(String _nombre)
    {
        this.nombre = _nombre;
    }
    public void setApellidos(String _apellidos)
    {
        this.apellidos = _apellidos;
    }
    public void setDniSinLetra(int _dni)
    {
        this.dniSinLetra = _dni;
    }
    public void setEdad(int _edad)
    {
        if(_edad <= 18)
        {
            //this.edad = _edad;
            System.out.println("EstÃ¡s hecho un chaval");
        }
        else
        {
            //edad = 0;
            System.out.println("Eres mayor");
        }

        //Si eres mayor imprime una cosa y si eres menor imprime otra, y sea lo que sea lo guardo
        this.edad = _edad;

        //En el otro caso lo que estoy haciendo es filtrar la edad

    }

    public String getNombre()
    {
        return nombre;
    }
    public String getApellidos()
    {
        return apellidos;
    }
    public int getDniSinLetra()
    {
        return dniSinLetra;
    }
    public int getEdad()
    {
        return edad;
    }
}
