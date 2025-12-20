import java.util.Scanner;
public class YoungestTallest{
 public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
    
	int Amarage = sc.nextInt();
	int Akbarage = sc.nextInt();
	int Anthonyage = sc.nextInt();
	
	int Amarheight = sc.nextInt();
	int Akbarheight = sc.nextInt();
	int Anthonyheight = sc.nextInt();
	
	if(Amarage < Akbarage && Amarage < Anthonyage){
	  System.out.print("Amar is youngest");
	}else if(Akbarage < Amarage && Akbarage < Anthonyage){
	  System.out.print("Akbar is youngest");
	}else{
	  System.out.print("Anthony is youngest");
	}
	System.out.println();
	
	if(Amarheight > Akbarheight && Amarheight > Anthonyheight){
	  System.out.print("Amar's height is tallest");
	}else if(Akbarheight > Amarheight && Akbarheight > Anthonyheight){
	  System.out.print("Akbar's height is tallest");
	}else{
	  System.out.print("Anthony's height is tallest");
	}
	
	sc.close();
  }
}