class Personne
{	
	private String id;
	private String name;
	private int age;
	private String addresse;
	private String tel;

	public Personne(String id,String name,int age,String addresse,String tel){
		setId(id);
		setName(name);
		setAge(age);
		setAddresse(addresse);
		setTel(tel);
	
	
	}

	public void setId(String id){
		this.id=id;
	}
	public String getId(String id){
		return id;
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
	public void setAddresse(String addresse){
		this.addresse=addresse;
	}

	public String getAddresse(String addresse){
		return addresse;	
	}

	public void setTel(String tel){
		this.tel=tel;
	
	} 
	public String getTel(String tel){
		return tel;
	
	}

	public String getInfo(){
		return "id="+id+"name="+name+"age="+age+"addresse="+addresse+"tel="+tel;
	
	
	}
}
public class TestPersonne
{
	public static void main(String[] args){
		System.out.println(new Personne("00001","zhansan",99,"离家","183748959555").getInfo());
	
	
	}
}