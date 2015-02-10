
package circulerMotion;
import Javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circule extends JPanel implements Runnable{
 
    double angle = Math.PI/2;
    double radius;
    
    public Circule(){
        setDoubleBuffered(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(Color.BLACK);
        
        this.radius = (getHeight() - 30)/2;
        int ancherX = 15;
        int ancherY = 15;
        int ballX = ancherX + (int)((radius)*(1-Math.cos(angle)))-5;
        int ballY = ancherY + (int)((radius)*(1-Math.sin(angle)))-5;
        
        //System.out.println(ballX + " " + ballY + " " + radius + " " );
        
        g.drawOval(ancherX, ancherY, (getWidth() - 30), (getHeight() - 30));
        g.drawLine(ancherX, getHeight()/2, (getWidth() - ancherX), getHeight()/2); //X axis 
        g.drawLine(getWidth()/2, ancherY, getWidth()/2, (getHeight()-ancherY));//Y axis
        
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, 10, 10);
        g.drawLine(getWidth()/2, getHeight()/2, ballX+5, ballY+5);
        
        
    }
    
    @Override
    public void run() {
        double centerAccel, Velocity = 10,dt=0.1;
        
        while(true){
            angle +=0.1; 
            
            repaint();
            try { Thread.sleep(100); } catch (InterruptedException ex) {}
        } 
    }
    
    public void circleThread(){
        Circule c = new Circule();
        new Thread(c).start();
    }
    
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Pendulum");
//        Circule C = new Circule();
//        f.add(C);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.pack();
//        f.setVisible(true);
//
//        new Thread(C).start();
//    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
     
   
}
