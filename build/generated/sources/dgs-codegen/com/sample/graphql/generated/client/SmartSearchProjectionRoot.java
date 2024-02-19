package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SmartSearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SmartSearchProjectionRoot() {
    super(null, null, java.util.Optional.of("SmartSearchResult"));
  }

  public HelloFragmentProjection<SmartSearchProjectionRoot<PARENT, ROOT>, SmartSearchProjectionRoot<PARENT, ROOT>> onHello(
      ) {
    HelloFragmentProjection<SmartSearchProjectionRoot<PARENT, ROOT>, SmartSearchProjectionRoot<PARENT, ROOT>> fragment = new HelloFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BookFragmentProjection<SmartSearchProjectionRoot<PARENT, ROOT>, SmartSearchProjectionRoot<PARENT, ROOT>> onBook(
      ) {
    BookFragmentProjection<SmartSearchProjectionRoot<PARENT, ROOT>, SmartSearchProjectionRoot<PARENT, ROOT>> fragment = new BookFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
