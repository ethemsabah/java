package javademos;

public class sayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar=new int[] {1,2,3,5,7,9,0};
		int aranacak=4;
		boolean varMi=false;
		
		for(int i=0;i<sayilar.length;i++) {
			
			if(sayilar[i]==aranacak) {
				varMi=true;
			}
			
		}
		
		if(varMi==true) {
			System.out.println("Aranýlan deðer mevcut");
		}else
			System.out.println("Aranýlan deðer mevcut deðil");

	}

}
