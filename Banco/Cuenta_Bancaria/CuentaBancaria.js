"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CuentaBancaria = void 0;
var CuentaBancaria = /** @class */ (function () {
    function CuentaBancaria(titular, numeroCuenta, saldoInicial) {
        if (saldoInicial === void 0) { saldoInicial = 0; }
        this._titular = titular;
        this._numeroCuenta = numeroCuenta;
        this._saldo = saldoInicial;
    }
    Object.defineProperty(CuentaBancaria.prototype, "getSaldo", {
        get: function () {
            return this._saldo;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(CuentaBancaria.prototype, "setSaldo", {
        set: function (nuevoSaldo) {
            if (nuevoSaldo >= 0) {
                this._saldo = nuevoSaldo;
            }
            else {
                console.log("El saldo no puede ser negativo. ");
            }
        },
        enumerable: false,
        configurable: true
    });
    CuentaBancaria.prototype.mostrarDatos = function () {
        console.log("Titular: ", this._titular);
        console.log("Numero de Cuenta: ", this._numeroCuenta);
        console.log("Saldo: ", this._saldo);
    };
    CuentaBancaria.prototype.depositar = function (cantidad) {
        if (cantidad > 0) {
            this._saldo = this._saldo + cantidad;
            console.log("Haz depositado ".concat(cantidad, ", Nuevo Saldo: ").concat(this._saldo));
        }
        else {
            console.log("El deposito debe ser mayor a 0.");
        }
    };
    CuentaBancaria.prototype.retirar = function (cantidad) {
        if (cantidad > 0 && cantidad <= this._saldo) {
            this._saldo = this._saldo - cantidad;
            console.log("Haz retirado ".concat(cantidad, ". Nuevo Saldo: ").concat(this._saldo));
        }
        else {
            console.log("Fondos insuficientes o cantidad invalida");
        }
    };
    CuentaBancaria.prototype.transferir = function (otraCuenta, cantidad) {
        if (cantidad > 0 && cantidad <= this._saldo) {
            this._saldo = this._saldo - cantidad;
            otraCuenta._saldo = otraCuenta._saldo + cantidad;
            console.log("Transferidos ".concat(cantidad, " = ").concat(otraCuenta._titular, ". Nuevo Saldo ").concat(this._saldo));
        }
        else {
            console.log("Fondos insuficientes o cantidad invalida. ");
        }
    };
    return CuentaBancaria;
}());
exports.CuentaBancaria = CuentaBancaria;
