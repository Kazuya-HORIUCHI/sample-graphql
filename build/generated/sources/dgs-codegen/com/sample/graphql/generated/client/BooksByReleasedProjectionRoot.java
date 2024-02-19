package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BooksByReleasedProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BooksByReleasedProjectionRoot() {
    super(null, null, java.util.Optional.of("Book"));
  }

  public AuthorProjection<BooksByReleasedProjectionRoot<PARENT, ROOT>, BooksByReleasedProjectionRoot<PARENT, ROOT>> author(
      ) {
    AuthorProjection<BooksByReleasedProjectionRoot<PARENT, ROOT>, BooksByReleasedProjectionRoot<PARENT, ROOT>> projection = new AuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public ReleaseHistoryProjection<BooksByReleasedProjectionRoot<PARENT, ROOT>, BooksByReleasedProjectionRoot<PARENT, ROOT>> released(
      ) {
    ReleaseHistoryProjection<BooksByReleasedProjectionRoot<PARENT, ROOT>, BooksByReleasedProjectionRoot<PARENT, ROOT>> projection = new ReleaseHistoryProjection<>(this, this);    
    getFields().put("released", projection);
    return projection;
  }

  public BooksByReleasedProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public BooksByReleasedProjectionRoot<PARENT, ROOT> publisher() {
    getFields().put("publisher", null);
    return this;
  }
}
