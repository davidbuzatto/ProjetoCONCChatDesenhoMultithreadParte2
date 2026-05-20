package chatmultithread.gui.comandos;

import chatmultithread.gui.JanelaDesenho;
import java.awt.Color;

/**
 * Comandos para desenho.
 * 
 * @author Prof. Dr. David Buzatto
 */
public abstract class ComandoDesenho {
    
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected Color cor;

    public abstract void desenhar( JanelaDesenho janela );

    public int getX1() {
        return x1;
    }

    public void setX1( int x1 ) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1( int y1 ) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2( int x2 ) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2( int y2 ) {
        this.y2 = y2;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor( Color cor ) {
        this.cor = cor;
    }
    
}
