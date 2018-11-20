
/**
 *
 * @author usuario
 */
public class GW extends Huawei {
    
    String empresa;
    
    public GW (String modelo, String color, int año, String empresa){
        
        super(modelo, color, año);
        
        this.empresa = empresa;
    
        System.out.println("HUAWEI");
    }
    
}
