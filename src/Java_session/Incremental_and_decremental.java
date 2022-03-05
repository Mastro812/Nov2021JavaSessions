package Java_session;

public class Incremental_and_decremental {

	public static void main(String[] args) {
		
		
		//1. post increment
		int a = 1;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
		int c = -99;
		int d = c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		//2. pre increment
		int h = 1;
		int g = ++h;
		System.out.println(h);//2
		System.out.println(g);//2
		
		int l = -98;
		int i = ++l;
		System.out.println(l);//-97
		System.out.println(i);//-97
		
		int t = 10;
		System.out.println(t++);//10 it will take the initial value first
		System.out.println(t);//11 the value of 10 is increased by 1 i.e.11
		System.out.println(t++);//11
		System.out.println(t);//12
		
		//1.post decrement
		int s = 2;
		int q = s--;
		System.out.println(s);//1
		System.out.println(q);//2
		
		int u = 2;
		int o = --u;
		System.out.println(u);//1
		System.out.println(o);//1
		
		// for floating or decimal numbers 
		double ff = 12.33;
		System.out.println(++ff);
		
		// for characters
		char c1 = 'a';
		System.out.println(++c1);//b
		System.out.println((int)c1);//98
		

	}

}
