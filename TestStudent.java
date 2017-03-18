class Student{
	private String number;
	private String name;
	private int age;
	private String class_name;
	private String professionnel;

	public Student(String number,String name,int age,String classe_name,String professionnel){
		setNumber(number);
		setName(name);
		setAge(age);
		setClass_name(classe_name);
		setProfessionnel(professionnel);
	}
	public void setNumber(String number){
		this.number=number;
	} 
	public String getNumber(String number){
		return number;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(String name){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(int age){
		return age;
	}
	public void setClass_name(String class_name){
		this.class_name=class_name;
	}
	public String getClass_name(String class_name){
		return class_name;
	}
	public void setProfessionnel(String professionnel){
		this.professionnel=professionnel;

	}
	public String getProfessionnel(String professionnel){
		return professionnel;
	}

	public String getInfo(){

		return "number="+number+"name="+name+"age="+age+"class_name="+class_name+"professionnel"+professionnel;

	}



}
public class TestStudent{
	public static void main(String[] args){
		System.out.println(new Student("78492","hello",87,"软件","计算机").getInfo());


	}


}