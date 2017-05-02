/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x2br.mangaba.examples;

/**
 *
 * @author Marco Antonio F Carvalho <marcarvalho@gmail.com>
 */
public class SplittingNames {
    
        private final String firstName;
        private final String lastName;

        public SplittingNames(String name) {
            String names[] = name.split(" ");
            this.firstName = names[0];
            this.lastName = names[1];
        }


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

}
