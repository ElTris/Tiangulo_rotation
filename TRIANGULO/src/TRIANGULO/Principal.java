package TRIANGULO;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JApplet;

public class Principal extends JApplet {
 
 PanelDibujo pd;
 int cont=0;
 int x=0;
 int y=0;
 int alto=0;
 int base=0;
 
 public void init(){
  pd=new PanelDibujo();
  MouseAdapter ml=new MouseAdapter() {
   
   @Override
   public void mousePressed(MouseEvent e) {
   // x=e.getXOnScreen()-40;
   // y=e.getYOnScreen()-70;
	pd.grados++;
    pd.setX(x);
    pd.setY(y);
   }
   
  };
  pd.addMouseListener(ml);
  MouseMotionAdapter mml=new MouseMotionAdapter() {
      
   @Override
   public void mouseDragged(MouseEvent e) {
	   pd.grados++;
	   
    base=(e.getXOnScreen()-40)-x;
    alto=(e.getYOnScreen()-70)-y;
    pd.setAlto(alto);
    pd.setBase(base);
    pd.repaint();
    repaint();
   }
  };
  pd.addMouseMotionListener(mml);
  add(pd);
 }
}