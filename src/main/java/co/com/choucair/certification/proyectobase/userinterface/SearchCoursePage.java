package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selects the universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search for the course").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Click to selects the course").located(By.xpath("//h4[contains(tex(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Click to selects the course").located(By.xpath("//h1[contains(tex(),'Recursos Automatización Bancolombia')]"));

}
