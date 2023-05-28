package webTestcase;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
*
* @author Enise Bihter Sarı enise.sari@ogr.sakarya.edu.tr
* @since 15/05/2023 - 28/05/2023
* <p>
* Yazılım Testi 1.A Grop
* </p>
* 
*/

public class webTestcase {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input =new Scanner(System.in);
				
		int secimYapma;
		
		do 
		
		{
			secimYapma = menuSecenekleri(input);
			
			switch(secimYapma)
			{
			case 1:
				TitleName();
				break;
				
			case 2:
				aramaYapma();
				break;
				
			case 3:
				imageListesi();
				break;
				
			case 4:
				linkText();
				break;
			
			case 5:
				partialLinkText();
				break;
				
			case 6:
				isEnabled();
				break;
				
			case 7:
				isDisplayed();
				break;
				
			case 8:
				imageTag();
				break;
				
			case 9:
				baglantıListeleme();
				break;
				
			case 10:
				fotoğrafYazıları();
				break;
				
			case 11:
				UyeGirisi();
				break;
				
			case 12:
				partialLinkText2();
				break;
				
			case 13:
				mailgonderme();
				break;
			
			case 14:
				kayıtOl();
				break;
				
			case 15:
				SelectByVisibleText();
				break;
				
			case 16:
				SelectByValue();
				break;
				
			case 17:
				isSelect();
				break;
				
			case 18:
				isEnabled2();
				break;
				
			case 19:
				hesapOlusturmaBtn();
				break;
				
			case 20:
				FotografBasma();
				break;
				
			case 21:
				 GetCurrentUrl();
				break;
				
			case 22:
				BaskaSayfAcma();
				break;
				
			case 23:
				TextYazderVeTemizle();
				break;
			case 24:
				Submit();
				break;
				
			case 25:
				GetLocation();
				break;
				
			case 26:
				deleteAllCookies();
				break;
				
			case 27:
				SetSize();
				break;
				
			case 28:
				ClickOn();
				break;
				
			case 29:
				 Clear();
				break;
				
			case 30:
				GetText();
				break;
				
			case 31:
				System.out.println("Gorusuruz!!!");
				break;
				
			default:
				System.out.println("Hatali giris: lutfen 1-31 arasi deger giriniz");
				break;
				
			}
			
		} while(secimYapma != 31);

	}
	
	/// Menu seceneklerini goruntule
	public static int menuSecenekleri(Scanner input) {
		System.out.println("\n Seçinekler");
		System.out.println("---------------------");
			
		System.out.print("1) GitTitle testCase çalıştır.\n");
		System.out.print("2) değer gönder ve ara.(x-path)\n");
		System.out.print("3) img tag tescase çalıştır(fotoğraf sayılarını bulma).\n");
		System.out.print("4) LinkText testCase çalıştır.\n");
		System.out.print("5) PartialLinkText() testCase çalıştır.\n");
		System.out.print("6) isEnabled() testCase çalıştır(x-path).\n");
		System.out.print("7) isDisplayed() testCase çalıştır.(x-path)\n");
		System.out.print("8) tagName testCase çalıştır(eleman adını yazırır)\n");
		System.out.print("9) tagName testCase çalıştır(Fotoğraf bağlantılarını listeleme).\n");
		System.out.print("10) tagName testCase çalıştır(Fotoğraf yazılarını listeleme).\n");
		
		System.out.print("11) UyeGirşi için testCase çalıştır(x-paht).\n");
		System.out.print("12) PartialLinkText(2) testCase.\n");
		System.out.print("13) GetAttribute testCase çalıştır.\n");
		System.out.print("14) kayıtOl sayfası için testCase çalıştır.\n");
		System.out.print("15) SelectByVisibleText testCase çalıştır.\n");
		System.out.print("16) SelectByValue() testCase çalıştır.\n");
		System.out.print("17) isSelect() testCase çalıştır.\n");
		System.out.print("18) isEnabled testCase çalıştır(disable).\n");
		System.out.print("19) hesapOluştur botonuna testCase.\n");
		System.out.print("20) GetAttribute testCase çalıştır(img bağlanıtısına basma)x-path\n");
		
		System.out.print("21) GetCurrentUrl testCase çalıştır\n");
		System.out.print("22) Navigate()To() testCase çalıştır \n");
		System.out.print("23) Navigate()back,refersh testCase çalıştır");
		System.out.print("24) Submit() testCase çalıştır.\n");
		System.out.print("25) GetLocation() testCase çalıştır.\n");
		System.out.print("26) DeleteAllCookies testCase çalıştır.\n");
		System.out.print("27) SetSize testCase çalıştır.\n");
		System.out.print("28) Click() testCase çalıştır.(x-path).\n");
		System.out.print("29) Clear() testCase çalıştır.(x-path).\n");
		System.out.print("30) GetText() testCase çalıştır.\n");
		System.out.print("31) Quit \n");
		
		return input.nextInt();
		
	}
	
	@Test
	/// sitenin adina yazdirma
	public static void TitleName() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/");
				
		String title = sunucu.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		sunucu.quit();
		
	}
	
	@Test
	/// arama yapma kontrolu, Xpath
	public static void aramaYapma() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/");
		
		// aramaya deger gonderme
		WebElement arama = driver.findElement(By.xpath("//*[@id=\"form-search\"]/input"));
		arama.sendKeys("soli");
		Thread.sleep(1000);
		
		WebElement ara = driver.findElement(By.xpath("//*[@id=\"form-search\"]/button/i"));
		
		ara.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	// kullanılan fotoğraf sayısı 
	public static void imageListesi() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver sunucu = new ChromeDriver();
		sunucu.get("https://www.solilamba.com/");   //ornek site
		sunucu.manage().window().maximize();
			
		List<WebElement> imageList = sunucu.findElements(By.tagName("img"));
			
		System.out.println("home sayfada var olan img tag..."+ imageList.size());
			
		Thread.sleep(2000);
		sunucu.quit();
		
	}
	
	@Test
	// yazı bğlantısı için testCase
	public static void linkText() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver sunucu = new ChromeDriver();
		sunucu.get("https://www.solilamba.com/");
		sunucu.manage().window().maximize();
				
		WebElement clickLink = sunucu.findElement(By.linkText("Ürünler"));
		clickLink.click();
		Thread.sleep(2000);
		
		System.out.println("Yazı bağlantısı..."+ clickLink);
		sunucu.quit();
		
	}
	
	@Test
	// Yazı bağlantısı partialLink
	public static void partialLinkText() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver sunucu = new ChromeDriver();
		sunucu.get("https://www.solilamba.com/");
		sunucu.manage().window().maximize();
					
		WebElement clickLink = sunucu.findElement(By.linkText("Ürünler"));
		clickLink.click();			
		Thread.sleep(2000);
		
		WebElement clickLink2 = sunucu.findElement(By.partialLinkText("Osram"));
		clickLink2.click();		
		Thread.sleep(2000);
		
		System.out.println("Yazı bağlantısı..."+ clickLink2);
		sunucu.quit();
		
	}
	
	@Test
	/// isEnabled testCase Xpath kullanarak
	public static void isEnabled() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/");
		
		// değişkende saklama
        WebElement Is_enabled = driver.findElement(By.xpath("//*[@id=\"topline\"]/div/div/div[2]/div/span[2]/a[1]"));
		
		boolean Enabled = Is_enabled.isEnabled();
		
		Thread.sleep(3000);
		
		System.out.println("Doğru..."+ Enabled);
		
		driver.quit();
	}
	
	@Test
	/// isDisplayed testCase Xpath kullanarak
	public static void isDisplayed() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/");
		
		// değişkende saklama
        WebElement Is_displayed = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		
		boolean displayed = Is_displayed.isDisplayed();
		
		Thread.sleep(3000);
		
		System.out.println("Doğru..."+ displayed);
		
		driver.quit();
	}
	
	@Test
	///TageName kullanarak eleman adını yazdırmak
	public static void imageTag() {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/");
			
		WebElement ImgTag = driver.findElement(By.tagName("img"));
		System.out.println("Kullanılan tagName... "+ ImgTag.getTagName());
		
		driver.quit();
		
	}
	
	@Test
	//Fotoğraf bağlantılarını listeleme
	public static void baglantıListeleme() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.solilamba.com/");
		driver.manage().window().maximize();
		
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		
		System.out.println("kullanılan fotoğraf sayısı..."+ listImages.size());
		System.out.println("Bağlantılar...");
	    
	    /// resim linklerini saymak için
		for(int m =0; m< listImages.size(); m++) {
			if(!(listImages.get(m).getAttribute("src").equals("") && !(listImages.get(m).getAttribute("src")== null))) {
				
				System.out.println(listImages.get(m).getAttribute("src"));
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	//Fotoğraf yazılarını listeleme
	public static void fotoğrafYazıları() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.solilamba.com/");
		driver.manage().window().maximize();
			
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
			
		System.out.println("kullanılan fotoğraf sayısı..."+ listImages.size());
		System.out.println("Bağlantılar...");
		    
		/// fotoğraf linki sayma
		for(int m =0; m< listImages.size(); m++) {
			if(!(listImages.get(m).getAttribute("alt").equals("") && !(listImages.get(m).getAttribute("alt")== null))) {
				System.out.println(listImages.get(m).getAttribute("alt"));
				
			}
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	/// UyeGirşi için testCase Xpaht
	public static void UyeGirisi() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
			
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/uyegirisi");
			
		// Kullanıcı adına değer gönderme
		WebElement kullanıcıAdı = sunucu.findElement(By.id("kadi"));
		kullanıcıAdı.sendKeys("ahmet");
		Thread.sleep(3000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değere "+ kullanıcıAdı.getAttribute("value"));
			
		WebElement sifre = sunucu.findElement(By.id("sifre"));
		sifre.sendKeys("AH123456");
			
		// gönderilen değere yazdır
		System.out.println("gönderilen değere "+sifre.getAttribute("value"));
		Thread.sleep(2000);
		
		sunucu.findElement(By.xpath("//*[@id=\"submit-form\"]")).click();
		Thread.sleep(6000);
		System.out.println("kullanıcı hesabı olamdığı için giriş yapılmıyor.");
		sunucu.quit();	
		
	}
	
	@Test
	// Yazı bağlantısı şifremi Unuttum
	public static void partialLinkText2() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver sunucu = new ChromeDriver();
		sunucu.get("https://www.solilamba.com/");
		sunucu.manage().window().maximize();
						
			
		WebElement clickLink = sunucu.findElement(By.partialLinkText("Şifremi"));
		clickLink.click();		
		Thread.sleep(2000);
			
		System.out.println("Yazı bağlantısı..."+ clickLink);
		sunucu.quit();
		
	}
	
	@Test
	// mail yazdırma ve göndrme 
	public static void mailgonderme() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/uyegirisi");
			
		WebElement mailBox = driver.findElement(By.id("nl-email"));
		mailBox.sendKeys("ahmet@gmail.com");
		mailBox.click();
		Thread.sleep(4000);
		
		System.out.println("yazilan mail gönderildi "+ mailBox.getAttribute("value"));
		
		driver.quit();
		
	}
	
	@Test
	/// kayıtOl sayfası için testCase
	public static void kayıtOl() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
				
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/hesapolustur");
				
		// mail textLebal değer gönderme
		WebElement mailAdres = sunucu.findElement(By.id("email"));
		mailAdres.sendKeys("ahmet@gamil.com");
		Thread.sleep(2000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ mailAdres.getAttribute("value"));
				
		WebElement sifre = sunucu.findElement(By.id("sifre"));
		sifre.sendKeys("AH123456");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+sifre.getAttribute("value"));
		Thread.sleep(2000);
			
		WebElement ad = sunucu.findElement(By.id("adi"));
		ad.sendKeys("Ahmet");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ad.getAttribute("value"));
		Thread.sleep(2000);
			
		WebElement soyAd = sunucu.findElement(By.id("soyadi"));
		soyAd.sendKeys("zengin");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+soyAd.getAttribute("value"));
		Thread.sleep(2000);
			
		WebElement adres = sunucu.findElement(By.id("adres"));
		adres.sendKeys("Kemal paşa...");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+adres.getAttribute("value"));
		Thread.sleep(2000);
			
		WebElement ilce = sunucu.findElement(By.id("ilce"));
		ilce.sendKeys("serdivan");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ilce.getAttribute("value"));
		Thread.sleep(2000);
			
		sunucu.quit();	
			
	}
		
	@Test
	/// Select komutu için test
	public static void SelectByVisibleText() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
						
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/hesapolustur");
						
			
		WebElement dropDown = sunucu.findElement(By.id("cinsiyeti"));
		Select select = new Select(dropDown);
			
		select.selectByVisibleText("Bayan");
		Thread.sleep(3000);
			
		sunucu.quit();
			
	}
	
	@Test
	/// değer ile seçim yapmak
	public static void SelectByValue() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
								
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/hesapolustur");
								
					
		WebElement dropDown = sunucu.findElement(By.id("dogumGun"));
		Select select = new Select(dropDown);
					
		select.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement dropDown2 = sunucu.findElement(By.id("dogumAy"));
		Select select2 = new Select(dropDown2);
					
		select2.selectByValue("5");
		Thread.sleep(2000);
					
		sunucu.quit();
		
	}
	
	@Test
	/// Üyelik sözleşme kontrol etme
	public static void isSelect() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
										
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/hesapolustur");
			
		WebElement Is_selected = sunucu.findElement(By.tagName("input"));
			
		boolean selected = Is_selected.isSelected();
			
		Thread.sleep(3000);
		System.out.println("It is unSelected... "+ selected);
			
		sunucu.quit();
			
	}
	@Test
	/// isEnabled testCase boton için
	public static void isEnabled2() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/hesapolustur");
			
			
		WebElement Is_enabled = driver.findElement(By.id("submit"));
		boolean Enabled = Is_enabled.isEnabled();
			
		Thread.sleep(2000);
			
		System.out.println("disable olduğu için doğru");
		System.out.println("Doğru..."+ Enabled);
			
		driver.quit();
		
	}
	
	@Test
	/// hesap olusturma botona testCase
	public static void hesapOlusturmaBtn() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\driver\\chromeDriver\\chromedriver.exe");
						
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/hesapolustur");
						
		// mail textLebal değer gönderme
		WebElement mailAdres = sunucu.findElement(By.id("email"));
		mailAdres.sendKeys("ahmet@gamil.com");
		Thread.sleep(2000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ mailAdres.getAttribute("value"));
						
		WebElement sifre = sunucu.findElement(By.id("sifre"));
		sifre.sendKeys("AH123456");
						
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+sifre.getAttribute("value"));
		Thread.sleep(2000);
					
		WebElement ad = sunucu.findElement(By.id("adi"));
		ad.sendKeys("Ahmet");
						
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ad.getAttribute("value"));
		Thread.sleep(2000);
					
		WebElement soyAd = sunucu.findElement(By.id("soyadi"));
		soyAd.sendKeys("zengin");
						
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+soyAd.getAttribute("value"));
		Thread.sleep(2000);
					
		WebElement adres = sunucu.findElement(By.id("adres"));
		adres.sendKeys("Kemal paşa...");
						
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+adres.getAttribute("value"));
		Thread.sleep(2000);
				
		WebElement ilce = sunucu.findElement(By.id("ilce"));
		ilce.sendKeys("serdivan");
						
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ilce.getAttribute("value"));
		Thread.sleep(2000);
			
		WebElement clickBoton = sunucu.findElement(By.name("submit"));
		clickBoton.click();
			
		Thread.sleep(4000);
		System.out.println("boton basıld");
					
		sunucu.quit();
			
	}
		
	@Test
	///Fotoğraf bağlantısına basma Xpath
	public static void FotografBasma() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/referans_0-694#prettyPhoto");
				
		WebElement imgLink = driver.findElement(By.xpath("//*[@id=\"column_right\"]/div[7]/div[1]/div[1]/a/img"));
		imgLink.click();
		Thread.sleep(4000);
			
		System.out.println("Fotoğraf metni... "+imgLink.getAttribute("alt") );
		Thread.sleep(3000);
		driver.quit();
			
	}
	
	@Test
	//kullanılan bağlantıya yazdıracak
	public static void GetCurrentUrl() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.solilamba.com/osram-led-maden-saha-aydinlatma-1000w-220vac-ak1000_9-82");
			
		String url = driver.getCurrentUrl();
					
		System.out.println("Kullanılan bağlantı"+ url);
		Thread.sleep(2000);
		driver.quit();
		
	}
		
	@Test
	//Başka webSayfa açma ve kapatma
	public static void BaskaSayfAcma() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
								
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.solilamba.com/");
		Thread.sleep(2000);	
		driver.navigate().to("https://solilamp.com/");
			
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	@Test
	//TextLabel yazdırma ve temizleme 
	public static void TextYazderVeTemizle() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
										
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
					
		driver.get("https://www.solilamba.com/");
		Thread.sleep(2000);	
		driver.navigate().to("https://www.solilamba.com/kontak_0-462");
		Thread.sleep(2000);
			
		WebElement ad = driver.findElement(By.id("fullname"));
		ad.sendKeys("Ahmet");
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ad.getAttribute("value"));
		Thread.sleep(2000);
			
		// mail textLebal değer gönderme
		WebElement mailAdres = driver.findElement(By.id("email"));
		mailAdres.sendKeys("ahmet@gamil.com");
		Thread.sleep(2000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ mailAdres.getAttribute("value"));
			
		// mail textLebal değer gönderme
		WebElement firmaAdı = driver.findElement(By.id("firma_kurum"));
		firmaAdı.sendKeys("Google");
		Thread.sleep(2000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değer "+ firmaAdı.getAttribute("value"));
			
		driver.navigate().refresh();
		Thread.sleep(3000);
			
		driver.navigate().back();
		Thread.sleep(2000);
			
		driver.quit();
			
	}
	
	@Test
	/// submit testCase
	public static void Submit() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
				
		WebDriver sunucu = new ChromeDriver();
		sunucu.manage().window().maximize();
		sunucu.get("https://www.solilamba.com/uyegirisi");
				
		// Kullanıcı adına değer gönderme
		WebElement kullanıcıAdı = sunucu.findElement(By.id("kadi"));
		kullanıcıAdı.sendKeys("ahmet");
		Thread.sleep(3000);
		// gönderilen değere yazdır
		System.out.println("gönderilen değere "+ kullanıcıAdı.getAttribute("value"));
			
		WebElement sifre = sunucu.findElement(By.id("sifre"));
		sifre.sendKeys("AH123456");
				
		// gönderilen değere yazdır
		System.out.println("gönderilen değere "+sifre.getAttribute("value"));
		Thread.sleep(2000);
				
		sunucu.findElement(By.id("sifre")).submit();
		Thread.sleep(2000);
			
		System.out.println("kullanıcı hesabı olamdığı için giriş yapılmıyor.");
		sunucu.quit();	
			
	}
	
	@Test
	//GetLocation testCase (x-paht)
	public static void GetLocation() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
										
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
					
		driver.get("https://www.solilamba.com/");
			
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"form-search\"]/input"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(searchBox).build().perform();
		Thread.sleep(3000);
		driver.quit();
			
			
	}
	
	@Test
	//Başka webSayfa açma ve kapatma
	public static void deleteAllCookies() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
												
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
							
		driver.get("https://www.solilamba.com/");
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		System.out.println("Hepsi silinde");
		driver.quit();
			
	}
	
	@Test
	//SetSize testCase
	public static void SetSize() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
														
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
									
		driver.get("https://www.solilamba.com/");
		Dimension dim = new Dimension(300,650);
			
		driver.manage().window().setSize(dim);
		Thread.sleep(4000);
		driver.quit();
			
	}
	
	@Test	
	//ClickOn testCase (x-paht)
	public static void ClickOn() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
																
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
											
		driver.get("https://www.solilamba.com/");
			
		driver.findElement(By.xpath("//*[@id=\"carousel_bestsellers\"]/div[1]/div/div/div[9]/a/img")).click();
		Thread.sleep(2000);
			
		System.out.println("Balsıldı");
		driver.quit();
			
	}
	
	@Test
	//Clear() testCase (x-paht)
	public static void Clear() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
																
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
											
		driver.get("https://www.solilamba.com/kontak_0-462");
			
		driver.findElement(By.xpath("//*[@id=\"form_message\"]")).sendKeys("En iyi firma ....<> ):");
		Thread.sleep(4000);
			
		driver.findElement(By.xpath("//*[@id=\"form_message\"]")).clear();
		Thread.sleep(3000);
		System.out.println("Silinde");
		driver.quit();
		
	}
	
	@Test
	// GetText testCase
	public static void GetText() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\\\driver\\\\chromeDriver\\\\chromedriver.exe");
																
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
											
		driver.get("https://www.solilamba.com/hakkimizda_0-633");
			
		String Text = driver.findElement(By.className("breadcrumbs")).getText();
		Thread.sleep(2000);
			
		System.out.println("Yazı- "+ Text);
		driver.quit();
			
		}
		
}
