export class CuentaBancaria {
    private _titular: string;
    private _numeroCuenta: string;
    private _saldo: number;

    constructor(titular: string, numeroCuenta: string, saldoInicial: number = 0) {
        this._titular = titular;
        this._numeroCuenta = numeroCuenta;
        this._saldo = saldoInicial;
    }

    public get getSaldo(): number {
        return this._saldo
    } 

    public set setSaldo(nuevoSaldo: number) {
        if (nuevoSaldo >= 0) {
            this._saldo = nuevoSaldo;
        } else {
            console.log("El saldo no puede ser negativo. ");
            
        }
    }

    mostrarDatos(): void {
        console.log("Titular: ", this._titular);
        console.log("Numero de Cuenta: ", this._numeroCuenta);
        console.log("Saldo: ", this._saldo);
    }

    depositar(cantidad: number): void {
        if (cantidad > 0) {
            this._saldo = this._saldo + cantidad;
            console.log(`Haz depositado ${cantidad}, Nuevo Saldo: ${this._saldo}`);
        } else {
            console.log("El deposito debe ser mayor a 0.");
        }
    }

    retirar(cantidad: number): void {
        if (cantidad > 0 && cantidad <= this._saldo) {
            this._saldo = this._saldo - cantidad;
            console.log(`Haz retirado ${cantidad}. Nuevo Saldo: ${this._saldo}`);
        } else {
            console.log("Fondos insuficientes o cantidad invalida");
        }
    }

    transferir(otraCuenta: CuentaBancaria, cantidad: number): void {
        if (cantidad > 0 && cantidad <= this._saldo) {
            this._saldo = this._saldo - cantidad; otraCuenta._saldo = otraCuenta._saldo + cantidad;
            console.log(`Transferidos ${cantidad} = ${otraCuenta._titular}. Nuevo Saldo ${this._saldo}`);
        } else {
            console.log("Fondos insuficientes o cantidad invalida. ");
        }
    }
}