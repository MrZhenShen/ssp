package oop;

class Base {
  public Base() {
    System.out.println(1);
  }

  public void b() {
    System.out.println(2);
  }
}

class One extends Base {
  public One() {
    super.b();
    this.b();
    System.out.println(3);
  }

  public void b() {
    System.out.println(4);
  }
}

public class Demo {
  public void main() {
    new One();
  }
}

