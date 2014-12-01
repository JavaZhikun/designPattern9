package ManAndWoman_visitor;


public class Success extends Action
{
	public void getManConclusion(Man concreteElementA) 
	{
		System.out.println(concreteElementA.getClass().getName() +  this.getClass().getName());
	};

	public void getWomanConclusion(Woman concreteElementB)
	{
		System.out.println(concreteElementB.getClass().getName() + this.getClass().getName());
	}
}
