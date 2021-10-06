package Creational.Factory;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog);
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop);
    }
}
