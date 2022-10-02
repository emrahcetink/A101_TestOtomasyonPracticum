@wip
Feature: A101 Test Otomasyon Practicum
  Scenario:Kullanici urun secip odeme yapar
    Given kullanici "a101Url" anasayfasina gider
    Then kullanici cookie kabul eder
    Then kullanici giyim aksesuar bolumunu tiklar
    And kullanici dizalticorap tiklar
    And kullanici urunu secer
    And kullanici secilen urunun siyah oldugunu dogrular
    And kullanici urunu sepete ekler
    And kullanici sepeti goruntule butonuna tiklar
    And kullanici sepeti onayla butonuna tiklar
    And kullanici uye olmadan devam et butonuna tiklar
    And kullanici mail adresi girer ve devam et butonuna tiklar
    And kullanici yeni adres olustur butonuna tiklar
    And kullanici adres bilgilerini girer ve kaydet butonuna tiklar
    And kullanici kaydet ve devam et butonuna tiklar
    And kullanici odeme ekranina geldigini dogrular
    And kullanici siparisi tamamla butonuna tiklar
    And kullanici sayfayi kapatir
