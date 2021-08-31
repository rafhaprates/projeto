package io.cucumber.rafhael;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Dado;


public class ConsultaSampleAppSteps {
    public ConsultaSampleAppSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver(); 
    }    
    public WebDriver browser;
    
    @Dado("que eu estou no site {string}")
public void que_eu_estou_no_site(String string) {
    browser.get(string);
}

@Dado("clico na opcao Make")
public void clico_na_opcao_Make() {
    WebElement input = browser.findElement( By.cssSelector("#make"));
    input.click();
}

@Entao("seleciono a opcao Audi")
public void seleciono_a_opcao_Audi() {
    WebElement input = browser.findElement( By.cssSelector("option[value='Audi']"));
    input.click();
    }

    @Dado("clico na opcao Model")
    public void clico_na_opcao_Model() {
        WebElement input = browser.findElement( By.cssSelector("#make"));
        input.click();
    }
    
    @Entao("seleciono a opcao Scooter")
    public void seleciono_a_opcao_Scooter() {
        WebElement input = browser.findElement( By.cssSelector("option[value='Scooter']"));
        input.click();
    }

    @Entao("digito no campo Cylinder Capacity {string}")
    public void clico_na_opcao_Cylinder_Capacity(String string) {
        WebElement input = browser.findElement( By.cssSelector("#cylindercapacity"));
        input.sendKeys(string);
    
}
    @Entao("digito no campo Engine Performance {string}")
    public void clico_na_opcao_Engine_Performance(String string) {
        WebElement input = browser.findElement( By.cssSelector("#engineperformance"));
        input.sendKeys(string);

}

@Entao("digito no campo Date of Manufacture {string}")
public void clico_na_opcao_Date_of_Manufacture(String string) {
    WebElement input = browser.findElement( By.cssSelector("#dateofmanufacture"));
    input.sendKeys(string);

}
@Entao("clico na opcao Number of Seats")
public void clico_na_opcao_Number_of_Seats() {
    WebElement input = browser.findElement( By.cssSelector("#numberofseats"));
    input.click();
}

@Entao("seleciono a opcao dois")
public void seleciono_a_opcao_dois() {
    WebElement input = browser.findElement( By.cssSelector("option[value='2']"));
    input.click();

}
@Entao("seleciono na campo Right Hand Drive a opcao Yes")
public void seleciono_na_campo_Right_Hand_Drive_a_opcao_Yes() {
    WebElement input = browser.findElement( By.cssSelector(".ideal-radiocheck-label"));
    input.click();
}



@Entao("clico no campo Number of Seat")
public void clico_no_campo_Number_of_Seat() {
    WebElement input = browser.findElement( By.cssSelector("#numberofseatsmotorcycle"));
    
}

@Entao("seleciono a opcao um {string}")
public void seleciono_a_opcao_um(String string) {
        WebElement input = browser.findElement( By.cssSelector("#numberofseatsmotorcycle"));
        input.sendKeys(string);
}

@Entao("clico no campo Fuel Type")
public void clico_no_campo_Fuel_Type() {
    WebElement input = browser.findElement( By.cssSelector("#fuel"));
    input.click();
}

@Entao("seleciono a opcao Petrol")
public void seleciono_a_opcao_Petrol() {
    WebElement input = browser.findElement( By.cssSelector("option[value='Petrol']"));
        input.click();
}

@Entao("digito no campo Payload {string}")
public void digito_no_campo_Payload(String string) {
    WebElement input = browser.findElement( By.cssSelector("#payload"));
    input.sendKeys(string);
}


@Entao("digito no campo Total Weight {string}")
public void digito_no_campo_Total_Weight(String string) {
    WebElement input = browser.findElement( By.cssSelector("#totalweight"));
    input.sendKeys(string);
}

@Entao("digito no campo List Price {string}")
public void digito_no_campo_List_Price(String string) {
    WebElement input = browser.findElement( By.cssSelector("#listprice"));
    input.sendKeys(string);
}


@Entao("digito no campo License Plate Number {string}")
public void digito_no_campo_License_Plate_Number(String string) {
    WebElement input = browser.findElement( By.cssSelector("#licenseplatenumber"));
    input.sendKeys(string);
}


@Entao("digito no campo Annual Mileage {string}")
public void digito_no_campo_Annual_Mileage(String string) {
    WebElement input = browser.findElement( By.cssSelector("#annualmileage"));
    input.sendKeys(string);
}


@Entao("clico em Insurant")
public void clico_em_Insurant() {
    WebElement input = browser.findElement( By.cssSelector("#enterinsurantdata"));
    input.click();
}






@Entao("digito no campo First Name o nome {string}")
public void digito_no_campo_First_Name_o_nome(String string) {
    WebElement input = browser.findElement( By.cssSelector("#firstname"));
    input.sendKeys(string);
}

@Entao("digito  no campo Last Name o sobrenome {string}")
public void digito_no_campo_Last_Name_o_sobrenome(String string) {
    WebElement input = browser.findElement( By.cssSelector("#lastname"));
    input.sendKeys(string);
}

@Entao("digito no campo Date of Birth a data {string}")
public void digito_no_campo_Date_of_Birth_a_data(String string) {
    WebElement input = browser.findElement( By.cssSelector("#birthdate"));
    input.sendKeys(string);
}

@Entao("clico no campo Country")
public void clico_no_campo_Country() {
    WebElement input = browser.findElement( By.cssSelector("#country"));
    input.click();
}

@Entao("seleciono a opcao Brazil")
public void seleciono_a_opcao_Brazil() {
    WebElement input = browser.findElement( By.cssSelector("option[value='Brazil']"));
    input.click();
}

@Entao("digito no campo Zip Code {string}")
public void digito_no_campo_Zip_Code(String string) {
    WebElement input = browser.findElement( By.cssSelector("#zipcode"));
    input.sendKeys(string);
}

@Entao("clico no campo Occupation")
public void clico_no_campo_Occupation() {
    WebElement input = browser.findElement( By.cssSelector("#occupation"));
    input.click();
}

@Entao("seleciono a opcao Employee")
public void seleciono_a_opcao_Employee() {
    WebElement input = browser.findElement( By.cssSelector("option[value='Employee']"));
    input.click();
}

@Entao("clico no campo Hobbies")
public void clico_no_campo_Hobbies() {
    WebElement input = browser.findElement( By.cssSelector(".ideal-check"));
    input.click();
  
}

@Entao("clico em Product")
public void clico_em_Product() {
    WebElement input = browser.findElement( By.cssSelector("#enterproductdata"));
    input.click();
}





@Entao("digito no campo Start Date {string}")
public void digito_no_campo_Start_Date(String string) {
    WebElement input = browser.findElement( By.cssSelector("#startdate"));
    input.sendKeys(string);
}

@Entao("seleciono no campo Insurance Sum {string}")
public void seleciono_no_campo_Insurance_Sum(String string) {
    WebElement input = browser.findElement( By.cssSelector("#insurancesum"));
    input.sendKeys(string);
}

@Entao("seleciono no campo Merit Rating {string}")
public void seleciono_no_campo_Merit_Rating(String string) {
    WebElement input = browser.findElement( By.cssSelector("#meritrating"));
    input.sendKeys(string);
}

@Entao("seleciono no campo Damage Insurance {string}")
public void seleciono_no_campo_Damage_Insurance(String string) {
    WebElement input = browser.findElement( By.cssSelector("#damageinsurance"));
    input.sendKeys(string);
}

@Entao("seleciono no campo Optional Products a opcao Euro Protection")
public void seleciono_no_campo_Optional_Products_a_opcao_Euro_Protection() {
    WebElement input = browser.findElement( By.cssSelector("div.field.idealforms-field.idealforms-field-checkbox"));
    input.click();
    
}

@Entao("seleciono no campo Cortesy Car {string}")
public void seleciono_no_campo_Cortesy_Car(String string) {
    WebElement input = browser.findElement( By.cssSelector("#courtesycar"));
    input.sendKeys(string);
}

@Entao("clico em Price")
public void clico_em_Price() {
    WebElement input = browser.findElement( By.cssSelector("#selectpriceoption"));
    input.click();
}

}