package org.example;

public class Book {
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name){
        this.isCheckedOut = true;
        setCheckedOutTo(name);
    }

    public void checkIn(){
        this.isCheckedOut = false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
