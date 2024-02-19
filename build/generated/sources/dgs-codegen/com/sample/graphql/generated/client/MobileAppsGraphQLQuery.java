package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.MobileAppFilter;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class MobileAppsGraphQLQuery extends GraphQLQuery {
  public MobileAppsGraphQLQuery(MobileAppFilter mobileAppFilter, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (mobileAppFilter != null || fieldsSet.contains("mobileAppFilter")) {
        getInput().put("mobileAppFilter", mobileAppFilter);
    }
  }

  public MobileAppsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "mobileApps";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MobileAppFilter mobileAppFilter;

    private String queryName;

    public MobileAppsGraphQLQuery build() {
      return new MobileAppsGraphQLQuery(mobileAppFilter, queryName, fieldsSet);
               
    }

    public Builder mobileAppFilter(MobileAppFilter mobileAppFilter) {
      this.mobileAppFilter = mobileAppFilter;
      this.fieldsSet.add("mobileAppFilter");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
