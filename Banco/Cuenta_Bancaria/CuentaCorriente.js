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
exports.CuentaCorriente = void 0;
var CuentaBancaria_1 = require("./CuentaBancaria");
var CuentaCorriente = /** @class */ (function (_super) {
    __extends(CuentaCorriente, _super);
    function CuentaCorriente(titular, numeroCuenta, saldoInicial, limiteSobregiro) {
        if (saldoInicial === void 0) { saldoInicial = 0; }
        if (limiteSobregiro === void 0) { limiteSobregiro = 500; }
        var _this = _super.call(this, titular, numeroCuenta, saldoInicial) || this;
        _this._limiteSobregiro = limiteSobregiro;
        return _this;
    }
    CuentaCorriente.prototype.retirar = function (cantidad) {
        if (cantidad <= 0) {
            console.log("El monto a retirar debe ser mayor a cero.");
            return;
        }
        var saldoDisponible = this.getSaldo + this._limiteSobregiro;
        if (cantidad > saldoDisponible) {
            console.log("Fondos insuficientes. L\u00EDmite de sobregiro alcanzado. M\u00E1ximo disponible: ".concat(saldoDisponible.toFixed(2)));
            return;
        }
        this.setSaldo = this.getSaldo - cantidad;
        console.log("Retiro exitoso: ".concat(cantidad, ". Nuevo saldo: ").concat(this.getSaldo));
    };
    CuentaCorriente.prototype.mostrarDatos = function () {
        _super.prototype.mostrarDatos.call(this);
        console.log("Tipo: Cuenta Corriente");
        console.log("L\u00EDmite de Sobregiro: ".concat(this._limiteSobregiro));
        console.log("Saldo Disponible: ".concat((this.getSaldo + this._limiteSobregiro)));
    };
    Object.defineProperty(CuentaCorriente.prototype, "getLimiteSobregiro", {
        get: function () {
            return this._limiteSobregiro;
        },
        enumerable: false,
        configurable: true
    });
    return CuentaCorriente;
}(CuentaBancaria_1.CuentaBancaria));
exports.CuentaCorriente = CuentaCorriente;
