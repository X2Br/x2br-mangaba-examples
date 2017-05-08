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

/**
 *
 * @author Marco Antonio F Carvalho <marcarvalho@gmail.com>
 */
public class BookInStock {

    private Book book;
    private int quantity;

    public BookInStock(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public int addBook() {
        return addBook(1);
    }
    
    public int subtractBook() {
        return subtractBook(1);
    }

    public int addBook(int quantity) {
        this.quantity += quantity;
        return this.quantity;
    }

    public int subtractBook(int quantity) {
        if (this.quantity < quantity) {
            throw new StockOverflowException("Quantity not available in stock");
        }
        this.quantity -= quantity;
        return this.quantity;
    }

}
