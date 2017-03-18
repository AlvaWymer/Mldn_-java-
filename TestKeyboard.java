class Keyboard{
	private String market;
	private String numero;
	private double price;
	private String color;
	private String mobilite;



public Keyboard(String market,String numero,double price,String color,String mobilite){
		setMarket(market);
		setNumero(numero);
		setPrice(price);
		setColor(color);
		setMobilite(mobilite);
	}


	public void setMarket(String market){
	this.market=market;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setMobilite(String mobilite){
		this.mobilite=mobilite;
	}


	public String getMarket(String market){
	return market;
	}
	public String getNumero(String numero){
		return numero;
	}
	public double getPrice(double price){
		return price;
	}
	public String geColor(String color){
		return color;
	}

	public String geMobilite(String mobilite){
		return mobilite;
	}



	public String getInfo(){
		return "market="+market+"numero="+numero+"price="+price+"color="+color+"mobilite="+mobilite;
	}
}

public class TestKeyboard{
	public static void main(String[] args){
		System.out.println(new Keyboard("苹果键盘","489058390452",999,"白色","可移动的").getInfo());


	}



}