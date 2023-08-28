package com.xworkz.library;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.xworkz.library.books.BookDTO;
import com.xworkz.library.constant.BookType;
import com.xworkz.library.impl.Library;
import com.xworkz.library.impl.PublicLibraryImpl;

import java.util.Scanner;

public class BookDTOTester {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("number of books are:");
            int size = sc.nextInt();
            //int size = sc.nextInt();
            Library lib = new PublicLibraryImpl(size);
            for (int index = 0; index < size; index++) {
                BookDTO dto = new BookDTO();

//                System.out.println(("Enter the Book Id"));
//                dto.setBookId(sc.nextInt());
                System.out.println(("Enter the Book Name"));
                dto.setBookName(sc.next());
                System.out.println("Enter the author Name");
                dto.setAuthorName(sc.next());
                System.out.println("Enter the book publsiher");
                dto.setPublisher(sc.next());
                System.out.println("Enter the year of publish");
                dto.setYearOfPublish(sc.nextInt());
                System.out.println("Enter the no of pages");
                dto.setNoOfPages(sc.nextInt());
                System.out.println("Enter the book price");
                dto.setPrice(sc.nextDouble());

                System.out.println("Enter the Book Type");
                dto.setBookType(BookType.valueOf(sc.next()));
                lib.addBooks(dto);
            }
            String userInput = null;
            do {
                System.out.println("Press 1 : To get all the books");
                System.out.println("Press 2 : To  get Book By Id");
                System.out.println("Press 3 : To get Book By Year ");
                System.out.println("Press 4 : To get Book By Author ");
                System.out.println("Press 5 : To get Book By Publisher");
                System.out.println("Press 6 : To  get Book Name By Book Type");
                System.out.println("Press 7 : To get Book Price By Book Name");
                System.out.println("Press 8 : To get Book Names By Year Of Publish ");
                System.out.println("Press 9 : To update Book Pages By Book Name");
                System.out.println("Press 10 : To update Book Price By BookId");
                System.out.println("Press 11 : To update Publisher By Author");
                System.out.println("Press 12 : To delete Book By bookId");


                int options = sc.nextInt();
                switch (options) {
                    case 1:
                        lib.getAllBooks();
                        break;
                    case 2:
                        System.out.println("To get BookName By Id");
                       BookDTO bookName  = lib.getBookById(sc.nextInt());
                        System.out.println(bookName);
                        break;
                    case 3:
                        System.out.println("get Book By Year");
                        BookDTO[] books = lib.getBookByYear(sc.nextInt());
                        for (int i =0 ; i<books.length; i++){
                            System.out.println(books[i].getBookName());
                            System.out.println(books[i].getBookId());
                            System.out.println(books[i].getPrice());
                           // System.out.println(books[i].getBookType());
                        }

                        break;
                    case 4:
                        System.out.println("get Book By Author");
                        BookDTO[] bookName1 = lib.getBookByAuthor(sc.next());
                        for (int i =0 ; i<bookName1.length; i++) {
                            System.out.println(bookName1[i].getBookName());
                            System.out.println(bookName1[i].getBookId());
                            System.out.println(bookName1[i].getPrice());
                          //  System.out.println(bookName1);

                        }
                        break;

                    case 5:
                        System.out.println("get Book By Publisher");
                        BookDTO bookName2 = lib.getBookByPublisher(sc.next());
                        System.out.println(bookName2);
                        break;
                    case 6 :
                        System.out.println("get Book Name By Book Type");
                        String bookName3 = lib.getBookNameByBookType(sc.next());
                        System.out.println(bookName3);
                        break;
                    case 7:
                        System.out.println("get Book Price By Book Name");
                        double price = lib.getBookPriceByBookName(sc.next());
                        System.out.println(price);
                        break;
                    case 8:
                        System.out.println("get BookNames By YearOfPublish");
                        String bookName4 = lib.getBookNamesByYearOfPublish(sc.nextInt());
                        System.out.println(bookName4);
                        break;
                    case 9:
                        System.out.println("update BookPages By BookName");
                        boolean isBookPagesUpdated = lib.updateBookPagesByBookName(sc.next(), sc.nextInt());
                        System.out.println("updated");
                        System.out.println(isBookPagesUpdated);
                        lib.getAllBooks();
                        break;
                    case 10:
                        System.out.println("update BookPrice By BookId");
                        boolean isPriceUpdated = lib.updateBookPriceByBookId(sc.nextInt() , sc.nextInt());
                        System.out.println("updated");
                        System.out.println(isPriceUpdated);
                        lib.getAllBooks();
                        break;
                    case 11:
                        System.out.println("update Publisher By Author");
                        boolean isPublisherUpdated = lib.updatePublisherByAuthor(sc.next() , sc.next());
                        System.out.println("updated");
                        System.out.println(isPublisherUpdated);
                        lib.getAllBooks();
                        break;
                    case 12:
                        System.out.println("delete Book By Id");
                        boolean isBookDeleted = lib.deleteBookById(sc.nextInt());
                        System.out.println(isBookDeleted);
                        lib.getAllBooks();
                        break;
                }
                System.out.println("Do you want to continue yes/no");
                userInput = sc.next();
            }while (userInput.equals("yes"));
            System.out.println("Thank you!");


        }
}
