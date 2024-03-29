package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 35
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by UBER Network";
    }
}