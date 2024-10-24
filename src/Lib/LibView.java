package Lib;

import java.util.Scanner;

public class LibView {
    private Scanner scan = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("=== Library Menu ===");
        System.out.println("1. 도서 정보 추가");
        System.out.println("2. 도서 정보 조회");
        System.out.println("3. 도서 정보 수정");
        System.out.println("4. 도서 정보 삭제");
        System.out.println("5. 나가기");
        System.out.println("====================");
        System.out.print("메뉴 선택(숫자 입력): ");
        return scan.nextInt();
    }

    public BookDTO inputBook() {
        System.out.print("ISBN 입력: ");
        String isbn = scan.next();
        System.out.print("도서명 입력: ");
        String bookName = scan.next();
        System.out.print("저자명 입력: ");
        String author = scan.next();
        System.out.print("출판사 입력: ");
        String publisher = scan.next();
        System.out.print("가격 입력: ");
        int price = scan.nextInt();
        return new BookDTO(isbn, bookName, author, publisher, price);
    }

    public void displayBook(BookDTO book) {
        System.out.println(book.toString());
    }

    public int inputBookIndex() {
        System.out.print("도서의 인덱스 번호를 입력하세요: ");
        return scan.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}