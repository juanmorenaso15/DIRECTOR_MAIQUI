import { CuentaBancaria } from "./CuentaBancaria";
import { CuentaAhorros } from "./CuentaAhorros";
import { CuentaCorriente } from "./CuentaCorriente";

console.log("=== CREACIÓN DE CUENTAS ===");
const cuenta1 = new CuentaBancaria("Thomas David", "001-123456", 1000);
const cuentaAhorros = new CuentaAhorros("Jeremy Esteban", "002-789012", 2000, 0.04);
const cuentaCorriente = new CuentaCorriente("Kristopher Marttyn", "003-345678", 500, 1000);

console.log("\n DATOS INICIALES ");
cuenta1.mostrarDatos();
console.log("----------------------");
cuentaAhorros.mostrarDatos();
console.log("----------------------");
cuentaCorriente.mostrarDatos();

console.log("\n OPERACIONES CUENTA BÁSICA ");
cuenta1.depositar(500);
cuenta1.retirar(200);
cuenta1.retirar(2000); 

console.log("\n OPERACIONES CUENTA AHORROS ");
cuentaAhorros.depositar(1000);
cuentaAhorros.retirar(800);
cuentaAhorros.retirar(1500); 
cuentaAhorros.aplicarInteres();
cuentaAhorros.mostrarDatos();

console.log("\n OPERACIONES CUENTA CORRIENTE ");
cuentaCorriente.depositar(300);
cuentaCorriente.retirar(600);
cuentaCorriente.retirar(1200);
cuentaCorriente.retirar(500); 
cuentaCorriente.mostrarDatos();

console.log("\n TRANSFERENCIAS ");
console.log("Transferencia de cuenta básica a cuenta de ahorros:");
cuenta1.transferir(cuentaAhorros, 300);
cuenta1.mostrarDatos();
cuentaAhorros.mostrarDatos();

console.log("\nTransferencia de cuenta corriente a cuenta básica:");
cuentaCorriente.transferir(cuenta1, 200); 
cuentaCorriente.depositar(500); 
cuentaCorriente.transferir(cuenta1, 200); 

console.log("\n ESTADO FINAL DE LAS CUENTAS ");
cuenta1.mostrarDatos();
console.log("----------------------");
cuentaAhorros.mostrarDatos();
console.log("----------------------");
cuentaCorriente.mostrarDatos();

console.log("\n INFORMACIÓN ADICIONAL ");
console.log(`Tasa de interés cuenta ahorros: ${(cuentaAhorros.getTasaInteres * 1)}%`);
console.log(`Límite de sobregiro cuenta corriente: $${cuentaCorriente.getLimiteSobregiro}`);

console.log("\n OPERACIONES COMPLETADAS ");

