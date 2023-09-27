import java.util.Scanner;

  public class praktikum02 {
    public static void main(String[] args) {
        //Program Soal Pertama
     Scanner ingput = new Scanner(System.in);
     String nama, nim, prodi;
     
     System.out.print("Nama Lengkap : "); nama = ingput.nextLine();
     System.out.print("NIM : "); nim = ingput.nextLine();
     System.out.print("Program Studi : "); prodi = ingput.nextLine();

     System.out.println("Selamat datang " + nama + " dengan NIM : " + nim + " dari Program Studi " + prodi);

    }
  }
