package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class BooksGraphQLQuery extends GraphQLQuery {
  public BooksGraphQLQuery(String author, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (author != null || fieldsSet.contains("author")) {
        getInput().put("author", author);
    }
  }

  public BooksGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "books";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String author;

    private String queryName;

    public BooksGraphQLQuery build() {
      return new BooksGraphQLQuery(author, queryName, fieldsSet);
               
    }

    public Builder author(String author) {
      this.author = author;
      this.fieldsSet.add("author");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
