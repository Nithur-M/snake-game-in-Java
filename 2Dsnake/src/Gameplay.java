import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private int[] snakexlength = new int[750];
    private int[] snakeylength = new int[750];

    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    private ImageIcon rightmouth;
    private ImageIcon upmouth;
    private ImageIcon downmouth;
    private ImageIcon leftmouth;

    private int lengthofsnake = 3;

    private Timer timer;
    private int delay = 100;
    private ImageIcon snakeimage;

    private int moves = 0;

    private ImageIcon titleImage;

    public Gameplay()
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    public void paint(Graphics g)
    {
        if(moves == 0){
            snakexlength[2] = 50;
            snakexlength[1] = 75;
            snakexlength[0] = 100;

            snakeylength[2] = 100;
            snakeylength[1] = 100;
            snakeylength[0] = 100;

        }
        //title image border
        g.setColor(Color.white);
        g.drawRect(24, 10, 851, 55);

        //title image
        titleImage = new ImageIcon("snaketitle.jpg");
        titleImage.paintIcon(this, g, 25, 11);

        //border for play area
        g.setColor(Color.WHITE);
        g.drawRect(24, 74, 851, 577);

        //background for play area
        g.setColor(Color.BLACK);
        g.fillRect(25, 75, 850, 575);

        rightmouth = new ImageIcon("rightmouth.png");
        rightmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);

        for(int a = 0; a < lengthofsnake; a++){
            if(a==0 && right){
                rightmouth = new ImageIcon("rightmouth.png");
                rightmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
            }
            if(a==0 && left){
                leftmouth = new ImageIcon("leftmouth.png");
                leftmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
            }
            if(a==0 && down){
                downmouth = new ImageIcon("downmouth.png");
                downmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
            }
            if(a==0 && up){
                upmouth = new ImageIcon("upmouth.png");
                upmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
            }
            if(a!=0){
                snakeimage = new ImageIcon("snakeimage.png");
                snakeimage.paintIcon(this, g, snakexlength[a], snakeylength[a]);
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
