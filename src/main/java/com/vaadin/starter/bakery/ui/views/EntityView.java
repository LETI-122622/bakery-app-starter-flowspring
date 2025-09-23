package com.vaadin.starter.bakery.ui.views;

import com.vaadin.flow.data.binder.ValidationException;

/**
 * Interface genérica para uma vista do tipo mestre/detalhe destinada a entidades do tipo <code>T</code>.
 * <p>
 * Esta interface define o contrato para uma vista que apresenta uma lista de entidades (parte "mestre")
 * e um diálogo para visualizar ou editar uma única entidade (parte "detalhe"). O diálogo pode operar em dois modos:
 * visualização e edição. A interface prevê ainda mecanismos para mostrar notificações, mensagens de erro
 * e pedidos de confirmação ao utilizador.
 *
 * @param <T> Tipo da entidade gerida pela vista.
 */
public interface EntityView<T> extends HasConfirmation, HasNotifications {

    /**
     * Mostra uma notificação de erro com o texto fornecido.
     *
     * @param message      Mensagem de erro legível para o utilizador.
     * @param isPersistent Se <code>true</code>, a mensagem requer uma ação do utilizador para desaparecer;
     *                     se <code>false</code>, desaparece automaticamente após algum tempo.
     */
    default void showError(String message, boolean isPersistent) {
        showNotification(message, isPersistent);
    }

    /**
     * Indica o estado atual de alterações não guardadas (dirty) no diálogo da entidade.
     *
     * @return <code>true</code> se o diálogo da entidade estiver aberto no modo de edição e existirem alterações por guardar;
     *         <code>false</code> caso contrário.
     */
    boolean isDirty();

    /**
     * Remove a referência à entidade atualmente selecionada e reinicia o estado "dirty".
     * <p>
     * Normalmente invocado ao fechar o diálogo ou ao cancelar edição.
     */
    void clear();

    /**
     * Escreve as alterações efetuadas no diálogo da entidade para a instância da entidade fornecida.
     * <p>
     * Este método utiliza o mecanismo do {@link com.vaadin.flow.data.binder.Binder#writeBean(Object)} para atualizar as propriedades
     * da entidade com os valores do formulário. Se algum valor não for válido ou não puder ser convertido, será lançada uma exceção.
     *
     * @param entity Instância da entidade onde as alterações serão guardadas.
     * @throws ValidationException Caso algum valor introduzido não possa ser convertido ou validado para as propriedades da entidade.
     */
    void write(T entity) throws ValidationException;

    /**
     * Obtém o nome da entidade gerida por esta vista.
     *
     * @return Nome da entidade, geralmente utilizado em notificações.
     */
    String getEntityName();

    /**
     * Mostra uma notificação informando que uma nova entidade foi criada.
     */
    default void showCreatedNotification() {
        showNotification(getEntityName() + " was created");
    }

    /**
     * Mostra uma notificação informando que uma entidade foi atualizada.
     */
    default void showUpdatedNotification() {
        showNotification(getEntityName() + " was updated");
    }

    /**
     * Mostra uma notificação informando que uma entidade foi eliminada.
     */
    default void showDeletedNotification() {
        showNotification(getEntityName() + " was deleted");
    }
}