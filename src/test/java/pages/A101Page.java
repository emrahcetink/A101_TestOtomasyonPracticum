package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {
    public A101Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath ="//button[text()='Kabul Et']")
    public WebElement cookies;

    @FindBy (xpath ="(//a[@title=\"GİYİM & AKSESUAR\"])[1]")
    public WebElement giyimAksesuar;

    @FindBy (xpath ="//a[@class=\"js-filter-link \"]")
    public WebElement kadinIcGiyim;

    @FindBy (xpath ="(//a[@class=\"js-filter-link \"])[2]")
    public WebElement dizaltiCorap;

    @FindBy (xpath ="//a[text()='Dizaltı Çorap']")
    public WebElement dizaltiCorapDiger;

    @FindBy (xpath ="(//a[@href=\"/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/\"])[1]")
    public WebElement siyahCorap;

    @FindBy (xpath ="//span[text()=\"SİYAH\"]")
    public WebElement siyah;

    @FindBy (xpath ="//button[@class=\"add-to-basket button green block with-icon js-add-basket\"]")
    public WebElement sepeteEkle;

    @FindBy (xpath ="//a[@class=\"go-to-shop\"]")
    public WebElement sepeteGoruntule;

    @FindBy (xpath ="//a[@class=\"button green checkout-button block js-checkout-button\"]")
    public WebElement sepetiOnayla;

    @FindBy (xpath ="//a[@class=\"auth__form__proceed js-proceed-to-checkout-btn\"]")
    public WebElement uyeOlmadanDevamEt;

    @FindBy (xpath ="//input[@name=\"user_email\"]")
    public WebElement email;

    @FindBy (xpath ="//button[@class=\"button block green\"]")
    public WebElement devamEt;

    @FindBy (xpath ="(//a[@class=\"new-address js-new-address\"])[1]")
    public WebElement adresOlustur;

    @FindBy (xpath ="//input[@placeholder=\"Ev adresim, iş adresim vb.\"]")
    public WebElement adresBasligi;

    @FindBy (xpath ="//select[@name=\"city\"]")
    public WebElement il;

    @FindBy (xpath ="//select[@name=\"township\"]")
    public WebElement ilce;

    @FindBy (xpath ="//select[@name=\"district\"]")
    public WebElement mahallle;

    @FindBy (xpath ="//textarea[@class=\"js-address-textarea\"]")
    public WebElement adresBox;

    @FindBy (xpath ="//button[@class=\"button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button\"]")
    public WebElement kaydet;

    @FindBy (css ="input[class=\"js-phone-number\"]")
    public WebElement phoneNumber;

    @FindBy (xpath ="//button[@class=\"button block green js-proceed-button\"]")
    public WebElement kaydetDevamEt;

    @FindBy (xpath ="//div[@class=\"payment-tab payment-tab-masterpass js-payment-tab active\"]")
    public WebElement kartIleOdeme;

    @FindBy (xpath ="(//span[text()=\"Siparişi Tamamla\"])[2]")
    public WebElement siparisiTamamla;




}
