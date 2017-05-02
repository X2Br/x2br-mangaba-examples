package x2br.mangaba.examples;

import org.junit.runner.RunWith;
import x2br.mangaba.annotations.Example;
import x2br.mangaba.annotations.Param;
import x2br.mangaba.builders.ExampleBuilder;
import x2br.mangaba.annotations.Specification;
import x2br.mangaba.runners.MangabaRunner;

/**
 *
 * @author userName
 */
@RunWith(MangabaRunner.class)
public class SplittingNamesTest {

    public SplittingNamesTest() {
    }

    @Example
    public static ExampleBuilder example001(ExampleBuilder sb) {
                 sb.startP().text("The full name ").param("fullName", "Jane Smith",true).text(" is broken into first name ").
                 resultProperty("firstName").equalTo("Jane").text(" and last name ").resultProperty("lastName").equalTo("Smith").endP().
                         newLine().addList("item 1","item2","item3");
        return sb;
    }

    @Example
    public static ExampleBuilder example002(ExampleBuilder sb) {
        sb.eachRowAsAnExampleInTable("Each row as an example").withHeader().addColummInputName("fullName").
                addColummResultPropertyName("firstName").addColummResultPropertyName("lastName").endHeader().
                addRow("Jane Smith","Jane","Smith").
                addRow("David Peterson","David","Peterson1");

        return sb;
    }

    @Specification(name = "Splitting Names",
            userStory = "",
            acceptanceCriteria = "To help personalise our mailshots we want to have the first name and last name of the customer. "
            + "Unfortunately the customer data that we are supplied only contains full names."
            + "<p></p>"
            + "The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.")
    public SplittingNames split(@Param(name = "fullName") String fullName) {
        return new SplittingNames(fullName);
    }

}
