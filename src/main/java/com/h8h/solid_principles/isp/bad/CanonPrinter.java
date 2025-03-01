package com.h8h.solid_principles.isp.bad;

public class CanonPrinter implements IMultiFunction {

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details");
    }

    @Override
    public void scan() {
        // METODO NO IMPLEMENTADO
    }

    @Override
    public void scanPhoto() {
        // METODO NO IMPLEMENTADO
    }

    @Override
    public void fax() {
        // METODO NO IMPLEMENTADO
    }

    @Override
    public void internetFax() {
        // METODO NO IMPLEMENTADO
    }
    
}
