/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacoteArvoreAVL;

import java.io.PrintStream;

public class AsArveresSomosNozes {

    private Object value;
    private AsArveresSomosNozes left;
    private AsArveresSomosNozes right;

    public AsArveresSomosNozes(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public AsArveresSomosNozes getLeft() {
        return left;
    }

    public void setLeft(AsArveresSomosNozes left) {
        this.left = left;
    }

    public AsArveresSomosNozes getRight() {
        return right;
    }

    public void setRight(AsArveresSomosNozes right) {
        this.right = right;
    }

}


