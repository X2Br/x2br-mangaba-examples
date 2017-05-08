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
public class Book {
    private int id;
    private String title;
    private double price;
    private String shortTitle;



    public Book(int id, String title, String shortTitle, double price) {
        this.id = id;
        this.title = title;
        this.shortTitle=shortTitle;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
    
    
    
}
