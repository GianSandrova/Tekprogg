package dependence;

/**
 *
 * @author Gian
 */
public class Motor {
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public double getcc() {
        return cc;
    }
    public void setcc(int cc) {
        this.cc = cc;
    }
// data field
private String nama;
private String jenis;
int cc;
// behavior
void printMotor (){
    System.out.println("Data Motor :");
    System.out.println("=================================");
    System.out.println("Nama  : " + getNama());
    System.out.println("Jenis : " + getJenis());
    System.out.println("CC    : " + getcc());
    System.out.println("");
    }
}


