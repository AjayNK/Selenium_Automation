package Scripts;

public class LearnConstructor2 {

int id;
String name;

//Deafult constructor - no arguments
LearnConstructor2()
{
	
}

void display()
{
	System.out.println(id+" "+name);
}

public static void main(String[] args) 
	{
	LearnConstructor2 x = new LearnConstructor2();
	x.display();
	}

}
