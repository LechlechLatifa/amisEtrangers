package AmisEtrangers;

import java.util.ArrayList;
import java.util.Scanner;

public class Personne {
    // declaretion

    private String firstName, lastName, nationalité;
    private short age;
    private ArrayList<Personne> listeAmis = new ArrayList<Personne>();
    Scanner sc = new Scanner(System.in);

    // getter&setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public ArrayList<Personne> getListeAmis() {
        return listeAmis;
    }

    public void setListeAmis(ArrayList<Personne> listeAmis) {
        this.listeAmis = listeAmis;
    }

    // constructor
    public Personne(String firstName, String lastName, String nationalité, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalité = nationalité;
        this.age = age;
    }

    // methods

    // afficher personne
    public String toString() {
        return "Personne :\n firstName : " + firstName + "\n lastName = " + lastName
                + "\n nationalité = " + nationalité + "\n age = " + age;
    }

    // comparaison
    @Override
    public boolean equals(Object obj) {
        Personne other = (Personne) obj;

        if (this.nationalité.equals(other.nationalité))
            return true;
        else
            return false;
    }

   /*  public boolean etranger(Personne other) {
        if (this.nationalité.equals(other.nationalité))
            return true;
        else
            return false;
    }*/

    //Liste des amis
    public void listeAmis(int n) {
        String firstName, lastName, nationalité;
        short age;
        for (int i = 0; i < n; i++) {
            System.out.println("firstName : ");
            firstName = sc.nextLine();
            System.out.println("lastName : ");
            lastName = sc.nextLine();
            System.out.println("nationalité : ");
            nationalité = sc.nextLine();
            System.out.println("age : ");
            age = sc.nextShort();
            listeAmis.add(new Personne(firstName, lastName, nationalité, age));
        }
        setListeAmis(listeAmis);
    }

    //Liste des amis étrangers
    public ArrayList<Personne> listeAmisEtrangers(Personne p) {
        ArrayList<Personne> temp = new ArrayList<Personne>();
        for (Personne e : this.listeAmis) {
            if (!(p.equals(e))) {
                temp.add(e);
            }
        }
        return temp;
    }

    //Afficher une liste
    public void afficherListe(ArrayList<Personne> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).toString());
        }
    }

}
