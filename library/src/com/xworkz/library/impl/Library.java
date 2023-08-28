package com.xworkz.library.impl;

import com.xworkz.library.books.BookDTO;
import com.xworkz.library.constant.BookType;

public interface Library {
    public boolean addBooks(BookDTO dto);
    public void getAllBooks();
    public BookDTO getBookById(int id);
    public BookDTO[] getBookByYear(int yearOfPublish);
    public BookDTO[] getBookByAuthor(String author);
    public BookDTO getBookByPublisher(String publisher);
    public String getBookNameByBookType(String BookType);
    public double getBookPriceByBookName(String bookName);
    public String getBookNamesByYearOfPublish(int year);

    public  boolean updateBookPagesByBookName(String existingBook , int updatedBookPages);
    public  boolean updateBookPriceByBookId(int id , double updatePrice);
    public  boolean updatePublisherByAuthor(String  existingAuthor , String updatePublisher);
    public boolean deleteBookById(int id);




}
