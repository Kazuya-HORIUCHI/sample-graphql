package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProblemDetailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProblemDetailProjectionRoot() {
    super(null, null, java.util.Optional.of("Problem"));
  }

  public UserProjection<ProblemDetailProjectionRoot<PARENT, ROOT>, ProblemDetailProjectionRoot<PARENT, ROOT>> author(
      ) {
    UserProjection<ProblemDetailProjectionRoot<PARENT, ROOT>, ProblemDetailProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public SolutionProjection<ProblemDetailProjectionRoot<PARENT, ROOT>, ProblemDetailProjectionRoot<PARENT, ROOT>> solutions(
      ) {
    SolutionProjection<ProblemDetailProjectionRoot<PARENT, ROOT>, ProblemDetailProjectionRoot<PARENT, ROOT>> projection = new SolutionProjection<>(this, this);    
    getFields().put("solutions", projection);
    return projection;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProblemDetailProjectionRoot<PARENT, ROOT> solutionCount() {
    getFields().put("solutionCount", null);
    return this;
  }
}
