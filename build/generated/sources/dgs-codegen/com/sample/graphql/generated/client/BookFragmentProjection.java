package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class BookFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BookFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Book"));
  }

  public AuthorProjection<BookFragmentProjection<PARENT, ROOT>, ROOT> author() {
     AuthorProjection<BookFragmentProjection<PARENT, ROOT>, ROOT> projection = new AuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public ReleaseHistoryProjection<BookFragmentProjection<PARENT, ROOT>, ROOT> released() {
     ReleaseHistoryProjection<BookFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReleaseHistoryProjection<>(this, getRoot());
     getFields().put("released", projection);
     return projection;
  }

  public BookFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public BookFragmentProjection<PARENT, ROOT> publisher() {
    getFields().put("publisher", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Book {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
