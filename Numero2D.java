
public class Numero2D extends NumeroComposto {
	
	public Numero2D() {}

	public Numero2D(Integer x, Integer y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Double distanza(Numero2D x2) {
		//restituisce la distanza dei due punti su di un piano cartesiano
		return  Math.sqrt(Math.pow(this.getX()-x2.getX(), 2)+Math.pow(this.getY()-x2.getY(), 2));
	}

}
