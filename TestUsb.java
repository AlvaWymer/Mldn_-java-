class Usb{
	private String market;
	private double size;
	private double price;
	private String color;
	private String name;

	public Usb(String market,double size,double price,String color,String name){
		setMarket(market);
		setSize(size);
		setPrice(price);
		setColor(color);
		setName(name);
	}

	public void setMarket(String market){
	this.market=market;
	}
	public void setSize(double size){
		this.size=size;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setName(String name){
		this.name=name;
	}



	public String getMarket(String market){
	return market;
	}
	public double getSize(double size){
		return size;
	}
	public double getPrice(double price){
		return price;
	}
	public String geColor(String color){
		return color;
	}

	public String geName(String name){
		return name;
	}
	



	public String getInfo(){
		return "market="+market+"size="+size+"price="+price+"color="+color+"name="+name;
	}
}

public class TestUsb{
	public static void main(String[] args){
		System.out.println(new Usb("pingguo",10,899,"baise","usb2.0").getInfo());


	}



}