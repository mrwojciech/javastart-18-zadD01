package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (((numberList.get(i)) % 2) == 0) {
                result.add(numberList.get(i));
            }
        }
        return result;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (((numberList.get(i)) >20 )) {
                result.add(numberList.get(i));
            }
        }
        return result;
    }

    public List<Book> convertToBooks(List<String> titles) {

        List<Book> book = new ArrayList<>();
        for (String title :
                titles) {
            book.add(new Book(title));
        }
        return book ;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {

        List<Book> book = new ArrayList<>();
        for (String title :
                titles) {
            if (title.startsWith("Gra")){
                book.add(new Book(title));
            }
        }
        return book ;
    }
}
