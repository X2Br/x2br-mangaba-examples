package x2br.mangaba.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
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
public class RetanguloTest {

    public RetanguloTest() {
    }

    
    @Example
    public static ExampleBuilder example001(ExampleBuilder sb) {

        return sb;
    }
    
    @Example
    public static ExampleBuilder example002(ExampleBuilder sb) {

        return sb;
    }
    
    
    @Specification(name = "teste", acceptanceCriteria = "**Do specification description.**")
public RetanguloTest retanguloTest(@Param(name = "base") java.lang.Integer base, @Param(name = "altura") java.lang.Integer altura) {
		return null;
}

    
}