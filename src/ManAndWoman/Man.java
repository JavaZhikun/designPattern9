package ManAndWoman;

public class Man extends Person
{
	@Override
	public void getConclusion()
	{
		// TODO Auto-generated method stub
	     if(action =="�ɹ�")
	     {
	    	 System.out.println(this.getClass().getName()
	    			 + action + "ʱ����������һ��ΰ���Ů��");
	     }
	     
	     else if(action =="ʧ��")
	     {
	    	 System.out.println(this.getClass().getName()
	    			 + action +"ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ");
	     }
	     
	     else if(action =="����")
	     {
	    	 System.out.println(this.getClass().getName()
	    			 + action + "ʱ�����²���ҲҪװ��");
	     }
	}

}
