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
public class Estudante extends Persoa
{
    // crear clase estudante que ademais dos atributos herdados por persoa teña os atributos co nome do colexio e o nivel no que estudan 
    public String nomeCole;
    public String nivel;
    // crear gettes settes e toString 
    public Estudante(String nomeCole,String nivel,String nome,String direccion)
    {
        super(nome,direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    public String getNomeCole()
    {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole)
    {
        this.nomeCole = nomeCole;
    }

    public String getNivel()
    {
        return nivel;
    }

    public void setNivel(String nivel)
    {
        this.nivel = nivel;
    }

    @Override
    public String toString()
    {
        return "Estudante: "+nome+" "+direccion+" "+nomeCole+" "+nivel;
    }
    
    
}
