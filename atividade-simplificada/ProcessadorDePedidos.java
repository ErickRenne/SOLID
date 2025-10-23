/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    CalcularToral calculo  = new CalcularToral();
    ProcessadorPagamento pagamento = new ProcessadorPagamento();
    Banco banco = new Banco();
    Email email = new Email();
    public void processar(Pedido pedido) {
        calculo.calcular(pedido);        
        pagamento.pagamento(pedido)
        banco.salvar(pedido);   
        email.enviar("bla bla bla");
    }
}