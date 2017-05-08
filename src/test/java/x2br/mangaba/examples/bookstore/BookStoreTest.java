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

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import x2br.mangaba.annotations.Example;
import x2br.mangaba.annotations.Param;
import x2br.mangaba.annotations.Specification;
import x2br.mangaba.annotations.SpecificationDocument;
import x2br.mangaba.builders.ExampleBuilder;
import x2br.mangaba.builders.dsl.html.DocBuilder;
import static x2br.mangaba.builders.dsl.html.DocBuilder.TextDoc.text;
import x2br.mangaba.runners.MangabaRunner;

/**
 *
 * @author Marco Antonio F Carvalho <marcarvalho@gmail.com>
 */
@RunWith(MangabaRunner.class)
public class BookStoreTest {
    
    public BookStoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        BookStore bs = BookStore.getInstane();
        bs.addBookToStock(new Book(1, "The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory", "The Elegant Universe", 10.82D), 5);
        bs.addBookToStock(new Book(2, "The Hidden Reality: Parallel Universes and the Deep Laws of the Cosmos", "The Hidden Reality", 11.61D), 4);
        bs.addBookToStock(new Book(3, "Elegant Universe : Superstrings, Hidden Dimentions, and The Quest for the Ultimate Theory", "Elegant Universe", 3.57D), 4);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @SpecificationDocument
    private static final String specDoc = DocBuilder.start(). //
            p("As a customer, I want to search for a book by title, so that I can find the book I want buy.").
            ul(text().bold("Acceptance Criteria"), "I can search based on an exact title", "I can search based on words within a title").
            asString();
    
    @Example
    public static ExampleBuilder example001(ExampleBuilder sb) {
        sb.startP().
                text("As a customer, when informing the title ").
                param("title", "The Hidden Reality", true).
                text(", I hope the price of the book is ").
                resultProperty("price", true).equalTo("11.61").
                text(".").
                endP();
        return sb;
    }
    
    @Specification(name = "Customer Search Book")
    public Book split(@Param(name = "title") String title) {
        return BookStore.getInstane().findBookByTitle(title);
    }

    /**
     * Test of getInstane method, of class BookStore.
     */
    @Test
    public void testGetInstane() {
        Assert.assertNotNull(BookStore.getInstane());
    }

    /**
     * Test of addBookToStock method, of class BookStore.
     */
    @Test
    public void testAddBookToStock_Book() {
    }

    /**
     * Test of priceBook method, of class BookStore.
     */
    @Test
    public void testPriceBook() {
        double price = BookStore.getInstane().priceBook("The Hidden Reality");
        Assert.assertEquals(11.61D, price, 0.0D);
    }

    /**
     * Test of quantityBookInStok method, of class BookStore.
     */
    @Test
    public void testQuantityBookInStok() {
        int quantity = BookStore.getInstane().quantityBookInStok("The Hidden Reality");
        Assert.assertEquals(4, quantity);
    }

    /**
     * Test of findBookByTitle method, of class BookStore.
     */
    @Test
    public void testFindBookByTitle() {
    }

    /**
     * Test of addBookToStock method, of class BookStore.
     */
    @Test
    public void testAddBookToStock_Book_int() {
    }

    /**
     * Test of subtractBookFromStock method, of class BookStore.
     */
    @Test
    public void testSubtractBookFromStock() {
    }
    
}
