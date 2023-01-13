import Grille.grille;

public class mainGrille{
    public static void main(String[] args){
        grille map = new grille(5,2);

        for(int i = 0; i < map.getLigne(); i++){
            for(int j = 0; j < map.getColonne(); j++){
                int x = i + j;
                if(x > 9){
                    x = x % 9;
                }
                map.setGrille( i, j, x);
               //map.tab[i][j] = x;

            }
        }

        map.printGrille();

        

        grille terrain = new grille();

        terrain.printGrille();

    }
}
