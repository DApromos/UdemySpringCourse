package en.abramovskyi.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("We take a book from UniLibrary");
        System.out.println("------------------------------------------------------");
    }


//    public void getBook(Book book){
//        System.out.println("We take a book from UniLibrary: " + book.getName());
//    }

    public void returnBook(){
        System.out.println("We return book");
    }

    public void getMagazine(){
        System.out.println("We take a magazine from UniLibrary");
        System.out.println("------------------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine in UniLibrary");
        System.out.println("------------------------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add book in UniLibrary");
        System.out.println("------------------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine in UniLibrary");
        System.out.println("------------------------------------------------------");
    }

}
