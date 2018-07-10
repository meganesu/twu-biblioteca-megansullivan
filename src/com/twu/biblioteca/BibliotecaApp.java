package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private Library l;

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        Library lib = new Library();

        System.out.println(app.getWelcome());
        System.out.println(app.buildBookListString(lib.getBooks()));
    }

    public BibliotecaApp() {
        Library l = new Library();
    }

    public String getWelcome() {
        return "Hello, welcome to Biblioteca!\n";
    }

    public String buildBookListString(ArrayList<Book> books) {
        String s = "";
        for (Book book : books) {
            s += book.toString() + "\n";
        }
        return s;
    }
}
