
class RealImage implements Image {
   private String filename;

   public RealImage(String filename) {
      this.filename = filename;
      this.loadFromRemoteServer();
   }

   private void loadFromRemoteServer() {
      System.out.println("Loading Image From Remote Server: " + this.filename);
   }

   public void display() {
      System.out.println("Showing Image : " + this.filename);
   }
}