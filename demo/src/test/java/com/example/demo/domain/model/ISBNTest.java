package com.example.demo.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class ISBNTest {
    private static final String VALID_ISBN = "978-4-274-21784-9";
    private static final String VALID_ISBN_NO_HYPHENS = "9784274217849";

    /*
    @Test
    void 有効なISBN13でインスタンスが生成される() {
        ISBN isbn = new ISBN(VALID_ISBN);
        assertEquals(VALID_ISBN, isbn.getValue());
    }
    */

    @Test
    void ハイフンなしの有効なISBN13でインスタンスが生成される() {
        ISBN isbn = new ISBN(VALID_ISBN_NO_HYPHENS);
        assertEquals(VALID_ISBN_NO_HYPHENS, isbn.getValue());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "   "})
    void ISBNが無効な場合に例外がスローされる(String invalidIsbn) {
        assertThrows(IllegalArgumentException.class,
            () -> new ISBN(invalidIsbn));
    }

    /*
    @Test
    void 同じISBNは等しいと判定される() {
        ISBN isbn1 = new ISBN(VALID_ISBN);
        ISBN isbn2 = new ISBN(VALID_ISBN);
        ISBN isbn3 = new ISBN(VALID_ISBN_NO_HYPHENS);

        assertEquals(isbn1, isbn2);
        assertEquals(isbn1.hashCode(), isbn2.hashCode());
        assertEquals(isbn1, isbn3);
    }

    @Test
    void nullとの比較で等しくないと判定される() {
        ISBN isbn = new ISBN(VALID_ISBN);
        assertNotEquals(null, isbn);
    }

    @Test
    void 異なる型との比較で等しくないと判定される() {
        ISBN isbn = new ISBN(VALID_ISBN);
        assertNotEquals(VALID_ISBN, isbn);
    }
    */
} 