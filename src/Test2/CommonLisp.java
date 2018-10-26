package Test2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CommonLisp {
    
    public static void main(String[] args) {
        print("Fetching....");
		Document document;
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect("https://en.wikipedia.org/wiki/Common_Lisp").get();
                        
                       Elements contents = document.select("#toc");
                      	System.out.println("\n" + contents.text());
			   
                     
                       Elements media = document.select("[src]");
                        print("\nPictures:" + media.size());
                        
						for (Element src : media) {
                            
						if (src.tagName().equals("img"))
                        System.out.println("Link: "+src.attr("abs:src"));
                    else
                    	System.out.println("Link: "+src.attr("abs:src"));
        }
                        
                        Elements ref = document.select("#mw-content-text > div > div.reflist");                  
							
							System.out.println("\nReferences: " + ref.text());
                        
                    

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void print(String string) {
		System.out.println(string);
    }
    
}