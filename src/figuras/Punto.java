package figuras;
public class Punto {
private double x;
private double y;

public Punto(){
setX(0);
setY(0);
}

public Punto(double x, double y){
this.setX(x);
this.setY(y);
}

public Punto(Punto p){
setX(p.getX());
setY(p.getY());
}

public double getX(){
return x;
}

public double getY(){
return y;
}

public void setX(double x){
this.x = x;
}

public void setY(double y){
this.y = y;
}

public double distancia(Punto p){
return Math.sqrt (Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
}

public Punto simetrico(){
return new Punto (this.getX() * -1, this.getY()) ;
}

public boolean compara(Punto p){
if (p.getX() == getX() && p.getY() == getY())
   return true;
else
   return false;
}

public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}
