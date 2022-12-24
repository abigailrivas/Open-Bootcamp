class Main {
  public void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.agregarPuertas(1);

    sumar3(10,12,3);
  }

  public static void  sumar3(int a, int b, int c){
    System.out.println(a + b + c);
  }
}

class Coche {
  public int puertas = 4;

  public void agregarPuertas(int a){
    puertas =+ a;
    System.out.println(puertas);
  }
}  


