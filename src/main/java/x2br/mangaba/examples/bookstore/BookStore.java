/*
 * Copyright 2017 Marco Antonio F Carvalho <marcarvalho@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x2br.mangaba.examples.bookstore;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marco Antonio F Carvalho <marcarvalho@gmail.com>
 */
public class BookStore {

    private final Map<String, BookInStock> bookStock;
    private static BookStore instance;

    private BookStore() {
        bookStock = new HashMap<>();
    }

    public static BookStore getInstane() {
        if (instance == null) {
            instance = new BookStore();
        }
        return instance;
    }

    public int addBookToStock(Book book) {
        return addBookToStock(book, 1);
    }
    
    public double priceBook(String title) {
        if (bookStock.containsKey(title)) {
            return bookStock.get(title).getBook().getPrice();
        }
        throw new BookNotFoundException("Book no exists in Bookstore.");
    }    

    public int quantityBookInStok(String title) {
        if (bookStock.containsKey(title)) {
            return bookStock.get(title).getQuantity();
        }
        throw new BookNotFoundException("Book no exists in Bookstore.");
    }

    public Book findBookByTitle(String title) {
        if (bookStock.containsKey(title)) {
            return bookStock.get(title).getBook();
        }
        throw new BookNotFoundException("Book no exists in Bookstore.");
    }

    public int addBookToStock(Book book, int quantity) {
        BookInStock bookInStock;
        if (!bookStock.containsKey(book.getShortTitle())) {
            bookInStock = new BookInStock(book, quantity);
            bookStock.put(book.getShortTitle(), bookInStock);
        } else {
            bookInStock = bookStock.get(book.getShortTitle());
            bookInStock.addBook(quantity);
        }
        return bookInStock.getQuantity();
    }

    public int subtractBookFromStock(Book book, int quantity) {
        BookInStock bookInStock;
        if (!bookStock.containsKey(book.getShortTitle())) {
            throw new BookNotFoundException("Book no exists in Bookstore.");
        } else {
            bookInStock = bookStock.get(book.getShortTitle());
            bookInStock.subtractBook(quantity);
        }
        return bookInStock.getQuantity();
    }

}
