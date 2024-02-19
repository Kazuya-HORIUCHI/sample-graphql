package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OneHelloProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OneHelloProjectionRoot() {
    super(null, null, java.util.Optional.of("Hello"));
  }

  public OneHelloProjectionRoot<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public OneHelloProjectionRoot<PARENT, ROOT> randomNumber() {
    getFields().put("randomNumber", null);
    return this;
  }
}
