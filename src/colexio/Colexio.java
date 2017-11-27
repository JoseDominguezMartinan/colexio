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
public class Colexio
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Estudante est001=new Estudante("Castelao","2ºASIR","Pedro Pelaez","Rosalia de castro 45");
        Ensinante ens001=new Ensinante("JAVA","Manuel","Garcia Barbón 25");
        EstudanteInternacional estin001=new EstudanteInternacional("Alemania","Teis","2ºBach","Roger","Residencia de estudantes Meixoeiro");
        
        System.out.println(est001.toString());
        System.out.println(ens001.toString());
        System.out.println(estin001.toString());
        
        
    }
    
}
