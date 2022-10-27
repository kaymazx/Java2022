package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World - Canli Ders 1");
		//degisik isimlendirmeler java'da camelCase(ilk kelime harfi kucuk diger kelime ilk harfi buyuk) yazılır
		String ortaMetin ="İlginizi Cekebilir";
		String altMetin ="Vade Suresi";
			
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		// 2022 Java Kamp Yayın 1 - 1:35:40
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {  	//true or false -*- true cikarsa kendi blogunun icini calistirir
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		}	else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		else { 
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		// 2022 Java Kamp Yayın 1 - 2:00:00
		
		//array				  //db'den gelir
		String [] krediler = {"Hizli Kredi","Maasini Halkbanktan Alanlara Ozel","Mutlu Emekli Kredisi"};
			
			// System.out.println(krediler[0]);
			// System.out.println(krediler[1]); Sayma islemi 0'dan baslar. Eleman sayısı fazla olabilir, orn: 1000x System.out.println kullanilmaz
			// System.out.println(krediler[2]);
		
			//Bu yuzden donguler ile dinamik sistem yazarız
			
				for (int i = 0; i < krediler.length; i++) {
					 System.out.println(krediler[i]);
				}
		// 2022 Java Kamp Yayın 1 - 2:16:15
			
	}

}
