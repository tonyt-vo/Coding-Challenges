package reddit_challenges;
import java.io.IOException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;

// Coding Challenge #277
// Difficulty Level Easy
// 12/19/2016
// Trying out Jsoup
// Still has HTTP error Fetching URL. Status = 429.
// "https://www.reddit.com/r/dailyprogrammer/comments/5j6ggm/20161219_challenge_296_easy_the_twelve_days_of/"

public class TwelveDaysOfChristmas {

	public static void main (String[] args) throws IOException {
//		try{
//			
//			//Connect to the URL.
//			System.setProperty("http.agent", "Chrome");
//			Document doc = Jsoup.connect("https://www.reddit.com/r/dailyprogrammer/comments/5j6ggm/20161219_challenge_296_easy_the_twelve_days_of/").get();	
//			
//			// Get the html file and strip it of tags.
//			String song = doc.html();
//			String strip = Jsoup.parse(song).text();
//			
//			// Find the starting index of the song and use substring to get the entire song.
//			// Used a character counter online to count the amount of chars in the song.
//			int start = strip.indexOf("On the first day ");
//			System.out.println(strip.substring(start, start+2120));		
//			
//		// Catch the error.	
//		}catch(Exception e){
//			System.out.println("You didn't get premission to enter website");
//		}
	}
}
