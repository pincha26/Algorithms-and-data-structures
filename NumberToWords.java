package strings;

public class NumberToWords {
	
	static String[] onetoten = {"zero","one", "two","three","four","five", "six", "seven", "eight","nine"};
	
	static String[] fromEleven = {"ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "eventeen", "eighteen","nineteen"};
	
	static String[] tens = {"","","twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	static String[] place = {"","thousand", "million"};
	
	public static void main(String args[]){
		
		int x =122345;
		String s = String.valueOf(x);
		
		int length = s.length();
		
		String toWords = "";
		int n = x;
		int i =0;
		while(n>0){
			
			int hundred = n%1000;
			toWords = convertLessThanThousand(hundred) + place[i] + toWords;
			n = n/1000;
			i++;
		}
		
		
		System.out.println(toWords);
		
	}
	
	public static String convertLessThanThousand(int x){
		
		String toWords = "";
			
		
		if(x>=20 || x<9){
			
			int units = x%10;
			toWords = toWords+ onetoten[units];
			
			int ten = x/10;
			
			toWords =  tens[ten%10] + toWords;
			
		}
		else{
			
			toWords = fromEleven[x-10] +toWords;
		}
		x = x/100;
		
		if(x>0){
			
			toWords = onetoten[x] + toWords;
		}
		
		return toWords;
	}
	
}
