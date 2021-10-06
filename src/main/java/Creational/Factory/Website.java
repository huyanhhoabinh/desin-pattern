package Creational.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    @Override
    public String toString() {
        pages.forEach(System.out::println);
        return null;
    }
}
