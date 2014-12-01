package ManAndWoman_visitor;

public class Woman extends Person
{
	@Override
	public void accept(Action visitor)
	{
		visitor.getWomanConclusion(this);
	}

}
