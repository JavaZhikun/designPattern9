package ManAndWoman;

public class Woman extends Person
{
	@Override
	public void getConclusion()
	{
		// TODO Auto-generated method stub
	   if(action =="�ɹ�")
	   {
		   System.out.println(this.getClass().getName()
				   + action +"ʱ����������һ�����ɹ�������");
	   }
	   
	   else if(action =="ʧ��")
	   {
		   System.out.println(this.getClass().getName()
				   + action + "ʱ������������˭ҲȰ����");
	   }
	   
	   else if(action == "����")
	   {
		   System.out.println(this.getClass().getName()
				   + action + "ʱ�����¶�Ҳװ����");
	   }
	}

}
