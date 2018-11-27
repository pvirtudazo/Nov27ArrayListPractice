import java.util.ArrayList;
public class Nov27ALPractice
{
	public static ArrayList<Integer> listCombination(ArrayList<Integer> lista, ArrayList<Integer> listb)
	{
		ArrayList<Integer> listc=new ArrayList<>();
		int count=0;
		if (lista.size()>listb.size())
		{
			for (int i=0;i<listb.size();i++)
			{
				if (count%2==0)
				{
					listc.add(lista.get(i));
					count++;
				}
				if (count%2==1)
				{
					listc.add(listb.get(i));
					count++;
				}
			}
			for (int i=lista.size();i>listb.size();i--)
				listc.add(lista.get(i-1));
		}
		if (listb.size()>lista.size())
		{
			for (int i=0;i<lista.size();i++)
			{
				if (count%2==0)
				{
					listc.add(lista.get(i));
					count++;
				}
				if (count%2==1)
				{
					listc.add(listb.get(i));
					count++;
				}
			}
			for (int i=listb.size();i>lista.size();i--)
				listc.add(listb.get(i-1));
		}
		else if (lista.size()==listb.size())
		{
			for (int i=0;i<lista.size();i++)
			{
				if (count%2==0)
				{
					listc.add(lista.get(i));
					count++;
				}
				if (count%2==1)
				{
					listc.add(listb.get(i));
					count++;
				}
			}
		}
		return listc;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> listx=new ArrayList<>();
		for (int i=0;i<10;i++)
			listx.add(i);
		ArrayList<Integer> listy=new ArrayList<>();
		for (int i=0;i<11;i++)
			listy.add(i);
		System.out.println(listCombination(listx,listy));
	}
}