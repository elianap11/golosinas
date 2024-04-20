
public class Pedido {

        private EstadoPedido estado;
        private boolean esMayorista;

        public Pedido(boolean esMayorista) {
            this.estado = EstadoPedido.BORRADOR;
            this.esMayorista = esMayorista;
        }

        public EstadoPedido getEstado() {
            return estado;
        }

        public void cambiarEstado(EstadoPedido nuevoEstado) {
            switch (estado) {
                case BORRADOR:
                    if (nuevoEstado == EstadoPedido.PENDIENTE_APROBACION) {
                        estado = nuevoEstado;
                    } else {
                        throw new IllegalStateException("Un pedido en estado BORRADOR solo puede pasar a PENDIENTE_APROBACION");
                    }
                    break;
                case PENDIENTE_APROBACION:
                    if (nuevoEstado == EstadoPedido.APROBADO || nuevoEstado == EstadoPedido.RECHAZADO) {
                        estado = nuevoEstado;
                    } else {
                        throw new IllegalStateException("Un pedido en estado PENDIENTE_APROBACION solo puede pasar a APROBADO o RECHAZADO");
                    }
                    break;
                case APROBADO:
                case RECHAZADO:
                    throw new IllegalStateException("Un pedido en estado " + estado + " no puede cambiar de estado");
                default:
                    throw new IllegalStateException("Estado de pedido no válido");
            }
        }
    }