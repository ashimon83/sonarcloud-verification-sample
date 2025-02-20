package com.example.demo.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

class BookTest {
    private static final Long ID = 1L;
    private static final String VALID_TITLE = "テスト駆動開発";
    private static final String VALID_AUTHOR = "Kent Beck";
    private static final ISBN VALID_ISBN = new ISBN("9784274217849"); // ハイフンなしの形式を使用
    private static final Price VALID_PRICE = new Price(new BigDecimal("3300"));
    private static final LocalDateTime VALID_CREATED_AT = LocalDateTime.of(2024, 2, 19, 12, 0);

    private Book book;

    /*
    @BeforeEach
    void setUp() {
        book = new Book(ID, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, VALID_PRICE, VALID_CREATED_AT);
    }

    @Test
    void 有効な値でインスタンスが生成される() {
        assertAll(
            () -> assertEquals(ID, book.getId()),
            () -> assertEquals(VALID_TITLE, book.getTitle()),
            () -> assertEquals(VALID_AUTHOR, book.getAuthor()),
            () -> assertEquals(VALID_ISBN, book.getIsbn()),
            () -> assertEquals(VALID_PRICE, book.getPrice()),
            () -> assertEquals(VALID_CREATED_AT, book.getCreatedAt())
        );
    }

    @Test
    void デフォルトコンストラクタで現在時刻が設定される() {
        Book newBook = new Book(ID, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, VALID_PRICE);
        assertNotNull(newBook.getCreatedAt());
    }

    @Test
    void createdAtがnullの場合に例外がスローされる() {
        assertThrows(NullPointerException.class,
            () -> new Book(ID, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, VALID_PRICE, null));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "   "})
    void タイトルが無効な場合に例外がスローされる(String invalidTitle) {
        assertThrows(IllegalArgumentException.class,
            () -> new Book(ID, invalidTitle, VALID_AUTHOR, VALID_ISBN, VALID_PRICE));
    }

    @Test
    void タイトルが長すぎる場合に例外がスローされる() {
        String longTitle = "a".repeat(101);
        assertThrows(IllegalArgumentException.class,
            () -> new Book(ID, longTitle, VALID_AUTHOR, VALID_ISBN, VALID_PRICE));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "   "})
    void 著者名が無効な場合に例外がスローされる(String invalidAuthor) {
        assertThrows(IllegalArgumentException.class,
            () -> new Book(ID, VALID_TITLE, invalidAuthor, VALID_ISBN, VALID_PRICE));
    }

    @Test
    void 著者名が長すぎる場合に例外がスローされる() {
        String longAuthor = "a".repeat(51);
        assertThrows(IllegalArgumentException.class,
            () -> new Book(ID, VALID_TITLE, longAuthor, VALID_ISBN, VALID_PRICE));
    }

    @Test
    void ISBNがnullの場合に例外がスローされる() {
        assertThrows(NullPointerException.class,
            () -> new Book(ID, VALID_TITLE, VALID_AUTHOR, null, VALID_PRICE));
    }

    @Test
    void 価格がnullの場合に例外がスローされる() {
        assertThrows(NullPointerException.class,
            () -> new Book(ID, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, null));
    }

    @Test
    void タイトルが正しく更新される() {
        String newTitle = "リファクタリング";
        book.updateTitle(newTitle);
        assertEquals(newTitle, book.getTitle());
    }

    @Test
    void 著者名が正しく更新される() {
        String newAuthor = "Martin Fowler";
        book.updateAuthor(newAuthor);
        assertEquals(newAuthor, book.getAuthor());
    }

    @Test
    void 価格が正しく更新される() {
        Price newPrice = new Price(new BigDecimal("4400"));
        book.updatePrice(newPrice);
        assertEquals(newPrice, book.getPrice());
    }

    @Test
    void 価格更新時にnullを指定すると例外がスローされる() {
        assertThrows(NullPointerException.class, () -> book.updatePrice(null));
    }

    @Test
    void 同じ値を持つ書籍は等しいと判定される() {
        Book sameBook = new Book(ID, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, VALID_PRICE, VALID_CREATED_AT);
        Book differentBook = new Book(2L, VALID_TITLE, VALID_AUTHOR, VALID_ISBN, VALID_PRICE, VALID_CREATED_AT);

        assertEquals(book, sameBook);
        assertNotEquals(book, differentBook);
        assertEquals(book.hashCode(), sameBook.hashCode());
    }

    @Test
    void nullとの比較で等しくないと判定される() {
        assertNotEquals(null, book);
    }

    @Test
    void 異なる型との比較で等しくないと判定される() {
        assertNotEquals("book", book);
    }
    */
} 