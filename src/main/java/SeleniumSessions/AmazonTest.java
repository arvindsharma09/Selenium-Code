package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("Chrome");
		br.launchUrl("https://www.amazon.com/");
		String title = br.getPageTitle();
		
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		br.closeBrowser();
		
	}

}
