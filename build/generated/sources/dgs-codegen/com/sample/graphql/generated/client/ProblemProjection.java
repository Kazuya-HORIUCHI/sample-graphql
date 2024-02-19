package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProblemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProblemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Problem"));
  }

  public UserProjection<ProblemProjection<PARENT, ROOT>, ROOT> author() {
     UserProjection<ProblemProjection<PARENT, ROOT>, ROOT> projection = new UserProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public SolutionProjection<ProblemProjection<PARENT, ROOT>, ROOT> solutions() {
     SolutionProjection<ProblemProjection<PARENT, ROOT>, ROOT> projection = new SolutionProjection<>(this, getRoot());
     getFields().put("solutions", projection);
     return projection;
  }

  public ProblemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProblemProjection<PARENT, ROOT> solutionCount() {
    getFields().put("solutionCount", null);
    return this;
  }
}
