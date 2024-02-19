package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.PetFilter;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class PetsGraphQLQuery extends GraphQLQuery {
  public PetsGraphQLQuery(PetFilter petFilter, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (petFilter != null || fieldsSet.contains("petFilter")) {
        getInput().put("petFilter", petFilter);
    }
  }

  public PetsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "pets";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PetFilter petFilter;

    private String queryName;

    public PetsGraphQLQuery build() {
      return new PetsGraphQLQuery(petFilter, queryName, fieldsSet);
               
    }

    public Builder petFilter(PetFilter petFilter) {
      this.petFilter = petFilter;
      this.fieldsSet.add("petFilter");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
