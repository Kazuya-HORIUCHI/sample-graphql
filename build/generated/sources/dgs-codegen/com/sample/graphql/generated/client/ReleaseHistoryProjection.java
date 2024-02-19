package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReleaseHistoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReleaseHistoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReleaseHistory"));
  }

  public ReleaseHistoryProjection<PARENT, ROOT> year() {
    getFields().put("year", null);
    return this;
  }

  public ReleaseHistoryProjection<PARENT, ROOT> printedEdition() {
    getFields().put("printedEdition", null);
    return this;
  }

  public ReleaseHistoryProjection<PARENT, ROOT> releasedCountry() {
    getFields().put("releasedCountry", null);
    return this;
  }
}
