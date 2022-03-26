package dependence;

/**
 *
 * @author Gian Sandrova
 */
public class Dependence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inisialisasi object1
        Motor m1=new Motor();
        m1.setNama ("Honda Supra X 125 FI");
        m1.setJenis("Bebek");
        m1.setcc(125);
        m1.printMotor();
        //object 2
        Motor m2=new Motor();
        m2.setNama("Honda Vario 150");
        m2.setJenis("Matic");
        m2.setcc(150);
        m2.printMotor();
    }
}
    
