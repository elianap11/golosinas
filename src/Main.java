public class Main {
    public static void main(String[] args) {

        Pedido pedidoMayorista = new Pedido(true);
        Usuario usuario1 = new Usuario("Usuario1");
        Responsable responsable1 = new Responsable("Responsable1");

        System.out.println("# Pedido mayorista:");
        System.out.println("Estado inicial: " + pedidoMayorista.getEstado());

        pedidoMayorista.cambiarEstado(EstadoPedido.PENDIENTE_APROBACION);
        System.out.println("Estado después de enviar a aprobación: " + pedidoMayorista.getEstado());

        responsable1.aprobarPedido(pedidoMayorista);
        System.out.println("Estado después de aprobar el pedido: " + pedidoMayorista.getEstado());

        try {
            pedidoMayorista.cambiarEstado(EstadoPedido.PENDIENTE_APROBACION);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        Pedido pedidoMinorista = new Pedido(false);
        Usuario usuario2 = new Usuario("Usuario2");
        Responsable responsable2 = new Responsable("Responsable2");

        System.out.println("# Pedido minorista:");
        System.out.println("Estado inicial: " + pedidoMinorista.getEstado());

        pedidoMinorista.cambiarEstado(EstadoPedido.PENDIENTE_APROBACION);
        System.out.println("Estado después de enviar a aprobación: " + pedidoMinorista.getEstado());

        responsable2.rechazarPedido(pedidoMinorista);
        System.out.println("Estado después de rechazar el pedido: " + pedidoMinorista.getEstado());

        try {
            pedidoMinorista.cambiarEstado(EstadoPedido.PENDIENTE_APROBACION);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}