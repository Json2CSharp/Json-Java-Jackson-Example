package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("Test") 
    public Test test;
    @JsonProperty("Test2") 
    public Test2 test2;
}
