package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AllHellosProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AllHellosProjectionRoot() {
    super(null, null, java.util.Optional.of("Hello"));
  }

  public AllHellosProjectionRoot<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public AllHellosProjectionRoot<PARENT, ROOT> randomNumber() {
    getFields().put("randomNumber", null);
    return this;
  }
}
