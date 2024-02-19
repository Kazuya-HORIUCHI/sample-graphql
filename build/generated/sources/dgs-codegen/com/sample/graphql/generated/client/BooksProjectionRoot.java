package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BooksProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BooksProjectionRoot() {
    super(null, null, java.util.Optional.of("Book"));
  }

  public AuthorProjection<BooksProjectionRoot<PARENT, ROOT>, BooksProjectionRoot<PARENT, ROOT>> author(
      ) {
    AuthorProjection<BooksProjectionRoot<PARENT, ROOT>, BooksProjectionRoot<PARENT, ROOT>> projection = new AuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public ReleaseHistoryProjection<BooksProjectionRoot<PARENT, ROOT>, BooksProjectionRoot<PARENT, ROOT>> released(
      ) {
    ReleaseHistoryProjection<BooksProjectionRoot<PARENT, ROOT>, BooksProjectionRoot<PARENT, ROOT>> projection = new ReleaseHistoryProjection<>(this, this);    
    getFields().put("released", projection);
    return projection;
  }

  public BooksProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public BooksProjectionRoot<PARENT, ROOT> publisher() {
    getFields().put("publisher", null);
    return this;
  }
}
