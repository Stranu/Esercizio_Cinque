public class NumeroComposto {
	private Integer x;
	private Integer y;
	
	NumeroComposto(){}
	
	NumeroComposto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return this.x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return this.y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
	
	public NumeroComposto somma(NumeroComposto altro) {
		return new NumeroComposto(this.x+altro.x,this.y+altro.y);
	}
	public NumeroComposto sottrazione(NumeroComposto altro) {
		return new NumeroComposto(this.x-altro.x,this.y-altro.y);
	}
	
	static NumeroComposto moltiplicazione(NumeroComposto uno, NumeroComposto due) {
		return new NumeroComposto(uno.x*due.x,uno.y*due.y);
	}
	static NumeroComposto divisione(NumeroComposto uno, NumeroComposto due) {
		
		Double primo = uno.x.doubleValue()/due.x.doubleValue();
		Double secondo = uno.y.doubleValue()/due.y.doubleValue();
		
		return new NumeroComposto(primo.intValue(),secondo.intValue());
	}

	
	
}