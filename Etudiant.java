import java.util.Scanner;
public class Etudiant {
    public String nom ;
    public float note1,note2;
    Etudiant(String nom ,float note1,float note2){
        this.nom=nom; this.note1 = note1; this.note2 = note2;
    }
    public float Calc_moy(){
        return (note1 + note2)/2;
    }
public void afficher() {
    System.out.println("L'étudiant  A" + nom + " a: " + Calc_moy());
}
 }
 class main {
    public static void main(String[] args) {
String nom;
float note1,note2;
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nom de l'etudiant");
nom =sc.nextLine();
System.out.println("Entrer la note1");
note1 = sc.nextFloat();
System.out.println("Entrer la note2");
note2 = sc.nextFloat();
Etudiant E = new Etudiant(nom,note1,note2);
E.afficher();
    }
}