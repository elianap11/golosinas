public class Responsable extends Usuario {

    public Responsable(String nombre) {
        super(nombre);
    }

    public void aprobarPedido(Pedido pedido) {
        pedido.cambiarEstado(EstadoPedido.APROBADO);
        System.out.println("Pedido aprobado por " + getNombre());
    }

    public void rechazarPedido(Pedido pedido) {
        pedido.cambiarEstado(EstadoPedido.RECHAZADO);
        System.out.println("Pedido rechazado por " + getNombre());
    }
}