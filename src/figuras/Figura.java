package figuras;
import java.awt.Color;
public abstract class Figura implements Fraccion{
private Punto centro;
private Color color;

public Figura(double x, double y, Color color){
centro = new Punto (x, y);
this.color = color;
}

public double getXCentro(){
return centro.getX();
}

public double getYCentro(){
return centro.getY();
}

public Color getColor(){
return color;
}

public void setXCentro(double x){
centro.setX (x);
}

public void setYCentro(double y){
centro.setY (y);
}
public void setColor(Color color){
this.color = color;
}

public abstract double perametro();  

public abstract double area();  

@Override
public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area())
		   return 1;
	   else
		   if (this.area() < otraFigura.area())
			   return -1;
		   else
			   return 0;
	}

}
