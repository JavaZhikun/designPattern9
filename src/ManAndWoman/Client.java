package ManAndWoman;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	public static void main(String[] args)
	{
		List<Person> persons = new ArrayList<Person>();
		
		Person man1 = new Man();
		man1.action ="³É¹¦";
		persons.add(man1);
		
		Person woman1 = new Woman();
		woman1.action ="³É¹¦";
		persons.add(woman1);
		
		
		Person man2 = new Man();
		man2.action ="Ê§°Ü";
		persons.add(man2);
		
		Person woman2 = new Woman();
		woman2.action ="Ê§°Ü";
		persons.add(woman2);
		
		Person man3 = new Man();
		man3.action = "Áµ°®";
		persons.add(man3);
		
		Person woman3 = new Woman();
		woman3.action = "Áµ°®";
		persons.add(woman3);
		
		
		for(Person item : persons)
		{
			item.getConclusion();
		}
	}

}
