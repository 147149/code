import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Graphics;
import javax.swing.JPanel;
public class WorldGUI extends JFrame{
    private World wt;
    private WorldPanel worldPanel;
    public WorldGUI(World w){
        wt=w;
        worldPanel = new WorldPanel(w);
        initialize(wt);
        worldPanel.draw();
    }
    public void draw(){
        while(true){
            repaint();
            wt.change();
        }
    }
/*
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
    }*/



    private void initialize(World wt) {
        JFrame frame = new JFrame();
        frame.add(worldPanel);
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu options = new JMenu("Options");
        menu.add(options);

        JMenuItem arrow = options.add("Arrow");
        arrow.addActionListener(new ArrowActionListener());

        JMenuItem square = options.add("Square");
        square.addActionListener(new SquareActionListener());

        JMenuItem shuffle = options.add("Shuffle");
        shuffle.addActionListener(new ShuffleActionListener());
        JMenuItem gun = options.add("»¬ÏèÕßÇ¹");
        gun.addActionListener(new GunActionListener());


        JMenu setting = new JMenu("Setting");
        menu.add(setting);
        JMenuItem kuai = setting.add("¿ì");
        kuai.addActionListener(new KuaiActionListener());

        JMenuItem zhong = setting.add("ÖÐ");
        zhong.addActionListener(new ZhongActionListener());

        JMenuItem man = setting.add("Âý");
        man.addActionListener(new ManActionListener());

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1007, 859);
        frame.setTitle("Game of Life");
        frame.setVisible(true);
        frame.setResizable(false);
    }

    class ArrowActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            wt.setArrow();
        }
    }

    class SquareActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            wt.setSquare();
        }
    }
    class ShuffleActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            wt.setShuffle();
        }
    }
    class GunActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            wt.setGun();
        }
    }
    class KuaiActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            worldPanel.setTime(30);
        }
    }
    class ZhongActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            worldPanel.setTime(100);
        }
    }
    class ManActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            worldPanel.setTime(1000);
        }
    }
}
