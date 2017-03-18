class Shoes{
	private String market;
	private double size;
	private double price;
	private String sex;
	private String color;

	public Shoes(String market,double size,double price,String sex,String color){
		setMarket(market);
		setSize(size);
		setPrice(price);
		setSex(sex);
		setColor(color);
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
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setColor(String color){
		this.color=color;
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
	public String getSex(String sex){
		return sex;
	}
	public String geColor(String color){
		return color;
	}

	public String getInfo(){
		return "market="+market+"size="+size+"price="+price+"sex="+sex+"color="+color;
	}






}
public class TestShoes{
	public static void main(String[] args){
		System.out.println(new Shoes("nike",43,899,"男","灰").getInfo());


	}



}