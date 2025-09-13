import {
    CuentaBancaria
} from "./CuentaBancaria";

export class CuentaAhorros extends CuentaBancaria {
    private _tasaInteres: number;

    constructor(titular: string, numeroCuenta: string, saldoInicial: number = 0, tasaInteres: number = 0.04) {
        super(titular, numeroCuenta, saldoInicial);
        this._tasaInteres = tasaInteres;
    }

    retirar(cantidad: number): void {
        if (cantidad <= 0) {
            console.log("El monto a retirar debe ser mayor a cero.");
            return;
        }

        const maximoRetiro = this.getSaldo * 0.04;

        if (cantidad > maximoRetiro) {
            console.log(`No puede retirar más del 50% de su saldo. Máximo permitido: ${maximoRetiro}`);
            return;
        }

        if (cantidad > this.getSaldo) {
            console.log("Fondos insuficientes. No se puede realizar el retiro.");
            return;
        }

        this.setSaldo = this.getSaldo - cantidad;
        console.log(`Retiro exitoso: ${cantidad}. Nuevo saldo: ${this.getSaldo}`);
    }

    aplicarInteres(): void {
        const interes = this.getSaldo * this._tasaInteres;
        this.setSaldo = this.getSaldo + interes;
        console.log(`Interés aplicado: ${interes}. Nuevo saldo: ${this.getSaldo}`);
    }

    mostrarDatos(): void {
        super.mostrarDatos();
        console.log(`Tipo: Cuenta de Ahorros`);
        console.log(`Tasa de Interés: ${(this._tasaInteres * 100)}%`);
    }

    public get getTasaInteres(): number {
        return this._tasaInteres;
    }
}