package com.mcforsas.game.engine;

/*
 * Created by MCForsas on 3/16/2019
 * Replace this text by description, of what this code is for please,
 * you will know nothing about this code after you close the ide.
 */
public interface InputListener {
    void touchDown(final int x, final int y);
    void touchUp(final int x, final int y);
    void keyUp(final int keycode);
    void keyDown(final int keycode);
    void mouseMoved(final int x, final int y);
}
