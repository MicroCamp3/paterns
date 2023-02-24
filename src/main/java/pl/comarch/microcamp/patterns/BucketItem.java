package pl.comarch.microcamp.patterns;

public class BucketItem {
  public BucketItem(int no, String name, int quantity, double price) {
    this.no = no;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  int no;
  String name;

  int quantity;

  double price;

  public int getNo() {
    return no;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return price;
  }
}
