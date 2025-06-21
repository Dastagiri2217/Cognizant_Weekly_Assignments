import java.util.HashMap;
import java.util.Map;

class ProxyImage implements Image {
   private static Map<String, RealImage> cache = new HashMap();
   private String filename;

   public ProxyImage(String filename) {
      this.filename = filename;
   }

   @Override
   public void display() {
      if (!cache.containsKey(this.filename)) {
         cache.put(this.filename, new RealImage(this.filename));
      } else {
         System.out.println("Image " + this.filename + "Loading from Cache");
      }

      ((RealImage)cache.get(this.filename)).display();//to access displayMethod in RealImageClass
   }
}