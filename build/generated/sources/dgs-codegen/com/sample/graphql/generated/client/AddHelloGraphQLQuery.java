package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.HelloInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AddHelloGraphQLQuery extends GraphQLQuery {
  public AddHelloGraphQLQuery(HelloInput helloInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (helloInput != null || fieldsSet.contains("helloInput")) {
        getInput().put("helloInput", helloInput);
    }
  }

  public AddHelloGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "addHello";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private HelloInput helloInput;

    private String queryName;

    public AddHelloGraphQLQuery build() {
      return new AddHelloGraphQLQuery(helloInput, queryName, fieldsSet);
               
    }

    public Builder helloInput(HelloInput helloInput) {
      this.helloInput = helloInput;
      this.fieldsSet.add("helloInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
