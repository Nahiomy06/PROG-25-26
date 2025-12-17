public class CuentaBancaria {

    public boolean InfoCuentaBancaria;
    private String IBAN;
    private String Titular;
    private double Saldo;

    private Movimiento [] movimientos;

    private int ContaorMovimientos;



    public CuentaBancaria (String IBAN, String Titular){
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0.0;
        this.movimientos = new Movimiento[100];
        this.ContaorMovimientos = 0;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return Saldo;
    }




    public boolean Ingresar(double valor){
        boolean retorno = false;
        double ValorAbsoluto = Math.abs(valor);
        this.Saldo += ValorAbsoluto;
        retorno =true;

        this.generarMovimientos(Tipo.Ingreso, ValorAbsoluto);

        return retorno;
    }

    public boolean Retirar(double valor) {
        boolean retorno = false;
        double ValorAbsoluto = Math.abs(valor);

        if ((this.Saldo - ValorAbsoluto) > -50){
            this.Saldo -= ValorAbsoluto;
            this.generarMovimientos(Tipo.Retirada, ValorAbsoluto);
            retorno = true;
        }
        return retorno;

    }

    public void generarMovimientos(Tipo tipo, double Cantidad) {

        if (this.ContaorMovimientos < this.movimientos.length){
            this.movimientos[this.ContaorMovimientos] = new Movimiento(tipo, Cantidad);
        }
        else if (this.ContaorMovimientos >= this.movimientos.length){
            this.AmplificarDimMovimientos();
            this.movimientos[this.ContaorMovimientos] = new Movimiento(tipo, Cantidad);
        }
        this.ContaorMovimientos++;

    }

    public void AmplificarDimMovimientos(){
        Movimiento[] movimientosA = new Movimiento[this.movimientos.length + 10];
        for (int i = 0; i < movimientos.length; i++) {
            movimientosA[i] = this.movimientos[i];
            
        }
        this.movimientos = movimientosA;

    }


    public String InfoCuentaBancaria() {

        String info = "";
        info += "Iban: " + this.IBAN + "\n";
        info += "Titular: " + this.Titular +"\n";
        info += "Saldo: " + this.Saldo +"\n";
        return info;

    }

    public String InfoMovimientos() {
        String info = "";
        if (ContaorMovimientos > 0){
            for (int i = 0; i < this.ContaorMovimientos; i++) {
                info += this.movimientos[i].MostrarInfoMovimientos() + "\n";
            }

        } else {
            info = "No hay movimientos";
        }
        return info;
    }



}
