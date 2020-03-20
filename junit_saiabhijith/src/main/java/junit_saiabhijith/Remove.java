package junit_saiabhijith;

public class Remove {
public String removal(String s) { 
	String k=s;
	if (k.length()==0) {
		 String u="";
		 return u;
	 }
	 else {
		 if (k.length()==1) {
			 if (k.charAt(0)=='A') {
				 return "";
			 } 
		 } 
		 else if (k.charAt(1)=='A' & k.charAt(0)=='A') {
			return s.substring(2); 
		 }
		 else if(k.charAt(0)=='A') {
			 return s.substring(1);
		 }
		 else if (k.charAt(1)=='A') {
			 return s.charAt(0)+s.substring(2);
		 }
	 }
	 
	 return k;
 }
}
