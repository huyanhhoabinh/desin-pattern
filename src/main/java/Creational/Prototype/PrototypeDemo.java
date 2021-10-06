package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        Statement statement = new Statement(sql, parameters, record);
        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement secondStatement = statement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("movie");
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());
        System.out.println(movie.getTitle());

        Book book = (Book) registry.createItem("book");
        System.out.println(book);
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());

        System.out.println(book.getUrl());

    }
}
