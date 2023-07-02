package book_model;

/**
 * @author ChnpngWng
 *
 * @date   Dec 2, 20221:38:08 PM
 */
public class Book {
	private int id;
	private String name;
	private String author;
	private Double price;
	private String typer;
	/**
	 * @param id
	 * @param name
	 * @param author
	 * @param price
	 * @param typer
	 */
	public Book(int id, String name, String author, Double price, String typer) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.typer = typer;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the typer
	 */
	public String getTyper() {
		return typer;
	}
	/**
	 * @param typer the typer to set
	 */
	public void setTyper(String typer) {
		this.typer = typer;
	}
	
	
}
