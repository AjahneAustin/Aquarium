public class Aquarium {
   int length;
   int width;
   int height;
   String material;
   public Aquarium() {
      length = 0;
	  width = 0;
	  height = 0;
	  material = "";
   }
   public Aquarium(int inLength, int inWidth, int inHeight, String inMaterial) {
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
   public String toString() {
      return "total filled weight is " + computeFilledWeight();
   }
}