package Grille;
import java.util.Scanner;

public class grille{
    public int[][] tab;
    private int nbLigne;
    private int nbColonne;

    public grille(){
        System.out.println("Grille");
        System.out.println("Combien de lignes?");
        Scanner sc0 = new Scanner(System.in);
        this.nbLigne = sc0.nextInt();
        System.out.println("Combien de colonnes?");
        Scanner sc1 = new Scanner(System.in);
        this.nbColonne = sc1.nextInt();

        this.tab = new int[nbLigne][nbColonne];
    }

    public grille(int nbLigne, int nbColonne){
        this.nbLigne = nbLigne;
        this.nbColonne = nbColonne;
        this.tab = new int[nbLigne][nbColonne];
    }

    public void printGrille(){
        for(int i = 0; i< this.nbLigne; i++){
            for(int x = 0; x< this.nbColonne;x++){
                System.out.print("  _ ");
            }
            System.out.println();
            System.out.println();
            
            for(int j = 0; j< this.nbColonne; j++){
                System.out.print("| "+ this.tab[i][j] + " ");
                //Every tab's cellule should have only one character for a good display
            }
            System.out.print("|");
            System.out.println();
            
        }
        for(int y = 0; y< this.nbColonne;y++){
                System.out.print("  _ ");
        }
        System.out.println();
    }

    public void setGrille(int nbL,int nbC,int value){
        
        this.tab[nbL][nbC] = value;
    }

    public int getLigne(){
        return this.nbLigne;
    }

    public int getColonne(){
        return this.nbColonne;
    }

}
