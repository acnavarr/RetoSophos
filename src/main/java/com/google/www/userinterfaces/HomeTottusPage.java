package com.google.www.userinterfaces;


        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.screenplay.targets.Target;
        import net.thucydides.core.annotations.DefaultUrl;
        import org.openqa.selenium.By;

@DefaultUrl( "https://www.tottus.com.pe/tottus/" )

public class HomeTottusPage extends PageObject {

    public static final Target LBL_BUSCAR = Target.the( "Label para buscar productos" ).located( By.id( "atg_store_searchInput_top" ) );
    public static final Target BTN_BUSCAR = Target.the("Boton buscar").located(By.id("atg_store_searchSubmit_top"));
    public static final Target LIST_PRODUCTOS = Target.the("Lista de productos").located(By.xpath("//*[@class='title']"));
    public static final Target BTN_AGREGAR = Target.the("Boton agregar productos").located(By.xpath("//*[contains(@id,'atg_behavior_addItemToCart')]"));
    public static final Target LIST_CARRITO = Target.the("Productos en el carrito").located(By.xpath("//*[contains(@class,'atg_store_richCartItemDescription')]"));






}
