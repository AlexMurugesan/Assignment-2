import java.util.*;
import java.lang.*;

interface Comparable<T> {
    public boolean compareTo(T o);
}

public class Generics<T> implements Comparable {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	@Override
	public boolean equals(Object g2)
	{
		if(this==g2)return true;
		T obj=(T)g2;
		if(Objects.equals(obj,t))return true;
		return false;
	}
	public boolean compareTo(Object g2)
	{
		if(this==g2)return true;
		T obj=(T)g2;
		if(Objects.equals(obj,t))return true;
		return false;

	}
	
	public static void main(String args[]){
		Generics<String> g1 = new Generics<>();
		g1.set("Pankaj");
		
		Generics<String> g2 = new Generics<>();
		g2.set("Pankaj1");
		
		Generics<Integer> g3 = new Generics<>();
		g3.set(5);

		Generics<Integer> g4 = new Generics<>();
		g4.set(5);
		
		System.out.println(g1.equals(g2));
		System.out.println(g3.compareTo(g4));
		
	}
	
}
