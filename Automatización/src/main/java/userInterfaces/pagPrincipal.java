package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class pagPrincipal extends PageObject
{
    public static final Target inputBuscar = Target.the("Input de búsqueda").located(By.id("search_query_top"));
    public static final Target cambiarVista = Target.the("Cambiar vista").locatedBy("//a[starts-with(@title,'List')]");
    public static final Target selPrenda = Target.the("Agregar al carrito").locatedBy("//a[starts-with(@title,'Add to cart')]");
    public static final Target contCompra = Target.the("Continuar al carrito").locatedBy("//a[starts-with(@title,'Proceed')]");
    public static final Target sec03 = Target.the("Pasar a la sección 03").locatedBy("//a[starts-with(@class,'button btn btn-default standard-checkout button-medium')]");
    public static final Target inputEmail = Target.the("Input de email").located(By.id("email"));
    public static final Target inputPasswd = Target.the("Input de contraseña").located(By.id("passwd"));
    public static final Target btnSesión = Target.the("Botón iniciar sesión").located(By.id("SubmitLogin"));public static final Target sec04 = Target.the("Pasar a la sección 04").locatedBy("//button[starts-with(@name,'processAddress')]");
    public static final Target checkTyC = Target.the("Check de terminos y condiciones").located(By.id("cgv"));
    public static final Target sec05 = Target.the("Pasar a la sección 05").locatedBy("//button[starts-with(@class,'button btn btn-default standard-checkout button-medium')]");
    public static final Target selPago = Target.the("Seleccionar medio de pago").locatedBy("//a[starts-with(@title,'Pay by bank')]");
    public static final Target confPedido = Target.the("Confirmar Pedido").locatedBy("//button[starts-with(@class,'button btn btn-default button-medium')]");
    public static final Target tablaPedidos = Target.the("Ir a la tabla de pedidos").locatedBy("//a[starts-with(@title,'Back to')]");
}
