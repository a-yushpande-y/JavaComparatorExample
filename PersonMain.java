import java.util.*;
import java.io.*;
class Person{
    String first_name;
    String last_name;
    int age;
    String city;
    Person(String first_name,String last_name, int age, String city){
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        this.city=city;
    }
    String getName(){
		return this.first_name + " " + this.last_name;
	}
    String getFirstName(){
		return this.first_name;
	}
    String getLastName(){
		return this.last_name;
	}
	Integer getAge(){
		return this.age;
	}

	String getCity(){
		return this.city;
	}
    @Override
	public String toString(){
		return "Person : " + this.getName() + ", " + this.getAge() + ", " + this.getCity();
	}
}

class SortbyFirstName implements Comparator<Person> 
{ 
    public int compare(Person a, Person b) 
    { 
        return a.getFirstName().compareTo(b.getFirstName()); 
    } 
} 
  
class SortbyLastName implements Comparator<Person> 
{ 
    public int compare(Person a, Person b) 
    { 
        return a.getLastName().compareTo(b.getLastName()); 
    } 
}
class SortbyAge implements Comparator<Person> 
{ 
    public int compare(Person a, Person b) 
    { 
        return a.getAge().compareTo(b.getAge()); 
    } 
}
class SortbyCity implements Comparator<Person> 
{ 
    public int compare(Person a, Person b) 
    { 
        return a.getCity().compareTo(b.getCity()); 
    } 
}
public class PersonMain{

     public static void main(String []args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name,city,ans;
        String[] separated_names;
        int age;
        ArrayList<Person> plist = new ArrayList<Person>();
        while(true){
            System.out.println("Enter Name: ");
            name=br.readLine();
            separated_names=n.split(" ");
            System.out.println("Enter Age: ");
            age=Integer.parseInt(br.readLine());
            System.out.println("Enter City: ");
            city=br.readLine();
            plist.add(new Person(separated_names[0],separated_names[1],age,city));
            System.out.println("Do you want to add more(y/n)");
            ans=br.readLine();
            if(ans.equals("n"))
            break;
        }
        System.out.println("Sort by:");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Age");
        System.out.println("4. City");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1: Collections.sort(plist, new SortbyFirstName());
                break;
            case 2: Collections.sort(plist, new SortbyLastName());
                break;
            case 3: Collections.sort(plist, new SortbyAge());
                break;
            case 4: Collections.sort(plist, new SortbyCity());
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("After Sorting");
        for(Person s : plist){
			System.out.println(s);
		}
     }
}