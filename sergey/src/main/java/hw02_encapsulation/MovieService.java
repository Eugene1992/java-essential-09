package hw02_encapsulation;

/**
 * Created by Serezha on 04.10.2016.
 */
public class MovieService {
    public void sortIdToUp(Movie[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getId() < arr[j + 1].getId()) {
                    Movie tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void sortIdToDown(Movie[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getId() > arr[j + 1].getId()) {
                    Movie tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void sortCostToUp(Movie[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getCost() < arr[j + 1].getCost()) {
                    Movie tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void sortCostToDown(Movie[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getCost() > arr[j + 1].getCost()) {
                    Movie tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void searchTitle(Movie[] arr, String text) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTitle() != null) {
                //System.out.println("\nid " + arr[i].getId() + " Title " + arr[i].getTitle() + "  " + arr[i].getTitle().compareTo(text));
                //System.out.println(arr[i].getTitle().matches(".*\\b" + text + "\\b.*"));
                if (arr[i].getTitle().matches(".*\\b" + text + "\\b.*"))
                    System.out.print(" Found: " + arr[i].getTitle());
            }
        }
    }
}
