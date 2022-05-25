import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        int mat, fiz,kim,trk,trh,muz;

        Scanner input= new Scanner(System.in);

       System.out.print("Matematik Notunuz : ");
       mat=input.nextInt();
       System.out.print("Fizik Notunuz : ");
       fiz= input.nextInt();
       System.out.print("Kimya Notunuz : ");
       kim=input.nextInt();
       System.out.print("Turkce Notunuzu : ");
       trk= input.nextInt();
       System.out.print("Tarih Notunuzu : ");
       trh= input.nextInt();
       System.out.print("Muzik Notunuz : ");
       muz= input.nextInt();
       int top=(mat+fiz+kim+trk+trh+muz);
       double son= top/6;
       System.out.println("Ortalamaniz : " + son);
       boolean kos=son>=60;
       String gecti= kos ? "Sinifi Gecti" : "Sinifta Kaldi";
       System.out.print(gecti);

    }
}
