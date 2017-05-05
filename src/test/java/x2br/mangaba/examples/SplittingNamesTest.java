package x2br.mangaba.examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import x2br.mangaba.annotations.Example;
import x2br.mangaba.annotations.Param;
import x2br.mangaba.builders.ExampleBuilder;
import x2br.mangaba.annotations.Specification;
import x2br.mangaba.annotations.SpecificationDocument;
import x2br.mangaba.builders.dsl.html.DocBuilder;
import x2br.mangaba.runners.MangabaRunner;

/**
 *
 * @author userName
 */
@RunWith(MangabaRunner.class)
public class SplittingNamesTest {

    public SplittingNamesTest() {
        
    }

    @SpecificationDocument
    private static final String specDoc = DocBuilder.start(). //
            startP("To help personalise our mailshots we want to have the first name and last name of the customer. ").
            text("Unfortunately the customer data that we are supplied only contains full names.").endP().
            startP("The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.").endP().
            asString();

    @Example
    public static ExampleBuilder example001(ExampleBuilder sb) {
        sb.startP().
                text("The full name ").
                param("fullName", "Jane Smith", true).
                text(" is broken into first name ").
               resultProperty("firstName", true).equalTo("Jane").
                text(" and last name ").
                resultProperty("lastName", true).equalTo("Smith").
                endP();
        return sb;
    }

    @Example
    public static ExampleBuilder example002(ExampleBuilder sb) {
        sb.withExamplesInTable("Each row as an example").
                startHeader().
                addColummInputName("fullName").
                addColummResultPropertyName("firstName").
                addColummResultPropertyName("lastName").
                endHeader().
                addRow("Jane Smith", "Jane", "Smith").
                addRow("David Peterson", "David", "Peterson1");

        return sb;
    }

    @Specification(name = "Splitting Names")
    public SplittingNames split(@Param(name = "fullName") String fullName) {
        return new SplittingNames(fullName);
    }

    @Test
    public void testeSpecDocAnnotation() {
        Assert.assertTrue(true);
        Assert.assertEquals("Pedro", "Paulo");
    }

}
