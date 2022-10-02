package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class A101StepDefinition {

    A101Page a101Page =new A101Page();
    Actions actions= new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici cookie kabul eder")
    public void kullaniciCookieKabulEder() {
        ReusableMethods.waitFor(3);
        ReusableMethods.click(a101Page.cookies);

    }

    @Then("kullanici giyim aksesuar bolumunu tiklar")
    public void kullaniciGiyimAksesuarBolumunuTiklar() {
      //a101Page.giyimAksesuar.click();
        actions.moveToElement(a101Page.giyimAksesuar).perform();
        ReusableMethods.waitFor(3);

    }

    @And("kullanici dizalticorap tiklar")
    public void kullaniciDizalticorapTiklar() {
        a101Page.dizaltiCorapDiger.click();
        ReusableMethods.waitFor(3);
    }


    @Then("kullanici urunu secer")
    public void kullanici_urunu_secer() {
        a101Page.siyahCorap.click();
        ReusableMethods.waitFor(3);

    }

    @Then("kullanici secilen urunun siyah oldugunu dogrular")
    public void kullanici_secilen_urunun_siyah_oldugunu_dogrular() {
        String expectedRenk ="SİYAH";
        String actualRenk=a101Page.siyah.getText();
        Assert.assertEquals(expectedRenk,actualRenk);
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
         a101Page.sepeteEkle.click();
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici sepeti goruntule butonuna tiklar")
    public void kullanici_sepeti_goruntule_butonuna_tiklar() {
         a101Page.sepeteGoruntule.click();
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici sepeti onayla butonuna tiklar")
    public void kullanici_sepeti_onayla_butonuna_tiklar() {
        a101Page.sepetiOnayla.click();
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici uye olmadan devam et butonuna tiklar")
    public void kullanici_uye_olmadan_devam_et_butonuna_tiklar() {
         a101Page.uyeOlmadanDevamEt.click();
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici mail adresi girer ve devam et butonuna tiklar")
    public void kullanici_mail_adresi_girer_ve_devam_et_butonuna_tiklar() {
         a101Page.email.sendKeys(faker.internet().emailAddress());
         a101Page.devamEt.click();
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici yeni adres olustur butonuna tiklar")
    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {
       a101Page.adresOlustur.click();
        ReusableMethods.waitFor(3);

    }

    @Then("kullanici adres bilgilerini girer ve kaydet butonuna tiklar")
    public void kullanici_adres_bilgilerini_girer_ve_kaydet_butonuna_tiklar() {
      actions.click(a101Page.adresBasligi).sendKeys("Ev Adresim").
              sendKeys(Keys.TAB).
              sendKeys(faker.name().firstName()).
              sendKeys(Keys.TAB).
              sendKeys(faker.name().lastName()).
              sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(3);
        a101Page.phoneNumber.sendKeys("5555555555");
        ReusableMethods.waitFor(3);
        Select selectIl =new Select(a101Page.il);
        selectIl.selectByVisibleText("İSTANBUL");
        ReusableMethods.waitFor(3);
        Select selectIlCe =new Select(a101Page.ilce);
        selectIlCe.selectByVisibleText("BAŞAKŞEHİR");
        ReusableMethods.waitFor(3);
        Select selectMah =new Select(a101Page.mahallle);
        selectMah.selectByVisibleText("BAŞAK MAH");
        ReusableMethods.waitFor(3);
        a101Page.adresBox.sendKeys(faker.address().fullAddress());
        ReusableMethods.waitFor(3);
        a101Page.kaydet.click();
        ReusableMethods.waitFor(3);

    }

    @Then("kullanici kaydet ve devam et butonuna tiklar")
    public void kullanici_kaydet_ve_devam_et_butonuna_tiklar()  {
        a101Page.kaydetDevamEt.submit();
        ReusableMethods.waitFor(3);

    }

    @Then("kullanici odeme ekranina geldigini dogrular")
    public void kullanici_odeme_ekranina_geldigini_dogrular() {
        String expectedText="Kart ile ödeme";
        String actualText=a101Page.kartIleOdeme.getText();
        Assert.assertEquals(expectedText,actualText);
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici siparisi tamamla butonuna tiklar")
    public void kullanici_siparisi_tamamla_butonuna_tiklar(){
         a101Page.siparisiTamamla.click();
         ReusableMethods.waitFor(3);

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
