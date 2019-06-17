
public class LifeGame {
    public static void main(String []args){
        World w = new World(40,50);
        WorldGUI gui = new WorldGUI(w);


       /* w.setArrow();
        int z= 10;
        while(z!=0){
            for(int i =0;i<40;i++){
                for(int j = 0;j<50;j++){
                    System.out.print(w.currentGeneration[i][j]);
                }
                System.out.print("\n");
            }
            w.change();
            z--;
        }*/
    }
}
