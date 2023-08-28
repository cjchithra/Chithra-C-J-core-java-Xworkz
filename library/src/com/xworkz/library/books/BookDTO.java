package com.xworkz.library.books;

import com.xworkz.library.constant.BookType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter

public class BookDTO {
    private int bookId;
    private String bookName;
    private String authorName;
    private String publisher;
    private int yearOfPublish;
    private  int noOfPages;
    private double price;
    private BookType bookType;

}
