package AmisEtrangers;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        ArrayList<Personne> listeAmisEtrangers = new ArrayList<Personne>();

        Scanner sc = new Scanner(System.in);

        //Lire la personne

        System.out.println("firstName : ");
        String firstName = sc.nextLine();
        System.out.println("lastName : ");
        String lastName = sc.nextLine();
        System.out.println("nationalité : ");
        String nationalité = sc.nextLine();
        System.out.println("age : ");
        short age = sc.nextShort();

        Personne p = new Personne(firstName, lastName, nationalité, age); //Personne avec nationalité algérienne

        //Les amis de cette personne

        System.out.println("nombre d'amis: ");
        int nb = sc.nextInt();
        p.listeAmis(nb);

        //la liste des amis étrangers de la personne p
        listeAmisEtrangers = p.listeAmisEtrangers(p);

        //Afficher la liste des amis étrangers
        if (listeAmisEtrangers.size() != 0) {
            System.out.println("Les amis etrangers : ");
            p.afficherListe(listeAmisEtrangers);
        } else {
            System.out.println("Vous n'avez pas d'amis amis etrangers !");
        }
    }

}