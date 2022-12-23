public class Main {
  public void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.agregarPuertas(1);

    System.out.println(sumar3(10,12,3));
  }

  class Coche {
    int puertas = 4;
  
    public void agregarPuertas(int a){
      puertas =+ a;
      System.out.println(puertas);
    }
  }  

  int sumar3(int a, int b, int c){
    return a + b + c;
  }

}



