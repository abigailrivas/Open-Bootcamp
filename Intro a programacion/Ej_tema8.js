class Persona{
    #edad;
    #nombre;
    #telefono;

    get edad(){
        return this.#edad;
    }

    set edad(edad){
        this.#edad = edad;
    }

    get nombre(){
        return this.#nombre;
    }

    set nombre(nombre){
        this.#nombre = nombre;
    }

    get telefono(){
        return this.#telefono;
    }

    set telefono(telefono){
        this.#telefono = telefono;
    }
}

const persona = new Persona();
persona.nombre = "Abigail";
persona.edad = 29;
persona.telefono = "11 2200 1993";

console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.telefono);