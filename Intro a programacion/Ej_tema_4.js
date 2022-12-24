// ===== IF ======= 

let numeroIf = 4;

if (numeroIf > 0){
    console.log("Este número es positivo");
} else if (numeroIf = 0){
    console.log("Este número es el 0");
} else {
    console.log("Este número es negativo");
}


// ===== WHILE ======= 
let numeroWhile = 0;
while(numeroWhile < 3){
    numeroWhile++;
    console.log(numeroWhile);
}


// ===== DO WHILE ======= 
let numeroDo = 0;
do {
    numeroDo++;
    console.log(numeroDo);
} while (numeroDo < numeroDo);


// ===== FOR ======= 
for (let numeroFor = 0; numeroFor < 4; numeroFor++) {
    console.log(numeroFor);
}


// ===== SWITCH ======= 
let estacion = "Verano";
switch (estacion) {
    case "Verano":
        console.log("Es Verano");
        break;
    
    case "Invierno":
        console.log("Es Invierno");
        break;

    case "Otoño":
        console.log("Es Otoño");
        break;

    case "Primavera":
    console.log("Es Primavera");
    break;

    default:
        console.log("No es una estación");
        break;
}