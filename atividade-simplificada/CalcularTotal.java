public class CalcularToral extends item{ 
    double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
}