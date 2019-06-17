import javax.swing.JPanel;
import java.awt.*;

public class WorldPanel extends JPanel{
    private long time = 100;//жаЫй
    private World wt;
    public WorldPanel(World w){
        wt=w;
    }
    public void draw(){
        while(true){
            repaint();
            wt.change();
            setTime(time);
            Delay(time);
        }
    }
    public void setTime(long time1){
        time = time1;
    }
    private void Delay(Long ms){

        Long dietime = System.currentTimeMillis()+ms;
        while(System.currentTimeMillis()<dietime){
            //do nothing
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int rows = wt.getRows();
        int columns  = wt.getColumns();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if(wt.getCurrentGeneration(i,j) == 1)//width 20,height 20
                {
                    g.fillRect(j * 20, i * 20, 20, 20);
                }
                else
                {
                    g.drawRect(j * 20, i * 20, 20, 20);
                }
            }
        }
    }

}
