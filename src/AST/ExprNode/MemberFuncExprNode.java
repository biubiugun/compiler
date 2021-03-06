package AST.ExprNode;

import AST.ASTVisitor;
import Util.position;
import java.util.ArrayList;
import AST.DefNode.varDeclarationNode;

public class MemberFuncExprNode extends ExprNode{
    public ExprNode objExpr;
    public String Func_name;
    public ArrayList<ExprNode> paraList;

    public MemberFuncExprNode(position _pos, String _content, ExprNode _objExpr, String _Func_name, ArrayList<ExprNode> _paraList){
        super(_pos,_content);
        objExpr = _objExpr;
        Func_name = _Func_name;
        if(_paraList != null) paraList = _paraList;
    }

    @Override
    public void accept(ASTVisitor visitor){
        visitor.visit(this);
    }
}
