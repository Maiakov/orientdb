/* Generated By:JJTree: Do not edit this line. OParenthesisBlock.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public class OParenthesisBlock extends OBooleanExpression {

  OBooleanExpression subElement;

  public OParenthesisBlock(int id) {
    super(id);
  }

  public OParenthesisBlock(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  public boolean evaluate(OIdentifiable currentRecord) {
    return subElement.evaluate(currentRecord);
  }

  @Override
  public String toString() {
    return "(" + subElement.toString() + ")";
  }
}
/* JavaCC - OriginalChecksum=9a16b6cf7d051382acb94c45067631a9 (do not edit this line) */
