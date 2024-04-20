# Pedidos de golosinas
Un cliente solicita armar una aplicación en la cúal existen usuarios que pueden realizar pedidos para proveer su negocios de golosinas. 
Para realizar un pedido se debe respetar algunos flujos de aprobación. Cada pedido tiene los siguientes estados: Borrador, Pend. Aprobación y Aprobado/Rechazado. 
Para los pedidos, existen determinadas restricciones, el usuario puede iniciar un pedido, siendo su primer estado, el “Borrador”, 
luego al ingresar los datos necesarios pueden enviar a Aprobar la solicitud, quedando en “Pend. Aprobación”. 
Ese pedido le llega a otro usuario, un responsable, y puede aprobarlo o no. Los pedidos pueden ser mayoristas o minoristas.
___
● Crear aplicación Java
___

● Presentar diferentes diagrama para representar la solución: Diagrama de clases y Diagrama representando el proceso de cambio de estado
___

● Crear un método en el cual se compruebe la restricción de flujo del pedido. Ejemplo: Un pedido en estado “Borrador” no puede pasar a un estado “Aprobado”. Y ninguno de los estados, puede volver a un estado anterior.
___

# Diagrama de clases

![golosinas](https://github.com/elianap11/golosinas/assets/39173046/e87945f5-51b9-41d7-be5b-caa3ade266f5)

# Diagrama representando el proceso de cambio de estado

![CambioEstado](https://github.com/elianap11/golosinas/assets/39173046/53d1c161-36aa-4f8c-9546-644bd0574b2a)

