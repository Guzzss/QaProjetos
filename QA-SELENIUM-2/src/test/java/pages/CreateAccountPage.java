package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CreateAccountPage {

    AccountPage accountPage = new AccountPage();
    public static final By mrBtn = By.cssSelector("#id_gender1");
    public static final By mrsBtn = By.cssSelector("#id_gender2");
    public static final By firstName = By.cssSelector("#customer_firstname");
    public static final By lastName = By.cssSelector("#customer_lastname");
    public static final By email = By.cssSelector("#email");
    public static final By password = By.cssSelector("#passwd");

    public static final By days = By.cssSelector("#days");
    public static final By daySelected = By.cssSelector("select[id='days'] option[value='1']");

    public static final By months = By.cssSelector("#months");
    public static final By monthsSelected = By.cssSelector("select[id='months'] option[value='1']");

    public static final By years = By.cssSelector("#years");
    public static final By yearsSelected = By.cssSelector("option[value='2003']");

    public static final By newsletter = By.cssSelector("#newsletter");
    public static final By optin = By.cssSelector("#optin");
    public static final By firstnameAddress = By.cssSelector("#firstname");
    public static final By lastnameAddres = By.cssSelector("#lastname");
    public static final By company = By.cssSelector("#company");
    public static final By address1 = By.cssSelector("#address1");
    public static final By address2 = By.cssSelector("#address2");
    public static final By city = By.cssSelector("#city");
    public static final By state = By.cssSelector("#id_state");
    public static final By stateSelected = By.cssSelector("select[id='id_state'] option[value='1']");
    public static final By postcode = By.cssSelector("#postcode");
    public static final By id_country = By.cssSelector("#id_country");
    public static final By id_countrySelected = By.cssSelector("option[selected='selected']");

    public static final By other = By.cssSelector("#other");
    public static final By phone = By.cssSelector("#phone");
    public static final By phone_mobile = By.cssSelector("#phone_mobile");
    public static final By alias = By.cssSelector("#alias");
    public static final By submitAccount = By.cssSelector("#submitAccount");

    public void clicarNoMrBtn() {
        BaseTest.click(mrBtn);
    }

    public void clicarNoMrsBtn() {
        BaseTest.click(mrsBtn);
    }

    public void firsName() {
        BaseTest.sendKeys(firstName, "Gustavo");
    }

    public void lastName() {
        BaseTest.sendKeys(lastName, "Teichmann");
    }

    public void email() {
        BaseTest.sendKeys(email, "gustavooo_teichmann@outlook.com");
    }

    public void password() {
        BaseTest.sendKeys(password, "gustavo123");
    }

    public void days() {
        BaseTest.click(days);
        BaseTest.click(daySelected);
    }

    public void months() {
        BaseTest.click(months);
        BaseTest.click(monthsSelected);
    }

    public void years() {
        BaseTest.click(years);
        BaseTest.click(yearsSelected);
    }

    public void newsletter() {
        BaseTest.click(newsletter);
    }

    public void optin() {
        BaseTest.click(optin);
    }

    public void firstnameAddress() {
        BaseTest.clear(firstnameAddress);
        BaseTest.sendKeys(firstnameAddress, "minha casa");
    }

    public void lastnameAddres() {
        BaseTest.clear(lastnameAddres);
        BaseTest.sendKeys(lastnameAddres, "meu quarto");
    }

    public void company() {
        BaseTest.sendKeys(company, "DBC");
    }

    public void addrees() {
        BaseTest.sendKeys(address1, "Casa");
    }

    public void addrees2() {
        BaseTest.sendKeys(address2, "Casa2");
    }
    public void city() {
        BaseTest.sendKeys(city, "Gravataí");
    }

    public void state() {
        BaseTest.click(state);
        BaseTest.click(stateSelected);
    }

    public void postCode() {
        BaseTest.sendKeys(postcode, "14013");
    }

    public void idCountry() {
        BaseTest.click(id_country);
        BaseTest.click(id_countrySelected);
    }

    public void other() {
        BaseTest.sendKeys(other, "sla");
    }

    public void phone() {
        BaseTest.sendKeys(phone, "05198986043");
    }

    public void phoneMobile() {
        BaseTest.sendKeys(phone_mobile, "05198986043");
    }

    public void alias() {
        BaseTest.clear(alias);
        BaseTest.sendKeys(alias, "meu endereço");
    }

    public void submitAccountBtn() {
        BaseTest.click(submitAccount);
    }
}
