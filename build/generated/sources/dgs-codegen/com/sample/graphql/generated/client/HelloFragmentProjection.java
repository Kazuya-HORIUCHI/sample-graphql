package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class HelloFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public HelloFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Hello"));
  }

  public HelloFragmentProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public HelloFragmentProjection<PARENT, ROOT> randomNumber() {
    getFields().put("randomNumber", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Hello {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
