class Main {
    public void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Abi";
        cliente.edad = 20;
        cliente.telefono = "11 2732 1212";
        cliente.credito = 45000;
        
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Manu";
        trabajador.edad = 20;
        trabajador.telefono = "11 2732 1212";
        trabajador.salario = 45000;
        
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}