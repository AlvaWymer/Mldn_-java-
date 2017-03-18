class Computer{
	private String type;
	private String market;
	private String size;
	private String mem;
	private String hdd;
	private String cpu_size;

public Computer(String type,String market,String size,String mem,String hdd,String cpu_size){
	setType(type);
	setMarket(market);
	setSize(size);
	setMem(mem);
	setHdd(hdd);
	setCpu_size(cpu_size);
}
public void setType(String type){
	

	this.type=type;
}
public String gettype(String type){
	
	return type;
}

public void setMarket(String market){
	this.market=market;
}
public String getMarket(String market){
	
	return market;
}

public void setSize(String size){

	this.size=size;
}
public String getSize(String size){
	return size;
}
public void setMem(String mem){
	this.mem=mem;
}
public String getMem(String mem){
	return mem;
}
public void setHdd(String hdd){
	
	this.hdd=hdd;
}
public String getHdd(String hdd){
	return hdd;
}
public void setCpu_size(String cpu_size){
	this.cpu_size=cpu_size;
}
public String getCpu_size(String cpu_size){
	return cpu_size;

}
public String getInfo(){
  return "type="+type+"market="+market+"size="+size+"mem="+mem+"hdd="+hdd+"cpu_size="+cpu_size;


}



}
public class TestComputer{
	public static void main(String[] args){

		System.out.println(new Computer("notebook","lenovo","15","8g","1tb","1.9ghz").getInfo());


	}



}