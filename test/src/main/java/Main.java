import BLL.ClienteBLL;
import entity.Cliente;

public class Main {

    public static void main(String args[]) {

        Cliente cli = ClienteBLL.findCliente(10);
        System.out.println(cli.getNome());

    }
}

