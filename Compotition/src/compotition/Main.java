package compotition;
import java.util.*;  

public class Main{
    public static void main(String args[]){
        
        PC Pc1 = new PC("ASUS A416JP","I5 1035G1","MX 330");
        PC Pc2 = new PC("Lenovo Legion 5 15","AMD Ryzen 7 4800H","GeForce GTX 1650Ti");
        PC Pc3 = new PC("Acer Nitro 5","I5-11400H","RTX 3050Ti");
    
        List<PC> pc = new ArrayList<>();
        pc.add(Pc1);
        pc.add(Pc2);
        pc.add(Pc3);
        
        for (PC pC : pc){
            System.out.println("Nama: " + pC.name + ", Processor : " + pC.processor + ", VGA :"+ pC.vga);
        }
        
    }
}

