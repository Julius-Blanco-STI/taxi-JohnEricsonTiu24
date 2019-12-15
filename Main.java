    public class Main {
   
    public static void main(String[] args) {
     
     Taxi x = new Taxi("Piattos 123");
     x.run("rudu");
     x.printCurrentLoc();
     x.setBook(1,1);
     x.run("I am leaving here ");
     x.reachedDestination();
     System.out.println("Your PlateNumber is " + x.name);
     System.out.println(x.reachedDestination());
     
    }
}

