package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.pagPrincipal.*;

public class comprarProducto implements Task{

    private String desc;
    public comprarProducto(String desc)
    {
        this.desc = desc;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
        (
                Enter.theValue(desc).into(inputBuscar), // Diligenciar el campo de búsqueda
                Hit.the(Keys.ENTER).into(inputBuscar), // Presionar tecla enter
                Click.on(cambiarVista), // Pone los productos en lista
                Click.on(selPrenda), // Agrega la prenda al carrito
                Click.on(contCompra), // Continuar con la compra
                Click.on(sec03), // Se da clic en el botón para avanzar de sección
                Enter.theValue("bayronfelipe6@gmail.com").into(inputEmail), // Diligenciar el campo email
                Enter.theValue("qwerty").into(inputPasswd), // Diligenciar el campo contraseña
                Click.on(btnSesión), // iniciar sesión
                Click.on(sec04), // Se da clic en el botón para avanzar de sección
                Click.on(checkTyC), // Se da clic en el check de terminos y condiciones
                Click.on(sec05), // Se da clic en el botón para avanzar de sección
                Click.on(selPago), // Se selecciona el método de pago
                Click.on(confPedido), // Se confirma el pedido
                Click.on(tablaPedidos) // Se ingresa al historico de pedidos
        );
    }

    public static comprarProducto conDescripcion(String descripcion)
    {
        return instrumented(comprarProducto.class, descripcion);
    }

}
