package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SolutionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SolutionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Solution"));
  }

  public SolutionCategoryProjection<SolutionProjection<PARENT, ROOT>, ROOT> category() {
     SolutionCategoryProjection<SolutionProjection<PARENT, ROOT>, ROOT> projection = new SolutionCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public UserProjection<SolutionProjection<PARENT, ROOT>, ROOT> author() {
     UserProjection<SolutionProjection<PARENT, ROOT>, ROOT> projection = new UserProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public SolutionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SolutionProjection<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public SolutionProjection<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public SolutionProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public SolutionProjection<PARENT, ROOT> voteAsGoodCount() {
    getFields().put("voteAsGoodCount", null);
    return this;
  }

  public SolutionProjection<PARENT, ROOT> voteAsBadCount() {
    getFields().put("voteAsBadCount", null);
    return this;
  }
}
