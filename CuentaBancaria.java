class CuentaBancaria{
    private String titular;
    private double saldo;


    public CuentaBancaria(String titular, double saldo){

        this.titular = titular;
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            this.saldo = 0.0;
        }
    }

    public void  depositar(double monto){
        if(monto > 0){
            this.saldo += monto;
        }

    }
    public void retirar(double monto){
        if(monto > 0 && this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Estraxion exitosa");

        }else{
            System.out.println("error al retirar");
        }

    }
    public void mostrarDatos(){
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: "+ saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Illanes Jorge", 1000);
        cuenta1.mostrarDatos();
        cuenta1.retirar(500);
        cuenta1.mostrarDatos();
        
    }



    
}