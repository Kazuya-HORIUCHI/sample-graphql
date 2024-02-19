package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Address"));
  }

  public AddressProjection<PARENT, ROOT> street() {
    getFields().put("street", null);
    return this;
  }

  public AddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public AddressProjection<PARENT, ROOT> zipCode() {
    getFields().put("zipCode", null);
    return this;
  }

  public AddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }
}
