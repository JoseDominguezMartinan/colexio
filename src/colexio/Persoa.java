/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colexio;

/**
 *
 * @author jdominguezmartinan
 */
public class Persoa
{
    // crear clase persoa cos atributos nome e dirección
    public String nome;
    public String direccion;
    
    // crear constructores, settes gettes e toString 

    public Persoa(String nome,String direccion)
    {
        this.nome = nome;
        this.direccion = direccion;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    @Override
    public String toString()
    {
        return "Persoa{"+"nome="+nome+", direccion="+direccion+'}';
    }
    
    
    
    
}
