/* Generated By:JJTree: Do not edit this line. ASTtermList.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTtermList extends SimpleNode {
  public ASTtermList(int id) {
    super(id);
  }

  public ASTtermList(SparcTranslator p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SparcTranslatorVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
  public String toString() {
	  String result="";
	  for(int i=0;i<this.jjtGetNumChildren();i++) {
		if(i!=0) {
			result +=",";
		}
		result+=((SimpleNode)(this.jjtGetChild(i))).toString();
	  }
	  return result;
  }
 
}
/* JavaCC - OriginalChecksum=65d242cac7f5ef3776e6245c7c5a1256 (do not edit this line) */
