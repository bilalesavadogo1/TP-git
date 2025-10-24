import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Entrer un entier N");
int N = sc.nextInt();
int i; int P = 0;
while(N>0){
P = P*10;
P= P+N%10;
N= N/10;
}
System.out.println(+P);
    }}