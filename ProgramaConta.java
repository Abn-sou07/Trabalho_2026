

public class ProgramaConta {
    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa XYZ");
        pj.setDataNasc("01/01/2000");
        pj.setCnpj("12.345.678/0001-00");

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(12345);
        cc.setTitular(pj);
        cc.depositar(1000.0);
        cc.setLimite(500);

    if(cc.sacar(1500)){
    System.out.println("Saque realizado com sucesso na conta corrente.");     
    }
    else{
    System.out.println("Saldo insuficiente.");
    }

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Maria");
        pf.setDataNasc("01/01/1990");
        pf.setCpf("123.456.789-00");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(54321);
        cp.setTitular(pf);
        cp.depositar(2000.0);
        cp.setRendimento(0.05);

        if(cp.sacar(2100)){
            System.out.println("Saque realizado com sucesso na conta Poupança.");     
        }
        else{
            System.out.println("Saldo insuficiente.");
        }

//imprimir dados da conta corrente
        System.out.println("-------------------------------");
        System.out.println("Conta Corrente:");
        System.out.println("Número: " + cc.getNumero());
        System.out.println("Titular: " + cc.getTitular().getNome());
        System.out.println("CNPJ:"+ ((PessoaJuridica) cc.getTitular()).getCnpj());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("-------------------------------");

        //imprimir dados da conta poupança
        System.out.println("Conta Poupança:");
        System.out.println("Número: " + cp.getNumero());
        System.out.println("Titular: " + cp.getTitular().getNome());
        System.out.println("CPF: " + ((PessoaFisica) cp.getTitular()).getCpf());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println("-------------------------------");
}
}

