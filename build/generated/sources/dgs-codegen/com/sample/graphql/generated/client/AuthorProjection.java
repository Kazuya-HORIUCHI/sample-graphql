package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AuthorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AuthorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Author"));
  }

  public AddressProjection<AuthorProjection<PARENT, ROOT>, ROOT> addresses() {
     AddressProjection<AuthorProjection<PARENT, ROOT>, ROOT> projection = new AddressProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public AuthorProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AuthorProjection<PARENT, ROOT> originCountry() {
    getFields().put("originCountry", null);
    return this;
  }
}
