package com.xworkz.library.impl;

import com.xworkz.library.books.BookDTO;

import java.util.Arrays;

public class PublicLibraryImpl implements Library{
    public BookDTO dto[];
    public PublicLibraryImpl(int size) {

        dto = new BookDTO[size];
    }
    int index;
    static int id = 0;
    @Override
    public boolean addBooks(BookDTO dto) {
        boolean isAdded = false;
        if (dto != null) {

            dto.setBookId(++id);

            this.dto[index++] = dto;
            isAdded = true;
        } else {
            System.out.println("Book is null.. cannot be added");
        }
        return isAdded;

    }

    @Override
    public void getAllBooks() {
        System.out.println("The available patient");
        for (int dtoIndex = 0; dtoIndex < dto.length; dtoIndex++)
            System.out.println(dto[dtoIndex]);


    }

    @Override
    public BookDTO getBookById(int bookId) {
        BookDTO bookid = null;
        for (int index = 0; index < dto.length; index++) {
            if (dto[index].getBookId() == (bookId)) {
                bookid = dto[index];

            }

        }
        return bookid;

    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublish) {
        for (int index = 0; index < dto.length; index++){
            if ((dto[index].getYearOfPublish() == (yearOfPublish))){
                return dto;

            }

        }
        return new BookDTO[0];


    }

    @Override
    public BookDTO[] getBookByAuthor(String authorName) {
        for (int index = 0; index < dto.length; index++){
            if ((dto[index].getAuthorName().equals(authorName))){
              return dto;

            }

        }
        return new BookDTO[0];

    }

    @Override
    public BookDTO getBookByPublisher(String publisher) {
        BookDTO book1 = null;
        for (int index = 0; index < dto.length; index++){
            if ((dto[index].getPublisher().equals(publisher))){
                book1 = dto[index];

            }

        }
        return book1;

    }

    @Override
    public String getBookNameByBookType(String bookType) {
        String bookName = null;
        for (int index = 0; index < dto.length; index++) {
            if (dto[index].getBookType().equals(bookType)) {
                bookName = dto[index].getBookName();
            }
        }
        return bookName;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        for (int index = 0; index < dto.length; index++) {
            if (dto[index].getBookName().equals(bookName)) {
                price = dto[index].getPrice();
            }
        }

        return price;

    }

    @Override
    public String getBookNamesByYearOfPublish(int yearOfPublish) {
        String bookName = null;
        for (int index = 0; index < dto.length; index++){
            if (dto[index].getBookName() == bookName){
                bookName = dto[index].getBookName();

            }

        }
        return bookName;

    }

    @Override
    public boolean updateBookPagesByBookName(String existingBookName, int updatedBookPages) {
        boolean isBookPagesUpdated = false;
        for (int index = 0; index < dto.length; index++){
            if(dto[index].getBookName().equals(existingBookName)){
                dto[index].setNoOfPages(updatedBookPages);
                isBookPagesUpdated = true;
            }
        }
        return isBookPagesUpdated;

    }

    @Override
    public boolean updateBookPriceByBookId(int bookId, double updatePrice) {
        boolean isPriceUpdated = false;
        for (int index = 0; index < dto.length; index++){
            if(dto[index].getBookName().equals(bookId)){
                dto[index].setPrice(updatePrice);
                isPriceUpdated = true;
            }
        }
        return isPriceUpdated;

    }

    @Override
    public boolean updatePublisherByAuthor(String existingAuthorName, String updatePublisher) {
        boolean isPublisherUpdated = false;
        for (int index = 0; index < dto.length; index++){
            if(dto[index].getBookName().equals(existingAuthorName)){
                dto[index].setPublisher(updatePublisher);
                isPublisherUpdated = true;
            }
        }
        return isPublisherUpdated;
    }
    @Override
    public boolean deleteBookById(int bookId) {
        boolean isBookDeleted =false;

        int newIndex , oldIndex;
        for(oldIndex = 0 , newIndex = 0; oldIndex < dto.length; oldIndex++){
            if(!(dto[oldIndex].getBookId() == bookId)){
                dto[newIndex++] = this.dto[oldIndex];
                isBookDeleted = true;
            }

        }
        dto =  Arrays.copyOf(dto,newIndex);

        return isBookDeleted;
    }

}
