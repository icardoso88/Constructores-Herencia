
/**
 *
 * @author usuario
 */
public class Principal {
    
    public static void main (String [] args){
    
    GW celu1 = new GW ("Modelo GW", "Negro/Blanco/Dorado", 2014, "Movistar");
    
        System.out.println(celu1.modelo);
        System.out.println(celu1.color);
        System.out.println(celu1.año);
        System.out.println(celu1.empresa);
        
    Huawei celu2 = new Huawei ("Modelo P8", "Rojo/Blanco", 2016);
        
        System.out.println(celu2.modelo);
        System.out.println(celu2.color);
        System.out.println(celu2.año);
    
    GW celu3 = new GW ("Modelo P9", "Azul/Dorado", 2015, "Personal");
    
        System.out.println(celu3.modelo);
        System.out.println(celu3.color);
        System.out.println(celu3.año);
        System.out.println(celu3.empresa);
    
    }
    
    
}
