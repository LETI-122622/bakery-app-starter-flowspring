package com.vaadin.starter.bakery.ui.views;

import com.vaadin.flow.component.confirmdialog.ConfirmDialog;

/**
 * Interface para componentes que possuem um {@link ConfirmDialog} associado.
 * Permite definir e obter o diálogo de confirmação utilizado pelo componente.
 */
public interface HasConfirmation {

    /**
     * Define o {@link ConfirmDialog} a ser utilizado pelo componente.
     *
     * @param confirmDialog o diálogo de confirmação a ser associado
     */
    void setConfirmDialog(ConfirmDialog confirmDialog);

    /**
     * Retorna o {@link ConfirmDialog} associado ao componente.
     *
     * @return o diálogo de confirmação atualmente associado
     */
    ConfirmDialog getConfirmDialog();
}
