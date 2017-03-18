class Billet{
	private String depart;
	private String destination;
	private String depar_date;
	private String arrive_date;
	private double price;
	private String seat;
	
	public Billet(String depart,String destination,String depar_date,String arrive_date, double price, String seat){
		setDepart(depart);
		setDestination(destination);
		setDepar_date(depar_date);
		setArrive_date(arrive_date);
		setPrice(price);
		setSeat(seat);
	}
	public void setDepart(String depart){
		this.depart=depart;
	}
	public String getDepart(String depart){
	return depart;
	}
	public void setDestination(String destination){
	this.destination=destination;
	}
	public String getDesitination(String desitination){
	return destination;
	}
	public void setDepar_date(String depar_date){
	this.depar_date=depar_date;

	}
	public String getdDepar_date(String depar_date){
	return depar_date;
	}

	public void setArrive_date(String arrive_date){
	this.arrive_date=arrive_date;
	}
	public String getArrice_date(String arrive_date){
	return arrive_date;
	}
	public void setPrice(double price){
	this.price=price;
	}
	public double getPrice(double price){
	return price;

	}
	public void setSeat(String seat){
	this.seat=seat;

	}
	public String getSeat(String seat){
	return seat;

	}
public String getInfo(){
	return "depart="+depart+"destination="+destination+"depar_date="+depar_date+"arrive_date="+arrive_date+"price="+price+"seat="+seat;


}


}
public class TestBillet{
	public static void main(String[] args){
		System.out.println(new Billet("beijing","chengdu","11-10","11-22",800,"No89").getInfo());


	}



}