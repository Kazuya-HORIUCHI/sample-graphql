package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.SearchItemFilter;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ItemSearchGraphQLQuery extends GraphQLQuery {
  public ItemSearchGraphQLQuery(SearchItemFilter filter, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (filter != null || fieldsSet.contains("filter")) {
        getInput().put("filter", filter);
    }
  }

  public ItemSearchGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "itemSearch";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SearchItemFilter filter;

    private String queryName;

    public ItemSearchGraphQLQuery build() {
      return new ItemSearchGraphQLQuery(filter, queryName, fieldsSet);
               
    }

    public Builder filter(SearchItemFilter filter) {
      this.filter = filter;
      this.fieldsSet.add("filter");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
