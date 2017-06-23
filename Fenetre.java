import javax.swing.JFrame;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.util.Observable;
import java.io.BufferedReader;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenetre extends JFrame implements Observer, KeyListener {


  private JPanel container = new JPanel();  
  private JLabel ecran = new JLabel();
  private GridBagConstraints c;
  private Map map;
  static JLabel[][] mapJLabel;
  //static char map[][] = { {' ','*','D','X'},{'H','*','*','*'} }; 

  static final int keyRight = 39;
  static final int keyLeft = 37;
  static final int keyUp = 38;
  static final int keyDown = 40;

  //L'instance de notre objet contrôleur

  //private AbstractControler controler;

  public Fenetre(Map map)  throws IOException
  {                
    System.out.println("Creation fenetre");
    this.setSize(340, 360);
    this.setTitle("BoulderDash");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.addKeyListener(this);

    container.setLayout(new GridBagLayout());
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;

    this.map = map;
    JLabel[][] mapJLabel = new JLabel[this.map.getHeight()][this.map.getWidth()] ;
    //initComposant();                

    //this.controler = controler;     
    this.display(c);
    
    //System.out.println(mapobj.getOnTheMapXY(0,0));

    this.setContentPane(container); // Jpanel
    this.setVisible(true);


  }

  

  @Override
  public void keyPressed(final KeyEvent keyEvent) {
    System.out.printf("Touche pressee : %s\n",keyEvent.getKeyCode());
   // this.heroMove(keyEvent.getKeyCode());

  }

  @Override
  public void keyReleased(final KeyEvent keyEvent) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyTyped(final KeyEvent keyEvent) {
    // TODO Auto-generated method stub

  }

  public final BufferedImage loadImage(String imageName,int posX, int posY)  throws IOException{
        BufferedImage bigImg = ImageIO.read(new File(imageName));
        BufferedImage img = bigImg.getSubimage(posX*16,posY*16,16,16);
        return img;
    }

  public void update(Observable o, Object arg)
  {
    System.out.println("Update");
    //this.repaint();
  }

  public void paintComponent(Graphics g)  throws IOException
  {
      //this.display(c);
  }


  public void displayOnXY(Image img, int x, int y, GridBagConstraints c)
  {
      
              //this.mapJLabel[y][x] = 
              JLabel j = new JLabel(new ImageIcon(img));
              c.gridx=x;
              c.gridy=y;
              container.add(j,c);

        /*    } catch (IOException e) {
              System.out.println("Erreur image");
            }*/
  }


  public void display(GridBagConstraints c)
  {        
    for (int x = 0; x < this.map.getWidth(); x++) {
              for (int y = 0; y < this.map.getHeight(); y++) {
                  System.out.printf("(%s,%s) %s",x,y,this.map.getOnTheMapXY(x,y).getSprite().getConsoleImage());
                 // this.map.getOnTheMapXY(x,y).getSprite().getImage();
                  this.displayOnXY(this.map.getOnTheMapXY(x,y).getSprite().getImage(),x,y,c);
          }   
    }
  }
    
    //Graphics.drawImage(Image img,int x, int y);
  
}
