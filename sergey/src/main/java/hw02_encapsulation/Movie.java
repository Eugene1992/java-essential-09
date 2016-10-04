package hw02_encapsulation;

/**
 * Created by Serezha on 04.10.2016.
 */
public class Movie {
    private int id;
    private String title;
    private int year;
    private String country;
    private String genre;
    private String director;
    private String producer;
    private String writers;
    private String actors;
    private String url;
    private String desc;
    private double cost;

    public Movie() {

    }

    public Movie(int id, String title, int year,
                 String country, String genre,
                 String director, String producer,
                 String writers, String actors, String url, String desc, double cost) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.country = country;
        this.genre = genre;
        this.director = director;
        this.producer = producer;
        this.writers = writers;
        this.actors = actors;
        this.url = url;
        this.desc = desc;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUrl() {
        return url;


    }

    public void setUrl(String url) {
        this.url = url;
    }
}
