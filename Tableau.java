import java.util.Scanner;
public class Tableau {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int []T = new int[10]; int []T1 = new int[10];int []T2 = new int[10];
int i; int j = 0; int k =0;
System.out.println("Saisir les éléments du tableau ");
for(i=0;i<10;i++) {
    T[i] = sc.nextInt();
}
for(i=0;i<10;i++){
    if(T[i]%2==0){
        T1[j]=T[i]; j=j+1;
    }
    else{
        T2[k]=T[i]; k=k+1;
    }}
System.out.println("les elements pairs sont :");
for(i=0;i<j;i++){
    System.out.println(T1[i]);
}
System.out.println("les élements impairs sont:");
for(i=0;i<k;i++){
    System.out.println(T2[i]);
}}}