package ManAndWoman_visitor;

public class Client
{
	ObjectStructure o = new ObjectStructure();
	o.attach(new Man());
	o.attach(new Woman());
	
	//�ɹ�ʱ�ķ�Ӧ
	Success v1 = new Success();
	o.display(v1);
	
	//ʧ��ʱ�ķ�Ӧ
	Failing v2 = new Failing();
	o.display(v2);
	
	//����ʱ�ķ�Ӧ
	Amativeness v3 = new Amativeness();
	o.display(v3);

}
