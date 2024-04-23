public class LibrarySystem {
	// 변수 정의
	
	// 생성자 정의

	public void addBook(Book book) {
		// 책 추가
		// 도움을 위해 Cart.java의 insertBook(Book book)을 참조하세요
	}
	
	public void removeBook(String title) {
    	// `for` LibrarySystem의 모든 Book
		for ( int i = 0; i < bookCount; i++ ) {

      		// `if` 책 제목이 발견되면
			if ( booklist[i].getTitle().equals(title)) {
				
                // 찾은 책부터 시작하여 모든 요소를 왼쪽으로 이동합니다.
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
        
				// 마지막 요소를 null로 설정하고 bookCount를 줄입니다.
				booklist[--bookCount] = null;
				System.out.println("라이브러리에서 '" + title + "' 삭제했습니다.");
        
				return;
			}
		}

		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void borrowBook(String title) {
		for ( int i = 0; i < bookCount; i++ ){

            // `if` 책 제목이 발견되면 {
			if ( booklist[i].getTitle().equals(title)) {	
                // `if` 책이 있다면 {
				if ( !booklist[i].isAvailable()) {
					return false;
				} else { System.out.println("책을 찾았습니다");
				
					
				}
			}
			return;
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}

	
	public void returnBook(String title) {
		for ( int i = 0; i < bookCount; i++ ){
			if ( booklist[i].getTitle().equals(title)) {	
				if ( !booklist[i].isAvailable()) {
					return true;
				} else { System.out.println("책을 찾았습니다");
				
					
				}
			}
			return;
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void displayAllBooks() {
		Systen.out.println("ISBN1234 | JSP 웹 프로그래밍 | 송미영", 2018);
		Systen.out.println("ISBN1235 | 안드로이드 프로그래밍 | 우재남", 2022);
		Systen.out.println("ISBN1236 | 스크래치 프로그래밍 | 고광일", 2019);
		Systen.out.println("ISBN1237 | JAVA 마스터 | 송미영", 2023);
    }

}
