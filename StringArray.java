import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class StringArray {
	
	public static void frequency(String[] str1)
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		for (int i = 0; i < str1.length; i++)
		{ 
			  
            if (map.get(str1[i]) == null) { 
  
                map.put(str1[i], 1); 
            } 
            else { 
                Integer c = (int)map.get(str1[i]); 
                map.put(str1[i], ++c); 
            } 
        }
		
		Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
        	@Override
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        String ans[]=new String[map.size()];
        int j=0;
        for(Map.Entry<String, Integer> entry:list){
        	ans[j]=entry.getKey();
        	j++;
            //System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        for(j=0;j<map.size();j++)
        {
            System.out.println(ans[j]);
       	
        }
 	
	}
	public static void main(String[] args)
	{
		String[] str1= {"abc","xyz","pqr","xyz","pqr","pqr"};  		
		frequency(str1);
	}

}
