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
public class EstudanteInternacional extends Estudante
{
    
    // crear clase estudante internacional que ademais dos atributos herdados por estudante, e indirectamente por peroa, teña o atributo do pais de procedencia 
    public String pais;
    // crear gettes settes e toString 
    public EstudanteInternacional(String pais,String nomeCole,String nivel,String nome,String direccion)
    {
        super(nomeCole,nivel,nome,direccion);
        this.pais = pais;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    @Override
    public String toString()
    {
        return "estudante internacional: "+nome+" "+direccion+" "+nomeCole+" "+nivel+" "+pais;
    }
    
}
