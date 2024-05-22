import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientesList;

    public Banco() {
        this.clientesList = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientesList.add(cliente);
    }

    public int totalDeClientes() {
        return clientesList.size();
    }
}