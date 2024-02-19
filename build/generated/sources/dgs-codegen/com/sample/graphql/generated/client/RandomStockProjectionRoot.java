package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RandomStockProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RandomStockProjectionRoot() {
    super(null, null, java.util.Optional.of("Stock"));
  }

  public RandomStockProjectionRoot<PARENT, ROOT> symbol() {
    getFields().put("symbol", null);
    return this;
  }

  public RandomStockProjectionRoot<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public RandomStockProjectionRoot<PARENT, ROOT> lastTradeDateTime() {
    getFields().put("lastTradeDateTime", null);
    return this;
  }
}
