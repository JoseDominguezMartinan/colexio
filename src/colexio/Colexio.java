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
        
        // 1.crear un obxeto de cada clase
        
        
        Estudante est001=new Estudante("Castelao","2ºASIR","Pedro Pelaez","Rosalia de castro 45");
        Ensinante ens001=new Ensinante("JAVA","Manuel","Garcia Barbón 25");
        EstudanteInternacional estin001=new EstudanteInternacional("Alemania","Teis","2ºBach","Roger","Residencia de estudantes Meixoeiro");
        
        // 2.visualizar os seguintes obxetos
        
        System.out.println(est001.toString());
        System.out.println(ens001.toString());
        System.out.println(estin001.toString());
        // 3. cambiar valores e volver a mostrar 
        
        est001.setNivel("1ºASIR");
        ens001.setMateria("Linguaxes de marcas");
        
         System.out.println(est001.toString());
        System.out.println(ens001.toString());
    }
    
}
