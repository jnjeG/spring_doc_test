package examples;

import java.beans.ConstructorProperties;

public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years1;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer1;

    @ConstructorProperties({"bbbb","aaaa"})
    public ExampleBean(int aaa, String bbb) {
        this.years1 = aaa;
        this.ultimateAnswer1 = bbb;
    }

}