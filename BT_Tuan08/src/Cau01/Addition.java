package Cau01;

public class Addition extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Expression left(){
        return left;
    }

    public Expression right() {
        return right;
    }

    public Addition(Expression ex1, Expression ex2) {
        left=ex1;
        right=ex2;
    }

    public String toString() {
        throw new UnsupportedOperationException("Không được hỗ trợ!");
    }

    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
