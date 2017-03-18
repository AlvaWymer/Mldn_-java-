class Phone{
	private String phone_number;
	private String market;
	private String type;
	private String mem;
	private double price;

	public Phone(String phone_number,String market,String type,String mem, double price){
		setPhone_number(phone_number);
		setMarket(market);
		setType(type);
		setMem(mem);
		setPrice(price);



	}

	public void setPhone_number(String phone_number){
		this.phone_number=phone_number;
	}
	public String getPhone_number(String phone_number){
		return phone_number;
	}
	public void setMarket(String market){
		this.market=market;
	}
	public String getMarket(String market){
		return market;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(String type){
		return type;
	}
	public void setMem(String mem){
		this.mem=mem;
	}
	public String getMem(String mem){
		return mem;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(double price){
		return price;
	}





	public String getInfo(){
		return "phone_number="+phone_number+"market="+market+"type+"+type+"mem="+mem+"price="+price;



	}
}
public class TestPhone{
	
	public static void main(String[] args){
		System.out.println(new Phone("4902423","nokia","phone","6g",5679).getInfo());
	}
}