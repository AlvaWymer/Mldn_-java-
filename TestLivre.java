class Livre{
	
	private String name;
	private String id;
	private String imie;
	private String author;
	private String date;

	public Livre(String name,String id,String imie,String author,String date){
		setName(name);
		setId(id);
		setImie(imie);
		setAuthor(author);
		setDate(date);
	}


public void setName(String name){
	this.name=name;
}
public void setId(String id){
	this.id=id;
}
public void setImie(String imie){
	this.imie=imie;
}
public void setAuthor(String author){
	this.author=author;
}
public void setDate(String date){
	this.date=date;
}


public String getName(String name){
	return name;
}
public String getId(String id){
	return id;
}
public String getImie(String imie){
	return imie;
}
public String getAuthor(String author){
	return author;
}
public String getDate(String date){
	return date;
}


public String getInfo(){
	return "name="+name+"id="+id+"imie="+imie+"author="+author+"date="+date;




}


}

public class TestLivre{
	public static void main(String[] args){
		System.out.println(new Livre("shu","4382190482","11-10-43412384","fdsafdsa","11-10").getInfo());


	}



}