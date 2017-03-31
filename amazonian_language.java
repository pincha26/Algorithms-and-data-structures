package Bloomberg;

import java.util.Scanner;

public class amazonian_language {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int thresholdTotal = sc.nextInt();
		int thresholdWord = sc.nextInt();
		
		int baseLength = sc.nextInt();
		int compareLength = sc.nextInt();
		
		String[] base = new String[baseLength];
		String[] compare = new String[compareLength];
		
		for(int i=0;i< baseLength;i++){
			
			base[i] = sc.next();
		}
		
		for(int i=0;i< baseLength;i++){
			
			compare[i] = sc.next();
		}
		
		double total =0;
		for(int i=0;i< compareLength;i++){
			
			double minimum =  ((thresholdWord/100.0)*compare[i].length());
			for(int j=0;j< baseLength;j++){
				
				if(base[j].length()>=minimum && minimum ==(int)minimum){
					
					if(compare[i].substring(0,(int)minimum).equals(base[j].substring(0,(int)minimum)) ){
						total = total +1; 
						break;
					}
				}
				else if(base[j].length()>=minimum && minimum !=(int)minimum){
					
					if(compare[i].substring(0,(int)minimum+1).equals(base[j].substring(0,(int)minimum+1)) ){
						total = total +1; 
						break;
					}
				}
				else{
					break;
				}
				
			}
		
		}
		int percent = (int) ((total/compareLength)*100);
		if(percent>thresholdTotal){
			System.out.println(percent);
		}
		else{
			System.out.println(0);
		}
	}
	
}
