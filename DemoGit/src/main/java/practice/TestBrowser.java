package practice;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtilpractice bu= new BrowserUtilpractice();
		
		bu.Browserlaunch("chrome");
		bu.launchURL("https://www.google.com");
		String URL=bu.getCurrentUrl();
		System.out.println(URL);
		
		System.out.println(bu.getPageSourch().contains("Copyright The Closure Library Authors"));
		//Copyright The Closure Library Authors.
		String Title= bu.getTitle();
		System.out.println(Title);
		System.out.println("***************");
	
		bu.closeBrowser();
		bu.quitBrowser();
		
	}

}
