"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.CuentaAhorros = void 0;
var CuentaBancaria_1 = require("./CuentaBancaria");
var CuentaAhorros = /** @class */ (function (_super) {
    __extends(CuentaAhorros, _super);
    function CuentaAhorros(titular, numeroCuenta, saldoInicial, tasaInteres) {
        if (saldoInicial === void 0) { saldoInicial = 0; }
        if (tasaInteres === void 0) { tasaInteres = 0.04; }
        var _this = _super.call(this, titular, numeroCuenta, saldoInicial) || this;
        _this._tasaInteres = tasaInteres;
        return _this;
    }
    CuentaAhorros.prototype.retirar = function (cantidad) {
        if (cantidad <= 0) {
            console.log("El monto a retirar debe ser mayor a cero.");
            return;
        }
        var maximoRetiro = this.getSaldo * 0.04;
        if (cantidad > maximoRetiro) {
            console.log("No puede retirar m\u00E1s del 50% de su saldo. M\u00E1ximo permitido: ".concat(maximoRetiro));
            return;
        }
        if (cantidad > this.getSaldo) {
            console.log("Fondos insuficientes. No se puede realizar el retiro.");
            return;
        }
        this.setSaldo = this.getSaldo - cantidad;
        console.log("Retiro exitoso: ".concat(cantidad, ". Nuevo saldo: ").concat(this.getSaldo));
    };
    CuentaAhorros.prototype.aplicarInteres = function () {
        var interes = this.getSaldo * this._tasaInteres;
        this.setSaldo = this.getSaldo + interes;
        console.log("Inter\u00E9s aplicado: ".concat(interes, ". Nuevo saldo: ").concat(this.getSaldo));
    };
    CuentaAhorros.prototype.mostrarDatos = function () {
        _super.prototype.mostrarDatos.call(this);
        console.log("Tipo: Cuenta de Ahorros");
        console.log("Tasa de Inter\u00E9s: ".concat((this._tasaInteres * 100), "%"));
    };
    Object.defineProperty(CuentaAhorros.prototype, "getTasaInteres", {
        get: function () {
            return this._tasaInteres;
        },
        enumerable: false,
        configurable: true
    });
    return CuentaAhorros;
}(CuentaBancaria_1.CuentaBancaria));
exports.CuentaAhorros = CuentaAhorros;
