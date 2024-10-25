package Lib;

import java.util.ArrayList;

public class LibController {
    private ArrayList<BookDTO> bookList = new ArrayList<>();
    private LibView view = new LibView();

    public LibController() {
        // 10권의 초기 도서(2024 베스트셀러를 넣음)
        bookList.add(new BookDTO("1-123", "마흔에 읽는 쇼펜하우어", "강용수", "유노북스", 13800));
        bookList.add(new BookDTO("1-234", "도둑맞은 집중력", "요한 하리", "어크로스", 16900));
        bookList.add(new BookDTO("1-345", "생각이 너무 많은 어른들을 위한 심리학", "김혜남", "메이븐", 16000));
        bookList.add(new BookDTO("1-456", "나는 메트로폴리탄 미술관의 경비원입니다", "패트릭 브링리", "웅진지식하우스", 15750));
        bookList.add(new BookDTO("1-567", "이처럼 사소한 것들", "클레어 키건", "다산책방", 12400));
        bookList.add(new BookDTO("1-678", "모순", "양귀자", "쓰다", 11700));
        bookList.add(new BookDTO("1-789", "인간 실격", "다자이 오사무", "민음사", 8100));
        bookList.add(new BookDTO("1-891", "데미안", "헤르만 헤세", "민음사", 7200));
        bookList.add(new BookDTO("1-912", "참을 수 없는 존재의 가벼움", "밀란 쿤데라", "민음사", 15300));
        bookList.add(new BookDTO("2-123", "시한부", "백은별", "바른북스", 15100));
    }

    public void start() {
        boolean running = true;

        while (running) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    running = false;
                    view.displayMessage("시스템을 종료합니다.");
                    break;
                default:
                    view.displayMessage("메뉴를 다시 입력하세요.");
            }
        }
    }

    private void addBook() {
        if (bookList.size() < 15) {
            BookDTO book = view.inputBook();
            bookList.add(book);
            view.displayMessage("새 도서가 추가되었습니다.");
        } else {
            view.displayMessage("새 도서를 넣을 공간이 부족합니다.");
        }
    }

    private void viewBooks() {
        if (bookList.isEmpty()) {
            view.displayMessage("해당 도서는 존재하지 않습니다.");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.print((i + 1) + ". ");
                view.displayBook(bookList.get(i));
            }
        }
    }

    private void updateBook() {
        if (!bookList.isEmpty()) {
            int index = view.inputBookIndex() - 1;
            if (index >= 0 && index < bookList.size()) {
                BookDTO updatedBook = view.inputBook();
                bookList.set(index, updatedBook);
                view.displayMessage("도서정보가 변경되었습니다.");
            } else {
                view.displayMessage("도서정보를 다시 입력해주세요.");
            }
        } else {
            view.displayMessage("해당 도서는 존재하지 않습니다..");
        }
    }

    private void deleteBook() {
        if (!bookList.isEmpty()) {
            int index = view.inputBookIndex() - 1;
            if (index >= 0 && index < bookList.size()) {
                bookList.remove(index);
                view.displayMessage("도서가 삭제되었습니다.");
            } else {
                view.displayMessage("도서정보를 다시 입력해주세요.");
            }
        } else {
            view.displayMessage("해당 도서는 존재하지 않습니다.");
        }
    }
}
