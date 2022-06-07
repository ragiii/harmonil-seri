import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");

        double n =input.nextDouble();
        double result=0;

        while(n>0){
            result += (1/n);
            n--;
        }
        System.out.println("sonuç : "+result);
    }
}
