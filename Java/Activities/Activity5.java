package activitities;

abstract class Book{
	String title;
	
	//abstract method
	abstract void setTitle(String s);
	
	//concrete Method
	String getTitle() {
		return title;
	}
	
}

class MyBook extends Book{
	//Define abstract method
    public void setTitle(String s) {
        this.title = s;
    }
}

public class Activity5{
	 public static void main(String []args) {
	        //Create object  MyBook
	        Book newNovel = new MyBook();
	        //Set title
	        newNovel.setTitle("Harry Potter");
	        
	        //Print title
	        System.out.println("The title is: " + newNovel.getTitle());
	    }
	
}