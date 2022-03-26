
package aggregation;

/**
 *
 * @author ASUS
 */
public class Aggregation {

    public static void main(String[] args) {
        DataMHS data = new DataMHS("211524043","Laki-laki","Payakumbuh");
        Mahasiswa mhs = new Mahasiswa("Gian Sandrova","Teknik Informatika",data);
        System.out.println("Nama Mahasiswa : "+mhs.nama);
        System.out.println("Jurusan : "+mhs.Jurusan);
        System.out.println("Nim : "+data.NIM);
        System.out.println("Kelamin : "+data.Kelamin);
        System.out.println("Alamat : "+data.Alamat);
      
    }
    
}
