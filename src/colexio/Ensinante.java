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
public class Ensinante extends Persoa
{
    public String materia;

    public Ensinante(String materia,String nome,String direccion)
    {
        super(nome,direccion);
        this.materia = materia;
    }

    public String getMateria()
    {
        return materia;
    }

    public void setMateria(String materia)
    {
        this.materia = materia;
    }

    @Override
    public String toString()
    {
        return "Ensinante: "+nome+" "+direccion+" "+materia;
    }
    
}
