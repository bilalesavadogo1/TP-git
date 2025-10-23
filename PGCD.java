import java.util.Scanner;
public class PGCD {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("le premier entier");
int M = sc.nextInt();
System.out.println("entrer le deuxieme entier");
int N = sc.nextInt();
int A=M; int B=N;
while(N!=M){
if(M>N){
M=M-N;
}
else{
    N= N-M;
}
}
System.out.println("le PGCD de "+A+ "et" +B+ "est:" +M);
}
    }