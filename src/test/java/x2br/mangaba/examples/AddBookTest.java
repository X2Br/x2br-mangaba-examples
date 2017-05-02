package x2br.mangaba.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import x2br.mangaba.builders.example.Operator.OperatorEnum;
import x2br.mangaba.annotations.Example;
import x2br.mangaba.annotations.Param;
import x2br.mangaba.builders.ExampleBuilder;
import x2br.mangaba.annotations.Specification;
import x2br.mangaba.runners.MangabaRunner;
import x2br.mangaba.examples.Retangulo;

/**
 *
 * @author userName
 */
@RunWith(MangabaRunner.class)
public class AddBookTest {

    public AddBookTest() {
    }

    @Example
    public static ExampleBuilder example001(ExampleBuilder sb) {

        return sb;
    }

    @Example
    public static ExampleBuilder example002(ExampleBuilder sb) {

        return sb;
    }

    @Specification(name = "Add Book",
            userStory = "As a customer, I want to add books to my shopping cart, so that I can build a list of books I want to buy",
            acceptanceCriteria = "**Do specification description.**")
    public AddBookTest retanguloTest(@Param(name = "base") java.lang.Integer base, @Param(name = "altura") java.lang.Integer altura) {
        return null;
    }

}
