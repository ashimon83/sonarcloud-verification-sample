package com.example.demo.domain.model;

import java.util.Objects;

public class ISBN {
    private final String value;

    public ISBN(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("不正なISBN形式です");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private static String normalize(String isbn) {
        if (isbn == null) {
            return null;
        }
        return isbn.replaceAll("-", "");
    }

    private static boolean isValid(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }
        
        // ISBN-13形式（ハイフンあり）のパターン
        String isbn13Pattern = "\\d{3}-\\d-\\d{4}-\\d{4}-\\d";
        
        // ISBN-13形式（ハイフンなし）のパターン
        String isbn13WithoutHyphenPattern = "\\d{13}";
        
        // 正規化したISBNが13桁の数字であることを確認
        String normalizedIsbn = normalize(isbn);
        
        return isbn.matches(isbn13Pattern) || normalizedIsbn.matches(isbn13WithoutHyphenPattern);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ISBN isbn = (ISBN) o;
        return Objects.equals(normalize(value), normalize(isbn.value));
    }

    @Override
    public int hashCode() {
        return Objects.hash(normalize(value));
    }
} 