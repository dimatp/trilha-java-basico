public class CaixaEletronica {
    public static void main(String[] args) {
        double saldo = 150.0;
        double valorSolicitado = 200.0;

        if (valorSolicitado<saldo){
        saldo = saldo- valorSolicitado;
        System.out.println("Nova Saldo "+saldo);
    } else
        System.out.println("Salo insuficiênte");
    }
}
