package ManAndWoman_visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure
{
	public List<Person> elements = new ArrayList<Person>();
	
	//����
	public void attach(Person element)
	{
		elements.add(element);
	}
	
	//�Ƴ�
	public void detach(Person element)
	{
		elements.remove(element);
	}
	
	//�鿴��ʾ
	public void display(Action visitor)
	{
		for(Person e : elements)
		{
			e.accept(visitor);
		}
	}
	

}
