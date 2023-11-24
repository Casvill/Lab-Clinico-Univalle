package labClinico;

import controller.ControladorOrden;
import view.ViewMain;

/**
 *
 * @author Daniel Casvill
 */
public class LabClinico 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ViewMain main = new ViewMain();
        ControladorOrden controladorOrden = new ControladorOrden(main);        
    }
    
}
