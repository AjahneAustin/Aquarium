import java.util.*; 


public class AppUsingAquarium{
   public static void main(String[] args) {
      /*
      Aquarium a1 = new Aquarium(20, 20, 10, "iron");
	  int result = a1.computeFilledWeight();
	  System.out.println(a1);
	  */
	  int length;
	  int width;
	  int height;
	  String material;
	  
	  Scanner scan = new Scanner(System.in); 
	  System.out.println("Enter length, width, height, material for first aquarium"); 
	  int a1length = scan.nextInt(); 
	  int a1width = scan.nextInt(); 
	  int a1height = scan.nextInt(); 
	  string intMaterial1 = scan.nextInt(); 
	  
	  Aquarium firstAquarium = new Aquarium(inLength, inWidth , inHeight, inMaterial);
	  int result1 = firstAquarium.computeVolume(); 
	  int result1 = firstdAquarium.computeFiddleWeight();

	  
	  
	  System.out.println("Enter length, width, height, material for second aquarium"); 
	  int a2Length = scan.nextInt(); 
	  int a2Width = scan.nextInt(); 
	  int a2Height = scan.nextInt(); 
	  string intMaterial2 = scan.nextInt(); 
	  
	  Aquarium secondAquarium = new Aquarium(inLength, inWidth, inHeight, inMaterial);
	  int result2 = secondAquarium.computeVolume(); 
	  int result2 = secondAquarium.computeFiddleWeight();

	  
	  System.out.println("Enter length, width, height, material for third aquarium"); 
	  int a3length = scan.nextInt(); 
	  int a3width = scan.nextInt(); 
	  int a3height = scan.nextInt(); 
	  string intMaterial3 = scan.nextInt(); 
	  
	  Aquarium thirdAquarium = new Aquarium(inLength, inWidth, inHeight, inMaterial);
	  int result3 = thirdAquarium.computeVolume(); 
	  int result3 = thirdAquarium.computeFiddleWeight();
	  
	  if(result1 > result2 && result1 > result3) {
	     System.out.println("Largest aqarium has the volume: " + result1); 
	  }
	  else if(result2 > result1 && result2 > result3) {
		System.out.println("Largest aqarium has the volume: " + result2);
	  }
	  else if(result3 > result1 && result3 > result2) {
		System.out.println("Largest aqarium has the volume: " + result3);
	  }
	  
	  
	  
	  public Aquarium() {
      length = 0;
	  width = 0;
	  height = 0;
	  material = "";
   }
   public Aquarium(int inLength, int inWidth, int inHeight, string inMaterial) {
      length = inLength;
	  width = inWidth;
	  height = inHeight;
	  material = inMaterial;
   } 
   public void setLength(int inLength) {
      length = inLength;
   }
   public void setWidth(int inWidth) {
      width = inWidth;
   }
   public void setHeight(int inHeight) {
      height = inHeight;
   }
   public void setMaterial(String inMaterial) {
      material = inMaterial;
   }
   public int computeVolume() {
      return length * width * height;
   }
   public int computeFilledWeight() {
      // depend on the material filled
	  // Assume there are 3 kind of material: sand, iron, and water
	  int materialWeight = 0;
	  switch (material) {
	     case "sand": materialWeight = 50; break;
		 case "iron": materialWeight = 120; break;
		 case "water": materialWeight = 80; break;
	  }
	  return computeVolume() * materialWeight;
   }
   
   public int getLength() {
		return length;
   }
   public int getWidth() {
		return width;
   }
   public int getHeight() {
		return height;
   }
   public int getMaterial() {
		return material;
   }
   public String toString() {
      return "THE TOTAL wEIGHT FILLED IS:  " + computeFilledWeight();
   }
   
   }
   
   }

/*

C:\Users\Aj\Documents\JavaFiles> java AquariumApp2YourAjahneAustin

**********
THE LARGEST AQUARIUM HAS THE VOLUME: 5000

THE TOTAL WEIGHT WHEN FILLED IS: 10000
**********

 
*/
	
   

