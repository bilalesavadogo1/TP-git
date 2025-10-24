import java.util.Scanner;
public class Chiffre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int N = sc.nextInt();
        int i=1;
        while (N/10!=0) {
            i = i + 1;
            N = (N/10);
        }
        System.out.println("Le nombre de nombre est :" + i);
    }}