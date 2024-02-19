package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class SmartSearchGraphQLQuery extends GraphQLQuery {
  public SmartSearchGraphQLQuery(String keyword, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (keyword != null || fieldsSet.contains("keyword")) {
        getInput().put("keyword", keyword);
    }
  }

  public SmartSearchGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "smartSearch";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String keyword;

    private String queryName;

    public SmartSearchGraphQLQuery build() {
      return new SmartSearchGraphQLQuery(keyword, queryName, fieldsSet);
               
    }

    public Builder keyword(String keyword) {
      this.keyword = keyword;
      this.fieldsSet.add("keyword");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
