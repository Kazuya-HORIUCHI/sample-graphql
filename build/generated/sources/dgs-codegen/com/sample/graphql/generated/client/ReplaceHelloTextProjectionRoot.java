package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReplaceHelloTextProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReplaceHelloTextProjectionRoot() {
    super(null, null, java.util.Optional.of("Hello"));
  }

  public ReplaceHelloTextProjectionRoot<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public ReplaceHelloTextProjectionRoot<PARENT, ROOT> randomNumber() {
    getFields().put("randomNumber", null);
    return this;
  }
}
