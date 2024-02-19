package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ItemSearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ItemSearchProjectionRoot() {
    super(null, null, java.util.Optional.of("SearchableItem"));
  }

  public UserProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> author(
      ) {
    UserProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public ItemSearchProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ItemSearchProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ItemSearchProjectionRoot<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ItemSearchProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemFragmentProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> onProblem(
      ) {
    ProblemFragmentProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> fragment = new ProblemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SolutionFragmentProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> onSolution(
      ) {
    SolutionFragmentProjection<ItemSearchProjectionRoot<PARENT, ROOT>, ItemSearchProjectionRoot<PARENT, ROOT>> fragment = new SolutionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
