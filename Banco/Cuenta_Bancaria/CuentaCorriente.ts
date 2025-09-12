import { CuentaBancaria } from "./CuentaBancaria";

export class CuentaCorriente extends CuentaBancaria {
    private _limiteSobregiro: number;

    constructor(titular: string, numeroCuenta: string, saldoInicial: number = 0, limiteSobregiro: number = 500) {
        super(titular, numeroCuenta, saldoInicial);
        this._limiteSobregiro = limiteSobregiro;
    }

    retirar(cantidad: number): void {
        if (cantidad <= 0) {
            console.log("El monto a retirar debe ser mayor a cero.");
            return;
        }

        const saldoDisponible = this.getSaldo + this._limiteSobregiro;
        
        if (cantidad > saldoDisponible) {
            console.log(`Fondos insuficientes. Límite de sobregiro alcanzado. Máximo disponible: ${saldoDisponible.toFixed(2)}`);
            return;
        }

        this.setSaldo = this.getSaldo - cantidad;
        console.log(`Retiro exitoso: ${cantidad}. Nuevo saldo: ${this.getSaldo}`);
    }

    mostrarDatos(): void {
        super.mostrarDatos();
        console.log(`Tipo: Cuenta Corriente`);
        console.log(`Límite de Sobregiro: ${this._limiteSobregiro}`);
        console.log(`Saldo Disponible: ${(this.getSaldo + this._limiteSobregiro)}`);
    }

    public get getLimiteSobregiro(): number {
        return this._limiteSobregiro;
    }
}