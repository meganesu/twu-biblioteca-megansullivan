package com.twu.biblioteca;

public class BibliotecaApp {

    private Library l;

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        Library lib = new Library();

        System.out.println(app.getWelcome());
        System.out.println(app.getBookList(lib));
    }

    public BibliotecaApp() {
        Library l = new Library();
    }

    public String getWelcome() {
        return "Hello, welcome to Biblioteca!\n";
    }

    public String getBookList(Library lib) {
        String s = "";
        for (Book book : lib.getBooks()) {
            s += book.toString() + "\n";
        }
        return s;
    }
}
