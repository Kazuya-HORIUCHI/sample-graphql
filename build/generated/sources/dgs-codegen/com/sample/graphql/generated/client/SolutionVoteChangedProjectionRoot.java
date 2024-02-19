package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SolutionVoteChangedProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SolutionVoteChangedProjectionRoot() {
    super(null, null, java.util.Optional.of("Solution"));
  }

  public SolutionCategoryProjection<SolutionVoteChangedProjectionRoot<PARENT, ROOT>, SolutionVoteChangedProjectionRoot<PARENT, ROOT>> category(
      ) {
    SolutionCategoryProjection<SolutionVoteChangedProjectionRoot<PARENT, ROOT>, SolutionVoteChangedProjectionRoot<PARENT, ROOT>> projection = new SolutionCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public UserProjection<SolutionVoteChangedProjectionRoot<PARENT, ROOT>, SolutionVoteChangedProjectionRoot<PARENT, ROOT>> author(
      ) {
    UserProjection<SolutionVoteChangedProjectionRoot<PARENT, ROOT>, SolutionVoteChangedProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> voteAsGoodCount() {
    getFields().put("voteAsGoodCount", null);
    return this;
  }

  public SolutionVoteChangedProjectionRoot<PARENT, ROOT> voteAsBadCount() {
    getFields().put("voteAsBadCount", null);
    return this;
  }
}
