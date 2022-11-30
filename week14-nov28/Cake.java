import java.util.ArrayList;

class Cake {
  private String name;
  private double cost;

  public Cake(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String toString() {
    return this.name + "," + this.cost;
  }

  public static ArrayList<Cake> LoadCakes(String filename) {
    In file = new In(filename);
    
    ArrayList<Cake> cakes = new ArrayList<Cake>();
    String[] lines = file.readAllLines();
    for (int i = 0; i < lines.length; i++) {
      String line = lines[i];
      String[] tokens = line.split(",");
      String name = tokens[0];
      double cost = Double.parseDouble(tokens[1]);

      cakes.add(new Cake(name, cost));
    }
    return cakes;
  }

  public static void SelectionSort(ArrayList<Cake> L) {
  }

  public static void main(String[] args) {

    ArrayList<Cake> cakes = LoadCakes("cakes.csv");

    SelectionSort(cakes);
    for (int i = 0; i < cakes.size(); i++) {
      System.out.println(cakes.get(i));
    }

  }
}