package com.vaadin.starter.bakery.backend.data;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.starter.bakery.backend.data.entity.Product;

/**
 * Classe que encapsula os dados exibidos no dashboard da aplicação,
 * incluindo estatísticas de entregas, vendas mensais e entregas por produto.
 */
public class DashboardData {

    /** Estatísticas gerais de entregas. */
    private DeliveryStats deliveryStats;

    /** Lista com o número de entregas realizadas no mês atual. */
    private List<Number> deliveriesThisMonth;

    /** Lista com o número de entregas realizadas no ano atual. */
    private List<Number> deliveriesThisYear;

    /** Matriz com os valores de vendas por mês. */
    private Number[][] salesPerMonth;

    /** Mapa de produtos e a quantidade de entregas realizadas para cada um. */
    private LinkedHashMap<Product, Integer> productDeliveries;

    /**
     * Retorna as estatísticas de entregas.
     *
     * @return estatísticas de entregas
     */
    public DeliveryStats getDeliveryStats() {
        return deliveryStats;
    }

    /**
     * Define as estatísticas de entregas.
     *
     * @param deliveryStats estatísticas de entregas
     */
    public void setDeliveryStats(DeliveryStats deliveryStats) {
        this.deliveryStats = deliveryStats;
    }

    /**
     * Retorna a lista de entregas realizadas no mês atual.
     *
     * @return lista de entregas do mês
     */
    public List<Number> getDeliveriesThisMonth() {
        return deliveriesThisMonth;
    }

    /**
     * Define a lista de entregas realizadas no mês atual.
     *
     * @param deliveriesThisMonth lista de entregas do mês
     */
    public void setDeliveriesThisMonth(List<Number> deliveriesThisMonth) {
        this.deliveriesThisMonth = deliveriesThisMonth;
    }

    /**
     * Retorna a lista de entregas realizadas no ano atual.
     *
     * @return lista de entregas do ano
     */
    public List<Number> getDeliveriesThisYear() {
        return deliveriesThisYear;
    }

    /**
     * Define a lista de entregas realizadas no ano atual.
     *
     * @param deliveriesThisYear lista de entregas do ano
     */
    public void setDeliveriesThisYear(List<Number> deliveriesThisYear) {
        this.deliveriesThisYear = deliveriesThisYear;
    }

    /**
     * Define a matriz de vendas por mês.
     *
     * @param salesPerMonth matriz de vendas mensais
     */
    public void setSalesPerMonth(Number[][] salesPerMonth) {
        this.salesPerMonth = salesPerMonth;
    }

    /**
     * Retorna o vetor de vendas para o mês especificado.
     *
     * @param i índice do mês
     * @return vetor de vendas do mês
     */
    public Number[] getSalesPerMonth(int i) {
        return salesPerMonth[i];
    }

    /**
     * Retorna o mapa de produtos e suas respectivas quantidades de entregas.
     *
     * @return mapa de entregas por produto
     */
    public LinkedHashMap<Product, Integer> getProductDeliveries() {
        return productDeliveries;
    }

    /**
     * Define o mapa de produtos e suas respectivas quantidades de entregas.
     *
     * @param productDeliveries mapa de entregas por produto
     */
    public void setProductDeliveries(LinkedHashMap<Product, Integer> productDeliveries) {
        this.productDeliveries = productDeliveries;
    }

}
