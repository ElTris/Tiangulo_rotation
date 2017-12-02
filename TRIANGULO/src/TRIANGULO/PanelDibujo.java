package TRIANGULO;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
 
 Triangulo t;
 int base=0;
 int alto=0;
 int x=0;
 int y=0;
 public int grados=0;
 public PanelDibujo(){
  t=new Triangulo(x,y,base,alto);
 }
 
public void paintComponent(Graphics grafico){
 super.paintComponents(grafico);
 Graphics2D g=(Graphics2D)grafico;
 g.setColor(Color.ORANGE);
 g.setStroke(new BasicStroke(1));
 
 
 double r = Math.toRadians(grados); // Para girar la figura se necesitan radianes
 AffineTransform at = new  AffineTransform();
 at.setToRotation(r, x+90, y+80); 
 ((Graphics2D) grafico).setTransform(at);
 t.setX(x);
 t.setY(y);
 t.setAlto(alto);
 t.setBase(base);
 t.pintar(g);
  }

 public int getBase() {
  return base;
 }

 public void setBase(int base) {
  this.base = base;
 }

 public int getAlto() {
  return alto;
 }

 public void setAlto(int alto) {
  this.alto = alto;
 }

 public int getX() {
  return x;
 }

 public void setX(int x) {
  this.x = x;
 }

 public int getY() {
  return y;
 }

 public void setY(int y) {
  this.y = y;
 }
}