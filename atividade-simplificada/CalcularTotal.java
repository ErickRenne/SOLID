public class CalcularToral{ 
    public double calcular(Pedido pedido)
    double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
    return pedido;
}