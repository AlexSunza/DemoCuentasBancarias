/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alex
 */
public class CuentaBasica {
    
    private int NumeroDeCuenta; 
    private String Cliente = null;
    private double Saldo;
    private double Cantidad;
    private double Retiro;


    
    
    public CuentaBasica (int NumeroDeCuenta, String Cliente,int Saldo)
    {
        this.NumeroDeCuenta = 1;
        this.Cliente = " ALEX SUNZA ";
        this.Saldo = Saldo = 0;
    }

   

    public double getSaldo()
    {
        return this.Saldo;
    }
public double depositar(double Deposito)
    {
        this.Cantidad = Deposito;
        Saldo = Saldo + Cantidad;
        return Saldo;
    }
        public boolean retirar (double Retirar)
    {
        boolean xSaldo=true;
        this.Retiro = Retirar;
        if(Retiro <= Saldo)
        {
            Saldo = Saldo - Retiro;
            xSaldo=true;
        }
        else
        {
            if (Retiro > Saldo)
            {
                xSaldo=false;
            }
 
        }
        return xSaldo;

    }
    
}
