import java.util.HashMap;
import java.util.Map;

public class Count {
	
	public static void printCount(String str1)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		str1=str1.toUpperCase().replaceAll("\\s+","");
		char arr1[] = str1.toCharArray(); 
		for (int i = 0; i < arr1.length; i++)
		{ 
			  
            if (map.get(arr1[i]) == null) { 
  
                map.put(arr1[i], 1); 
            } 
            else { 
                Integer c = (int)map.get(arr1[i]); 
                map.put(arr1[i], ++c); 
            } 
        }
		for (char k : map.keySet())
		{
			System.out.print(k + " ");
			for(int i=0;i<map.get(k);i++)
			{
				System.out.print("#");
			}
			System.out.println();
     
	}
	}
	public static void main(String[] args)
	{
		String str1 = "Hey how are you";  		
		printCount(str1);
	}

}
