package association;

public class main {

   
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Politeknik Negeri Bandung");
        Mahasiswa mhs=new Mahasiswa("Gian Sandrova");
        
        System.out.println(mhs.getNamaMahasiswa() + " Adalah Mahasiswa " + kampus.getNamaKampus());
    }
    
}
