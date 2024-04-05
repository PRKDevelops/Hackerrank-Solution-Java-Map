
	import java.util.*;
	import java.io.*;

	class JavaMap{
		public static void main(String []argh)
		{
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        in.nextLine(); 
	        
	        Map<String, String> phonebook = new HashMap<>();
	        for(int i = 0; i < n; i++) {
	            String name = in.nextLine();
	            String phone = in.nextLine();
	            phonebook.put(name, phone);
	        }
	        
	        while(in.hasNext()) {
	            String s = in.nextLine();
	            if (phonebook.containsKey(s)) {
	                System.out.println(s + "=" + phonebook.get(s));
	            } else {
	                System.out.println("Not found");
	            }

	        }
	        in.close();
	    }
		}
		


