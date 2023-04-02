import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class News implements Inews{
//	public abstract void methodB();
	private int ID;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	private double AverageRate;
	
	News() {
	};
	
	public News(int ID, String Title, String PublishDate, String Author, String Content, double AverageRate) {
		this.ID = ID;
		this.Title = Title;
		this.PublishDate = PublishDate;
		this.Author = Author;
		this.Content = Content;
		this.AverageRate = AverageRate;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public void setAverageRate(double d) {
		AverageRate = d;
	}
	public double getAverageRate() {
		return AverageRate;
	}
	@Override
	public void Display() {
		System.out.println("Title: " + this.Title);
		System.out.println("PublishDate: " + this.PublishDate);
		System.out.println("Author: " + this.Author);
		System.out.println("Content: " + this.Content);
		System.out.println("AverageRate: " + this.AverageRate);
	}
	public int compareTo(News otherRate) {
		return (int)(this.getAverageRate() - otherRate.getAverageRate());
	}
}

class TestMain {
	public static void main(String srgs[]) {
		ArrayList<News> listNews = new ArrayList<News>();
		int n = 3;
		News tempNews1 = new News();
		tempNews1.setID(1);
		tempNews1.setTitle("A");
		tempNews1.setPublishDate("A");
		tempNews1.setAuthor("A");
		tempNews1.setContent("A");
		tempNews1.setAverageRate(4.6);
		
		News tempNews2= new News();
		tempNews2.setID(2);
		tempNews2.setTitle("B");
		tempNews2.setPublishDate("B");
		tempNews2.setAuthor("B");
		tempNews2.setContent("B");
		tempNews2.setAverageRate(5.4);
		
		News tempNews3 = new News();
		tempNews3.setID(3);
		tempNews3.setTitle("C");
		tempNews3.setPublishDate("C");
		tempNews3.setAuthor("C");
		tempNews3.setContent("C");
		tempNews3.setAverageRate(2.1);
		
		listNews.add(tempNews1);
		listNews.add(tempNews2);
		listNews.add(tempNews3);
		
		for(News item : listNews) {
			item.Display();
		}
		
		Collections.sort(listNews, new Comparator<News>(){
			public int compare(News n1,News n2) {
				return n1.compareTo(n2);
			}
		});

		for(News item : listNews) {
			item.Display();
		}
	}
}
