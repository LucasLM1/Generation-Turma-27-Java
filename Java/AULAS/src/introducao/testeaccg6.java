package entidades;

public class ContaPoupanca extends Contag6 {
    private final double aumento = 0.05;
    private int dianiv;
    //private int saldoAtualizado;
    

    public ContaPoupanca(int numero, String nomeCliente, int dianiv) {
       super(numero, nomeCliente);
        this.dianiv = dianiv;
    }

    public int getDianiv() {
        return dianiv;
    }

    public void setDianiv(int dianiv) {
        this.dianiv = dianiv;
    }

    public void aumento(double dianiv) {
        if(dianiv == 25) {
           this.saldo = ((saldo * aumento) + saldo);

            System.out.printf("Parab�ns\n");
            System.out.println("Seu Saldo foi aumentado em 0.05%");
            System.out.printf("Portanto seu saldo ficou em R$%.2f",saldo);
            
            
        }
        else {
        System.out.println("Sua conta infelizmente n�o foi premiada com o aumento...");
        }
    }

    //@Override
    public void credito(double valorcred) {
    	if(valorcred <= 0) {
            System.out.println("Por favor digite um valor v�lido");
            System.out.print("\n");
    	}else {
    		this.saldo = saldo + valorcred;
            System.out.printf("Opera��o realizada com sucesso, novo saldo: R$"+saldo);
        }
    }
    //@Override
    public void debito(double valor) {
        if(valor >= 0) {
            System.out.println("Valor para deposito insuficiente, tente novamente!");
        }else {
            this.saldo = this.saldo - valor ;

            System.out.printf("Opera��o realizada com sucesso..");
        }
    }
}
  