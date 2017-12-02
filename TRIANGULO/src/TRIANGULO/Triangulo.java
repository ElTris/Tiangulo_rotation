package TRIANGULO;

import java.awt.Graphics;

public class Triangulo {
 
 int alto=0;
 int base=0;
 int x=0;
 int y=0;
 
 public Triangulo(int x, int y, int a,int b){
  alto=a;
  base=b;
 }
 
 public void pintar(Graphics g){
  if(base!=0 && alto!=0){
   g.drawLine(x, y, x+(base/2), y+alto);
   g.drawLine(x+(base/2), y+alto, x-(base/2), y+alto);
   g.drawLine(x,y,x-(base/2), y+alto);
  }
 }

 public int getAlto() {
  return alto;
 }

 public void setAlto(int alto) {
  this.alto = alto;
 }

 public int getBase() {
  return base;
 }

 public void setBase(int base) {
  this.base = base;
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