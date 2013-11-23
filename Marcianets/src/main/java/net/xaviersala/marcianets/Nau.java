package net.xaviersala.marcianets;

import java.awt.Image;

/**
 * Classe pensada per representar els objectes mòbils.
 *
 * @author xavier
 *
 */
public abstract class Nau extends CosaMobil {

    /**
     * Construeix una nau a partir de la seva imatge.
     * @param img imatge.
     */
    public Nau(final Image img) {
        super(img);
        inicialitza();
    }

    /**
     * Construeix una nau i  la posa a un lloc determinat.
     * @param img imatge
     * @param x posició x
     * @param y posició y
     */
    public Nau(final Image img, final double x, final double y) {
        super(img, x, y);
        inicialitza();
    }

    /**
     * Inicialitza el tipus d'objecte (crec que no serveix per res).
     */
    private void inicialitza() {
        setTipus("Nau");

    }

    /**
     * Indica que han tocat la nau.
     * @return Han tocat la nau o no
     */
    @Override
    public boolean tocat() {
         setVelocitat(0);
         getImatge().setVisible(false);
         setMort(true);
         return true;
    }

    /**
     * Les naus normalment han de disparar.
     */
    public abstract void dispara();

    /**
     * La nau es mou.
     */
    public void mou() {
        super.mou();
    }

}
