package stepDefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.comprarProducto;
import userInterfaces.pagPrincipal;

import java.util.List;

public class compraPrendasSD
{

    @Managed(driver = "chrome") //Declaramos el navegador a utilizar
    private WebDriver nav; //Declaramos una variable tipo WebDriver
    private Actor actor = Actor.named("Cliente"); //Declaramos una variable tipo Actor
    private pagPrincipal pPrincipal = new pagPrincipal();

    @Dado("^que un cliente ya registrado desea comprar prendas de vestir$")
    public void queUnClienteYaRegistradoDeseaComprarPrendasDeVestir()
    {
        actor.can(BrowseTheWeb.with(nav)); //Indicamos que el actor puede abrir el navegador
        nav.manage().window().maximize();
        actor.wasAbleTo(Open.browserOn(pPrincipal)); //Indicamos a que url acceder cuando se abra el navegador
    }

    @Cuando("^el ingrese a la tienda y adicione la cantidad de (.*) (.*) al carrito de compras$")
    public void elIngreseALaTiendaYAdicionePrendasAlCarritoDeCompras(String cantidad, String descripcion )
    {
        actor.wasAbleTo
        (
                comprarProducto.conDescripcion(descripcion)
        );
    }

    @Entonces("^el vera la lista de prendas seleccionadas en el carrito de compras$")
    public void elVeraLaListaDePrendasSeleccionadasEnElCarritoDeCompras()
    {

    }

    @Dado("^que un nuevo cliente ingresa a la tienda virtual$")
    public void queUnNuevoClienteIngresaALaTiendaVirtual(List<String> datos)
    {

    }

    @Cuando("^él agrega prendas de vestir al carro$")
    public void élAgregaPrendasDeVestirAlCarro()
    {

    }

    @Entonces("^él ve la lista de prendas de vestir seleccionadas$")
    public void élVeLaListaDePrendasDeVestirSeleccionadas()
    {

    }
}
