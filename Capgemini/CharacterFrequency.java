import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //String s=sc.next();
		String s="abbccccc";
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
		    if(mp.containsKey(s.charAt(i)))
		    mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
		    else
		    mp.put(s.charAt(i),1);
		}
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
		    if(entry.getValue()>1)
		    System.out.print(entry.getKey()+""+entry.getValue());
		    else
		    System.out.print(entry.getKey());
		}
	}
}
