package hw02_encapsulation;

/**
 * Created by Serezha on 04.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        /*Movie(int id, String title, int year,String country, String genre,String director, String producer,
                        String writers, String actors, String url)*/

        Movie mov1 = new Movie(1, "The Magnificent Seven", 2016, "USA", "Action, Adventure, Western", "Antoine Fuqua",
                "Roger Birnbaum", "Akira Kurosawa", "Denzel Washington, Chris Pratt, Ethan Hawke",
                "http://www.imdb.com/title/tt2404435/", "Captain Jack Sparrow searches for the trident of Poseidon.", 10.5);

        Movie mov2 = new Movie(2, "X-Men: Apocalypsen", 2016, "USA", " Action, Adventure, Sci-Fi", "Bryan Singer",
                "Simon Kinberg", "Simon Kinberg", "James McAvoy, Michael Fassbender, Jennifer Lawrence",
                "http://www.imdb.com/title/tt3385516/", "After the re-emergence of the world's first mutant," +
                " world-destroyer Apocalypse, the X-Men must unite to defeat his extinction level plan.", 11.5);
        Movie mov3 = new Movie();
        mov3.setId(3);
        mov3.setYear(2015);
        mov3.setCost(15.7);

        Movie mov4 = new Movie();
        mov4.setId(4);
        mov4.setYear(2014);
        mov4.setCost(15.7);

        Movie[] arrMov = {mov1, mov2, mov3, mov4};
    }
}
