package compotition;

import java.util.*;
/**
 *
 * @author ASUS
 */
public class Laptop {
    
    private final List<PC> pc;
    Laptop(List<PC>pc){
        this.pc= pc;
    }
    public List<PC> getTotalLaptopInPC(){
        return pc;
    }
}
